package com.app.survey.repository;

import com.app.survey.entity.Rating;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "ratingRepository")
public interface RatingRepository extends JpaRepository<Rating,Long>{

}
