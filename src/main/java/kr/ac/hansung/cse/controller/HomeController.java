package kr.ac.hansung.cse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller //이 밑부분은 bean으로 등록이 된다.
public class HomeController {

    //private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private static final Logger logger = LoggerFactory.getLogger("kr.ac.hansung.controller.HomeController");


//    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/") //위 주석처리된부분과 같은 말이다.
    public String home(HttpServletRequest request) {

//        String url = request.getRequestURL().toString();
//        String clientIPaddr = request.getRemoteAddr();
//
//        logger.info("Request URL: {}, Client IP: {}", url, clientIPaddr);

        return "home";
    }
}


