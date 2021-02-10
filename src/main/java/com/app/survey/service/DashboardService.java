package com.app.survey.service;

import com.app.survey.entity.Rating;

import java.util.List;

public interface DashboardService {
    //service implementations MUST use abstract methods below
    List<Rating>getAllRating();
    void addRating(Rating rating);
}
