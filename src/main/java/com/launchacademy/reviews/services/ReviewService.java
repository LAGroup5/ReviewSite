package com.launchacademy.reviews.services;


import com.launchacademy.reviews.models.Review;
import com.launchacademy.reviews.repositories.ReviewRepository;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

  private ReviewRepository reviewRepository;

  @Autowired
  public ReviewService(ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  public Review addReview(Map<String, String> review) {
    Review newReview = new Review();
    newReview.setReviewerName(review.get("reviewerName"));
    newReview.setReview(review.get("review"));
    newReview.setStarRating(Integer.parseInt(review.get("starRating")));
    return reviewRepository.save(newReview);
  }
}