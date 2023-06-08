package com.spring.shorturl.controller;

import com.spring.shorturl.service.ShortService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShortController {
    private final ShortService shortService = new ShortService();

    @RequestMapping("/")
    public String index(String shortUrl, String originUrl){
        return "/index";
    }

    @RequestMapping(value="/make-short", method=RequestMethod.POST)
    public String makeShort(Model model, String originUrl){
        shortService.makeShort(originUrl);

        model.addAttribute("shortUrl", shortService.findShort(originUrl));
        model.addAttribute("originUrl", originUrl);
        model.addAttribute("visitCount", shortService.getVisitCount(originUrl));

        return "/index";
    }

    @RequestMapping("/short/")
    public String backToIndex(){
        return "/index";
    }

    @RequestMapping("/short/{shortUrl}")
    public String linkShort(@PathVariable String shortUrl){
        String url = shortService.findOrigin(shortUrl);
        return "redirect:" + url;
    }
}
