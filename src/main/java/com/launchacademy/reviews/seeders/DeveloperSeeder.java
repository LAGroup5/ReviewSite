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
        "Hi, I'm Ashlyn and I am a Software developer\n"
        +"with a passion for creating programs that have\n"
        +"practical life applications and relieve some of\n"
        +"the burden of business for small business.\n"
        +"Years of being in the customer service industry\n"
        +"make me a great asset when it comes to consumer\n"
        +"relations, troubleshooting, communication and\n"
        +"customer-focused service.\n"
        +"Experience in Java, JavaScript, HTML, CSS, SQL,\n"
        +"React, Android development."

    );
    developerList.add(ashlyn);

    Developer steve = new Developer(
        "Steve Taylor",
        "https://i.postimg.cc/Gh5QRqfN/Steve300.png",
        "Steve is experienced with working on large software\n"
         +"projects. His passion is in identifying and removing\n"
         +"bottlenecks and inefficiencies through debugging,\n"
        +"monitoring and troubleshooting. He is looking forward\n"
        +"to the next challenge to tackle!"
    );
    developerList.add(steve);

    Developer paul = new Developer(
        "Paul Ritzman",
        "https://i.postimg.cc/RhCRS84r/Paul300.jpg",
        "Paul is an experienced software developer,\n"
         +"experienced in automation, and always willing to tackle\n"
         +"new challenges."
    );
    developerList.add(paul);

    Developer ami = new Developer(
        "Ami Drammeh",
        "https://i.postimg.cc/vHBzCp0f/Ami300.png",
        "Ami here! I am a software developer who is passionate\n"
         +"aboutlearning,constantly improving my skills and\n"
         +"community building. I have a positive mindset and love\n"
         +"bringing creativity to technology."

    );
    developerList.add(ami);

    Developer sina = new Developer(
        "Sinafikesh Mitiku",
        "https://i.postimg.cc/RFLdz9rQ/Sina300.jpg",
        "I am Sina, a technology professional working as a Software\n"
         +"Developer, experienced in SQL, relational databases and\n"
         +"Business Intelligence and I am passionate about data."
    );
    developerList.add(sina);

    if (developerService.findAll().size() == 0) {
      developerList.forEach(developer -> developerService.save(developer));
    }

  }
}
