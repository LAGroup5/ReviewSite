package com.launchacademy.reviews.seeders;

import com.launchacademy.reviews.models.Review;
import com.launchacademy.reviews.models.Trail;
import com.launchacademy.reviews.services.ReviewService;
import com.launchacademy.reviews.services.TrailService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TrailSeeder implements CommandLineRunner {
  private TrailService trailService;
  private ReviewService reviewService;

  @Autowired
  public TrailSeeder(TrailService trailService, ReviewService reviewService) {
    this.trailService = trailService;
    this.reviewService = reviewService;
  }

  public void run(String... args) throws Exception {
    seedTrailsTable();
    seedReviewsTable();
  }

  private void seedTrailsTable() {
    List<Trail> trails = new ArrayList<>();

    Trail interurbanTrail = new Trail(
        "Interurban Trail",
        1,
        "Spanning multiple counties across the state of Washington, this trail is perfect for light bicycling and jogging.",
        24,
        100,
        false,
        true,
        true
//      String[] { "Garbage", "Restrooms", "Playground", "Public Transit Access" }
    );
    trails.add(interurbanTrail);

    Trail bigGulch = new Trail(
        "Big Gulch",
        2,
        "The forested trails at Big Gulch offer a great respite from the town of Mukilteo.",
        3,
        300,
        false,
        true,
        true
//        new String[] { "Garbage", "Public Transit Access" }
    );
    trails.add(bigGulch);

    Trail greenLanternTrail = new Trail(
        "Green Lantern Trail",
        1,
        "The Green Lantern Trail mostly follows the shores of Silver Lake in South Everett, " +
            "perfect for those looking to stretch their legs and experience the outdoors without having to leave the city.",
        3,
        33,
        false,
        true,
        true
//        new String[] { "Garbage", "Restrooms", "Playground", "Beach", "Public Transit Access" }
    );
    trails.add(greenLanternTrail);

    if (trailService.findAll().size() == 0) {
      trails.forEach(trail -> trailService.save(trail));
    }
  }

  private void seedReviewsTable() {
    List<Review> reviews = new ArrayList<>();

    Review interUrbanTrailReview1 = new Review();
    interUrbanTrailReview1.setReviewerName("Bob Boberson");
    interUrbanTrailReview1.setStarRating(5);
    interUrbanTrailReview1.setBody("Very relaxing, I tell all my family and friends to come here.");
    interUrbanTrailReview1.setTrail(trailService.findByName("Interurban Trail"));
    reviews.add(interUrbanTrailReview1);

    Review interUrbanTrailReview2 = new Review();
    interUrbanTrailReview2.setReviewerName("Angry Karen");
    interUrbanTrailReview2.setStarRating(1);
    interUrbanTrailReview2.setBody("Ugh, the food here was terrible. And when I asked to speak to a manager, they said he was busy! The nerve!");
    interUrbanTrailReview2.setTrail(trailService.findByName("Interurban Trail"));
    reviews.add(interUrbanTrailReview2);

    Review bigGulchReview1 = new Review();
    bigGulchReview1.setReviewerName("bRiAn DoWlInG");
    bigGulchReview1.setStarRating(4);
    bigGulchReview1.setBody("bIg GuLcH? i ThOuGhT yOu SaId BiG gUlP");
    bigGulchReview1.setTrail(trailService.findByName("Big Gulch"));
    reviews.add(bigGulchReview1);

    if (reviewService.findAll().size() == 0) {
      reviews.forEach(review -> reviewService.save(review));
    }
  }
}