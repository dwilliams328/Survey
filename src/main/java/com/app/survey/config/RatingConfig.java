package com.app.survey.config;

import com.app.survey.entity.Rating;
import com.app.survey.repository.RatingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RatingConfig {

    @Bean
    CommandLineRunner commandLineRunner(RatingRepository repository){
        return args -> {
          Rating three = new Rating("three");
            Rating two = new Rating("two");

            repository.saveAll(List.of(three,two));
        };
    }
}
