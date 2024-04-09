package kr.ac.hansung.cse.controller;

import kr.ac.hansung.cse.model.Offer;
import kr.ac.hansung.cse.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
