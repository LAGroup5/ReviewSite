package com.launchacademy.reviews.services;


import com.launchacademy.reviews.models.Review;
import com.launchacademy.reviews.models.Trail;
import com.launchacademy.reviews.repositories.ReviewRepository;
import java.util.List;
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
    newReview.setBody(review.get("review"));
    newReview.setStarRating(Integer.parseInt(review.get("starRating")));
    return this.reviewRepository.save(newReview);
  }

  public List<Review> findAll() {
    return (List<Review>) this.reviewRepository.findAll();
  }

  public List<Review> findAllByTrailId(Integer id) {
    return this.reviewRepository.findAllByTrailId(id);
  }

  public void save(Review review) {
    this.reviewRepository.save(review);
  }
}