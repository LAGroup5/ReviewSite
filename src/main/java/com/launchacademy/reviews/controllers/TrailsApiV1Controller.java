package com.launchacademy.reviews.controllers;
import com.launchacademy.reviews.models.Developer;
import com.launchacademy.reviews.models.Review;
import com.launchacademy.reviews.models.Trail;
import com.launchacademy.reviews.services.DeveloperService;
import com.launchacademy.reviews.services.ReviewService;
import com.launchacademy.reviews.services.TrailService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1")
public class TrailsApiV1Controller {
  private TrailService trailService;
  private ReviewService reviewService;
  private DeveloperService developerService;
  @Autowired
  public TrailsApiV1Controller (TrailService trailService, ReviewService reviewService, DeveloperService developerService){
    this.trailService = trailService;
    this.reviewService = reviewService;
    this.developerService = developerService;
  }
  @GetMapping("/trails")
  public List<Trail> getTrails() {
    return trailService.findAll();
  }

  @GetMapping("/trails/{id}")
  public Trail getTrail(@PathVariable Integer id) {
    return trailService.findById(id);
  }

  @GetMapping("/aboutUs")
  public List<Developer> getDevelopers() {
    return developerService.findAll();
  }

  @GetMapping("/trails/{id}/all-reviews")
  public List<Review> getTrailReviews(@PathVariable Integer id) {
    return reviewService.findAllByTrailId(id);
  }

  @PostMapping("/trails/{trailId}/review")
  public Review addReview(@PathVariable Integer trailId, @RequestBody Map<String, String> review) {
    return reviewService.addReview(trailId, review);
  }
}