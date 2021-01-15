package com.app.survey.service.impl;

import com.app.survey.entity.Rating;
import com.app.survey.repository.RatingRepository;
import com.app.survey.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    RatingRepository ratingRepository;

    public List<Rating> getAllRating(){
        return ratingRepository.findAll();
    }

    @Override
    public void addRating(Rating rating) {
        ratingRepository.save(rating);
    }
}
