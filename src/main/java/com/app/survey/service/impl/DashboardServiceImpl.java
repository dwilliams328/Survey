package com.app.survey.service.impl;

import com.app.survey.entity.Rating;
import com.app.survey.repository.RatingRepository;
import com.app.survey.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    RatingRepository ratingRepository;

    public List<Rating> getAllRating(){
        return ratingRepository.findAll();
    }

    public void addRating(Rating rating) {
        ratingRepository.save(rating);
    }

    public void deleteRating(Long id) {
        boolean exists = ratingRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("rating id " + id + "  does not exist!");
        }
        ratingRepository.deleteById(id);
    }

    //@Transactional Spring Boot Annotation - Handles DB begin & commit transactions and rollback when Exception met
    @Transactional
    public void updateRating(Long id, String ratingParam) {
        Rating rating = ratingRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(
                        "rating id " + id +"does not exist!"));
        if(ratingParam != null && ratingParam.length() > 0 &&
                !Objects.equals(rating.getRating(),ratingParam)){
            rating.setRating(ratingParam);
        }
    }
}
