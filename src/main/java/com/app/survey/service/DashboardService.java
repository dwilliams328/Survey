package com.app.survey.service;

import com.app.survey.entity.Rating;

import java.util.List;

public interface DashboardService {

    List<Rating>getAllRating();
    void addRating(Rating rating);
}
