package com.app.survey.controller;

import com.app.survey.entity.Rating;
import com.app.survey.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RatingController {
    @Autowired
    DashboardService dashboardService;

    @GetMapping("/")
    public String home(ModelMap model){

        model.addAttribute("allRating",dashboardService.getAllRating());

        return "index";

    }

}
