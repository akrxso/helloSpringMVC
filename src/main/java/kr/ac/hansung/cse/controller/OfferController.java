package kr.ac.hansung.cse.controller;

import kr.ac.hansung.cse.model.Offer;
import kr.ac.hansung.cse.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
//bean으로 등록
public class OfferController {
    //Controller -> Service ->DAO
    @Autowired
    private OfferService offerService;

    @GetMapping("/offers")
    public String showOffers(Model model)
    {
        List<Offer> offers = offerService.getAllOffers(); //모든 offer가져와
        model.addAttribute("id_offers",offers); //model에 저장해
        return "offers";
    }

    @GetMapping("/createoffer")
    public String createOffer(Model model) {

        model.addAttribute("offer", new Offer());

        return "createoffer";
    }

    @PostMapping("/docreate")
        public String doCreate(Model model, @Valid Offer offer, BindingResult result)
        {
            if(result.hasErrors())
            {
                System.out.println("== error ==");
                List<ObjectError> errors = result.getAllErrors();

                for(ObjectError error : errors)
                {
                    System.out.println(error.getDefaultMessage()); //각각 error 받음
                }
                return "createoffer";
            }
            //System.out.println(offer);
            //데이터베이스에 저장
            //controller -> service -> Dao
            offerService.insert(offer);
            return "offercreated"; //view쪽으로 넘어가기
        }
}
