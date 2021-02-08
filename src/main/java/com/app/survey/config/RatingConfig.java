package com.app.survey.config;

import com.app.survey.entity.Rating;
import com.app.survey.repository.RatingRepository;
import com.app.survey.service.impl.DashboardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RatingConfig implements CommandLineRunner{

    DashboardServiceImpl repository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello from CommandLine");

        commandLineRunner(repository);

    }

    CommandLineRunner commandLineRunner(DashboardServiceImpl repository){
        return args -> {Rating two = new Rating("Two");
                        Rating three = new Rating("Three");

                        repository.addRating(two);
                        repository.addRating(three);
        };
    }
}
