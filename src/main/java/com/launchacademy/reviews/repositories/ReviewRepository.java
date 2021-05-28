package com.launchacademy.reviews.repositories;

import com.launchacademy.reviews.models.Review;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
  public List<Review> findAllByTrailId(Integer id);
}
