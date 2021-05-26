package com.launchacademy.reviews.services;


import com.launchacademy.reviews.models.Review;
import com.launchacademy.reviews.models.Trail;
import com.launchacademy.reviews.repositories.ReviewRepository;
import com.launchacademy.reviews.repositories.TrailRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

  private ReviewRepository reviewRepository;
  private TrailRepository trailRepository;
  private TrailService trailService;

  @Autowired
  public ReviewService(ReviewRepository reviewRepository, TrailRepository trailRepository, TrailService trailService) {
    this.reviewRepository = reviewRepository;
    this.trailRepository= trailRepository;
    this.trailService= trailService;
  }

  public Review addReview(Integer trailId, Map<String, String> review) {
    Review newReview = new Review();
    newReview.setReviewerName(review.get("reviewerName"));
    newReview.setBody(review.get("body"));
    newReview.setStarRating(Integer.parseInt(review.get("starRating")));
    newReview.setTrail(trailService.findById(trailId));
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