package com.launchacademy.reviews.seeders;
import com.launchacademy.reviews.models.Trail;
import com.launchacademy.reviews.services.TrailService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TrailSeeder implements CommandLineRunner {
  private TrailService trailService;
  @Autowired
  public TrailSeeder(TrailService trailService) {
    this.trailService = trailService;
  }
  public void run(String... args) throws Exception {
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
}