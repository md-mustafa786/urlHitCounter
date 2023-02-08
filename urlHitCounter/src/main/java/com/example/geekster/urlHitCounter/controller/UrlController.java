package com.example.geekster.urlHitCounter.controller;


import com.example.geekster.urlHitCounter.model.Visit;
import com.example.geekster.urlHitCounter.service.UrlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitors-count")
public class UrlController {
    private UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }
    @GetMapping("/username/{username}/count")
    public Visit getVisits(@PathVariable String username){
        Visit visit = urlService.getVisits(username);
        return visit;
    }
}
