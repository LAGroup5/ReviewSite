package com.launchacademy.reviews.controllers;
import com.launchacademy.reviews.models.Trail;
import com.launchacademy.reviews.services.ReviewService;
import com.launchacademy.reviews.services.TrailService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1")
public class TrailsApiV1Controller {
  private TrailService trailService;
  private ReviewService reviewService;
  @Autowired
  public TrailsApiV1Controller (TrailService trailService, ReviewService reviewService) {
    this.trailService = trailService;
    this.reviewService = reviewService;
  }
  @GetMapping("/trails")
  public List<Trail> getTrails() {
    return trailService.findAll();
  }
//  @GetMapping("/trails/{id}")
//  public List<Trail> getTrails(@PathVariable String id) {
//    return trailService.findTrail(id);
//  }
//
//  @PostMapping("/trails/{id}/new")
//  public void addReview(@RequestBody Map<String, String> reviewMap) {
//    return reviewService.addReview(reviewMap);
//  }
}