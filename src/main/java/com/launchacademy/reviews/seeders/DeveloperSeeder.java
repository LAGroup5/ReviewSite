package com.launchacademy.reviews.seeders;


import com.launchacademy.reviews.models.Developer;
import com.launchacademy.reviews.services.DeveloperService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DeveloperSeeder implements CommandLineRunner {

  private DeveloperService developerService;

  @Autowired
  public DeveloperSeeder(DeveloperService developerService) {
    this.developerService = developerService;
  }

  public void run(String... args) throws Exception {
    List<Developer> developerList = new ArrayList<>();

    Developer ashlyn = new Developer(
        "Ashlyn Morin",
        "https://i.postimg.cc/QC6qHbdF/Ashlyn300.jpg",
        "Hi, I'm Ashlyn and I am a Software developer with a passion for creating programs that have practical life applications and relieve some of the burden of business for small business. Years of being in the customer service industry make me a great asset when it comes to consumer relations, troubleshooting, communication and customer-focused service. Experience in Java, JavaScript, HTML, CSS, SQL, React, Android development."
    );
    developerList.add(ashlyn);

    Developer steve = new Developer(
        "Steve Taylor",
        "https://i.postimg.cc/Gh5QRqfN/Steve300.png",
        "blah"
    );
    developerList.add(steve);

    Developer paul = new Developer(
        "Paul",
        "https://i.postimg.cc/RhCRS84r/Paul300.jpg",
        "blah"
    );
    developerList.add(paul);

    Developer ami = new Developer(
        "Ami Drammeh",
        "https://i.postimg.cc/vHBzCp0f/Ami300.png",
        "blah"
    );
    developerList.add(ami);

    Developer sina = new Developer(
        "Sinafikesh Mitiku",
        "https://i.postimg.cc/RFLdz9rQ/Sina300.jpg",
        "blah"
    );
    developerList.add(sina);

    if (developerService.findAll().size() == 0) {
      developerList.forEach(developer -> developerService.save(developer));
    }

  }
}
