package com.app.survey.controller;

import com.app.survey.entity.Rating;
import com.app.survey.service.DashboardService;
import com.app.survey.service.impl.DashboardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    DashboardServiceImpl dashboardServiceImpl;

    @GetMapping("/")
    public List<Rating> getRating(){
        return dashboardServiceImpl.getAllRating();
    }

    @PostMapping
    public void addRating(@RequestBody Rating rating){
        dashboardServiceImpl.addRating(rating);
    }

    @DeleteMapping(path = "{id}")
    public void deleteRating(@PathVariable("id") Long id ){
        dashboardServiceImpl.deleteRating(id);
    }
}
