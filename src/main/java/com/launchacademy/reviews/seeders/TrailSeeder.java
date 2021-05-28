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

    Trail lake22Trail = new Trail(
        "Lake 22 Trail",
        2,
        "Lake 22 Trail is a 5.8 mile heavily trafficked loop trail located near Granite Falls, Washington that features a waterfall and is rated as moderate. The trail is primarily used for hiking, running, nature trips, and snowshoeing and is best used from May until November.",
        6,
        1473,
        true,
        true,
        true
    );
    trails.add(lake22Trail);

    Trail heatherLakeTrail = new Trail(
        "Heather Lake Trail",
        2,
        "Heather Lake Trail is a 4.3 mile heavily trafficked out and back trail located near Granite Falls, Washington that features a lake and is rated as moderate. The trail is primarily used for hiking and snowshoeing and is best used from May until November.",
        4,
        1187,
        true,
        true,
        true
    );
    trails.add(heatherLakeTrail);

    Trail mountPilchuck = new Trail(
        "Mount Pilchuck Trail",
        3,
        "Mount Pilchuck Trail is a 6 mile heavily trafficked out and back trail located near Granite Falls, Washington that features beautiful wild flowers and is rated as difficult. The trail is primarily used for hiking, running, nature trips, and snowshoeing and is best used from June until October.",
        6,
        2125,
        true,
        true,
        true
    );
    trails.add(mountPilchuck);

    Trail limeKiln = new Trail(
        "Lime Kiln Trail",
        2,
        "Lime Kiln Trail is a 6.7 mile heavily trafficked out and back trail located near Granite Falls, Washington that features a river and is rated as moderate. The trail offers a number of activity options and is accessible year-round.",
        7,
        918,
        false,
        true,
        true
    );
    trails.add(limeKiln);

    Trail robeCanyon = new Trail(
        "Robe Canyon Trail",
        2,
        "Robe Canyon Historic Trail is a 2.4 mile heavily trafficked out and back trail located near Granite Falls, Washington that features a waterfall and is rated as moderate. The trail offers a number of activity options and is best used from March until November.",
        3,
        288,
        false,
        true,
        true
    );
    trails.add(robeCanyon);

    Trail PinnacleLake = new Trail(
        "Pinnacle Lake Trail",
        2,
        "Pinnacle Lake Trail is a 4.2 mile out and back trail located near Granite Falls, Washington that features a lake and is rated as moderate. The trail is primarily used for hiking.",
        4,
        1272,
        true,
        true,
        true
    );
    trails.add(PinnacleLake);

    Trail bridalVeilLakeSerene = new Trail(
        "Bridal Veil Falls and Lake Serene",
        3,
        "Bridal Veil Falls and Lake Serene is a 7.4 mile heavily trafficked out and back trail located near Gold Bar, Washington that features a lake and is rated as difficult. The trail is primarily used for hiking.",
        8,
        2709,
        true,
        true,
        true
    );
    trails.add(bridalVeilLakeSerene);

    Trail wallaceFalls = new Trail(
        "Wallace Falls Trail",
        2,
        "Wallace Falls Trail is a 5 mile heavily trafficked out and back trail located near Gold Bar, Washington that features a waterfall and is rated as moderate. The trail is primarily used for hiking and is best used from May until October.",
        5,
        1482,
        true,
        true,
        true
    );
    trails.add(wallaceFalls);

    Trail blancaLake = new Trail(
        "Blanca Lake Trail",
        3,
        "Blanca Lake Trail is a 7 mile heavily trafficked out and back trail located near Gold Bar, Washington that features a lake and is rated as difficult. The trail is primarily used for hiking, camping, and backpacking and is best used from June until October.",
        7,
        3372,
        true,
        true,
        true
    );
    trails.add(blancaLake);

    Trail heybrookLookout = new Trail(
        "Heybrook Lookout Trail",
        2,
        "Heybrook Lookout Trail is a 2.6 mile heavily trafficked out and back trail located near Index, Washington that offers the chance to see wildlife and is rated as moderate. The trail is primarily used for hiking and nature trips and is accessible year-round.",
        3,
        912,
        true,
        true,
        true
    );
    trails.add(heybrookLookout);

    Trail goatLake = new Trail(
        "Goat Lake Trail",
        2,
        "Goat Lake Trail is a 10.5 mile heavily trafficked loop trail located near Darrington, Washington that features a lake and is rated as moderate. The trail is primarily used for hiking, camping, and backpacking and is best used from May until October.",
        11,
        1722,
        true,
        true,
        true
    );
    trails.add(goatLake);

    Trail gothicBasin = new Trail(
        "Gothic Basin Trail",
        3,
        "Gothic Basin Trail is a 12.5 mile heavily trafficked out and back trail located near Granite Falls, Washington that features a lake and is only recommended for very experienced adventurers. The trail is primarily used for hiking, camping, and backpacking and is best used from June until October.",
        13,
        3284,
        true,
        true,
        true
    );
    trails.add(gothicBasin);

    Trail bigFourIceCaves = new Trail(
        "Big Four Ice Caves Trail",
        1,
        "Big Four Ice Caves Trail is a 3.2 mile heavily trafficked out and back trail located near Granite Falls, Washington that features a waterfall and is good for all skill levels. The trail offers a number of activity options and is best used from May until October..",
        3,
        488,
        true,
        true,
        true
    );
    trails.add(bigFourIceCaves);

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

    Review lake22TrailReview1 = new Review();
    lake22TrailReview1.setReviewerName("Sara Maxwell");
    lake22TrailReview1.setStarRating(5);
    lake22TrailReview1.setBody("Awesome hike. Snow at the lake and wet trail so wear waterproof shoes. So stunning.");
    lake22TrailReview1.setTrail(trailService.findByName("Lake 22 Trail"));
    reviews.add(lake22TrailReview1);

    Review lake22TrailReview2 = new Review();
    lake22TrailReview2.setReviewerName("Richard Wu");
    lake22TrailReview2.setStarRating(5);
    lake22TrailReview2.setBody("Rocky but lake is gorgeous!");
    lake22TrailReview2.setTrail(trailService.findByName("Lake 22 Trail"));
    reviews.add(lake22TrailReview2);

    Review lake22TrailReview3 = new Review();
    lake22TrailReview3.setReviewerName("Terri Jo");
    lake22TrailReview3.setStarRating(5);
    lake22TrailReview3.setBody("Beautiful!!! Chilly at the top, still some packed snow.");
    lake22TrailReview3.setTrail(trailService.findByName("Lake 22 Trail"));
    reviews.add(lake22TrailReview3);

    Review lake22TrailReview4 = new Review();
    lake22TrailReview4.setReviewerName("Tess Hutchins");
    lake22TrailReview4.setStarRating(5);
    lake22TrailReview4.setBody("One of the best hikes I’ve been on. I did it in tennis shoes and was fine. A little icy at the top but it’s packed down and short. The view is well worth the effort. There is one really muddy spot where you have to use a rope to go up and I slid but it was funny. This is a very dynamic trail with creeks, trees, snow, etc. I definitely recommend.");
    lake22TrailReview4.setTrail(trailService.findByName("Lake 22 Trail"));
    reviews.add(lake22TrailReview4);

    Review lake22TrailReview5 = new Review();
    lake22TrailReview5.setReviewerName("Elijah Gilmer");
    lake22TrailReview5.setStarRating(4);
    lake22TrailReview5.setBody("Great hike. Pretty easy, great for those who want an easy hike or are just getting into it! Slightly muddy at the top and there’s still some icy snow, lake is 80% frozen over.");
    lake22TrailReview5.setTrail(trailService.findByName("Lake 22 Trail"));
    reviews.add(lake22TrailReview5);

    Review heatherLake1 = new Review();
    heatherLake1.setReviewerName("Paige Rappleye");
    heatherLake1.setStarRating(5);
    heatherLake1.setBody("the pot holes are big and plentiful before the parking lot, but its very doable if you have decent clearance on your car. the trail is very wet with lots of little stream crossings. there is some snow at the lake, but you don't need any gear for it. the loop around the lake is passable, but be careful! you cross melting snow fields that are very unpredictable. some spots are still 3 feet deep. overall so beautiful and we loved it. ");
    heatherLake1.setTrail(trailService.findByName("Heather Lake Trail"));
    reviews.add(heatherLake1);

    Review heatherLake2 = new Review();
    heatherLake2.setReviewerName("Shauna Luckey");
    heatherLake2.setStarRating(5);
    heatherLake2.setBody("Beautiful all the way to the top, so much to see on the trail, still snow about the last 1/4 mile before the lake");
    heatherLake2.setTrail(trailService.findByName("Heather Lake Trail"));
    reviews.add(heatherLake2);

    Review heatherLake3 = new Review();
    heatherLake3.setReviewerName("Anupama Moorthy");
    heatherLake3.setStarRating(4);
    heatherLake3.setBody("moderate hike , wet muddy and snow at the last portion. hiking shoes n poles where enough to get thru..beautiful lake reflections are breathtaking. Drive suv to the trail head as there are potholes at the end. very less parking spots. you can park on side where potholes starts and walk to the trailhead too.");
    heatherLake3.setTrail(trailService.findByName("Heather Lake Trail"));
    reviews.add(heatherLake3);

    Review heatherLake4 = new Review();
    heatherLake4.setReviewerName("Connie C");
    heatherLake4.setStarRating(5);
    heatherLake4.setBody("It was fun to walk on the snow around the lake. A pole would be much more helpful");
    heatherLake4.setTrail(trailService.findByName("Heather Lake Trail"));
    reviews.add(heatherLake4);

    Review heatherLake5 = new Review();
    heatherLake5.setReviewerName("David Bak");
    heatherLake5.setStarRating(5);
    heatherLake5.setBody("Last 1/3 of a mile was snow. Did not need spikes or poles.");
    heatherLake5.setTrail(trailService.findByName("Heather Lake Trail"));
    reviews.add(heatherLake5);

    Review mtPilchuck1 = new Review();
    mtPilchuck1.setReviewerName("IG: fit._.garage");
    mtPilchuck1.setStarRating(5);
    mtPilchuck1.setBody("Road is still closed at Heather Lake trailhead. Decided to come back when it opens back up.");
    mtPilchuck1.setTrail(trailService.findByName("Mount Pilchuck Trail"));
    reviews.add(mtPilchuck1);

    Review mtPilchuck2 = new Review();
    mtPilchuck2.setReviewerName("Foua Khang");
    mtPilchuck2.setStarRating(5);
    mtPilchuck2.setBody("The drive up sucked. Crazy potholes. You’re good if you have a truck. Besides that, the hike was awesome! ");
    mtPilchuck2.setTrail(trailService.findByName("Mount Pilchuck Trail"));
    reviews.add(mtPilchuck2);

    Review mtPilchuck3 = new Review();
    mtPilchuck3.setReviewerName("Maya Gutenkauf");
    mtPilchuck3.setStarRating(4);
    mtPilchuck3.setBody("Went summer of 2020. Roads in were barely drivable in my Hyundai Elantra. Large pot holes. Took an hour navigating each way. The hike has stunning views! ");
    mtPilchuck3.setTrail(trailService.findByName("Mount Pilchuck Trail"));
    reviews.add(mtPilchuck3);

    Review mtPilchuck4 = new Review();
    mtPilchuck4.setReviewerName("Matt Gruber");
    mtPilchuck4.setStarRating(5);
    mtPilchuck4.setBody("Road closed at Heather Lake TH. Hiked the 6 miles up from there to Pilchuck TH. Most of it is snow-covered; worst postholing was 1-2 ft. Actual Pilchuck Trail is extremely snow-covered and we turned back pretty quick.");
    mtPilchuck4.setTrail(trailService.findByName("Mount Pilchuck Trail"));
    reviews.add(mtPilchuck4);

    Review mtPilchuck5 = new Review();
    mtPilchuck5.setReviewerName("shadow behr");
    mtPilchuck5.setStarRating(5);
    mtPilchuck5.setBody("Gate was closed. Ended up being 18 miles total. Was a long day, very deep snow, but so worth it. Be prepared and in good physical shape or feel free to opt out and come back in summer when the gate is open and trail is packed. ");
    mtPilchuck5.setTrail(trailService.findByName("Mount Pilchuck Trail"));
    reviews.add(mtPilchuck5);

    Review lkt1 = new Review();
    lkt1.setReviewerName("sydney platt");
    lkt1.setStarRating(2);
    lkt1.setBody("Now I know why it’s a running trail- nothing to see. Trail was muddy and lots of overgrowth. Railroad trail was completely gone. Tons of bugs but a decent amount of wild flowers.");
    lkt1.setTrail(trailService.findByName("Lime Kiln Trail"));
    reviews.add(lkt1);

    Review lkt2 = new Review();
    lkt2.setReviewerName("Paul Rozek");
    lkt2.setStarRating(5);
    lkt2.setBody("Was raining so everything was a bit wet and muddy.  Not too bad to traverse in decent hiking boots.  it was a great trail to jog in the rain!  Nice inclines but nothing unmanageable.");
    lkt2.setTrail(trailService.findByName("Lime Kiln Trail"));
    reviews.add(lkt2);

    Review lkt3 = new Review();
    lkt3.setReviewerName("James Osborn");
    lkt3.setStarRating(4);
    lkt3.setBody("Great trail for a rainy day");
    lkt3.setTrail(trailService.findByName("Lime Kiln Trail"));
    reviews.add(lkt3);

    Review lkt4 = new Review();
    lkt4.setReviewerName("Sam Graff");
    lkt4.setStarRating(3);
    lkt4.setBody("Nice trail and the kiln adds a unique factor. But it’s quite buggy and has some uphill sections to get back to the trailhead which isn’t ideal as you push 7 miles.");
    lkt4.setTrail(trailService.findByName("Lime Kiln Trail"));
    reviews.add(lkt4);

    Review lkt5 = new Review();
    lkt5.setReviewerName("Jeannie Page");
    lkt5.setStarRating(4);
    lkt5.setBody("Perfect day at Lime Kiln. Just a little bit of mud here and there. Lovely hike with great sounds of the river. ");
    lkt5.setTrail(trailService.findByName("Lime Kiln Trail"));
    reviews.add(lkt5);

    Review rct1 = new Review();
    rct1.setReviewerName("Terri Norris");
    rct1.setStarRating(3);
    rct1.setBody("Lots of downed trees to climb over. Moderate traffic and dogs. Great river views");
    rct1.setTrail(trailService.findByName("Robe Canyon Trail"));
    reviews.add(rct1);

    Review rct2 = new Review();
    rct2.setReviewerName("Melissa Whiting");
    rct2.setStarRating(5);
    rct2.setBody("Great trail with the kids! Lots of cool plants along the way and rocks and little waterfalls at the end.");
    rct2.setTrail(trailService.findByName("Robe Canyon Trail"));
    reviews.add(rct2);

    Review rct3 = new Review();
    rct3.setReviewerName("Andrea Hartman");
    rct3.setStarRating(4);
    rct3.setBody("You walk through shallow water and mud the whole time so not for those who expect clothes and shoes to stay clean. But what a gem. We saw the wide, whitewater river often. At the end, there are some bits of train track remains and small waterfalls. Though easy because it is short and low elevation, it was a fun challenge climbing over and under. Only passed 4 other people on a Tuesday. ");
    rct3.setTrail(trailService.findByName("Robe Canyon Trail"));
    reviews.add(rct3);

    Review rct4 = new Review();
    rct4.setReviewerName("Alanna Davis");
    rct4.setStarRating(5);
    rct4.setBody("Great trail- very muddy with LOTS of downed trees next to the river! Went to the waterfalls and stopped in accordance with the posted signs. Got there about 10:45ish and saw a few hikers on the way in, but passed a lot more with kids and dogs on the way out! Great day for hiking!");
    rct4.setTrail(trailService.findByName("Robe Canyon Trail"));
    reviews.add(rct4);

    Review rct5 = new Review();
    rct5.setReviewerName("Sandra Albertson");
    rct5.setStarRating(5);
    rct5.setBody("Switchbacks downhill at the beginning, then opens up to a nice trail along the river. Walking along the old railroad tracks felt like time traveling. Muddy but navigable .. love you.. so much!! <3");
    rct5.setTrail(trailService.findByName("Robe Canyon Trail"));
    reviews.add(rct5);

    Review plt1 = new Review();
    plt1.setReviewerName("Sarah Legrand");
    plt1.setStarRating(3);
    plt1.setBody("We didn’t make it to the trail head. There’s still 6-8 inches of snow starting about 2 miles from the trailhead. The potholes going up are bad, high clearance vehicles are recommended. Our truck did fine with them though. Hope to try again in a few weeks once the snow melts some more. ");
    plt1.setTrail(trailService.findByName("Pinnacle Lake Trail"));
    reviews.add(plt1);

    Review plt2 = new Review();
    plt2.setReviewerName("Natalie Adams");
    plt2.setStarRating(3);
    plt2.setBody("We tried to do this trail on Saturday and weren’t able to make it up to the trail head. The potholes on the road were too large and deep to get past. If you don’t own a vehicle capable of going off road, don’t bother trying this trail! We saw a newer Jeep Cherokee even have issues getting up the road. It is severely under maintained, hopefully they redo the road with fresh gravel soon as we were really looking forward to this hike!!");
    plt2.setTrail(trailService.findByName("Pinnacle Lake Trail"));
    reviews.add(plt2);

    Review plt3 = new Review();
    plt3.setReviewerName("Alejandra Morin");
    plt3.setStarRating(5);
    plt3.setBody("Beautiful lake. Need a 4x4 as the road is in really bad shape. Trail is very muddy so I recommend waterproof boots.");
    plt3.setTrail(trailService.findByName("Pinnacle Lake Trail"));
    reviews.add(plt3);

    Review plt4 = new Review();
    plt4.setReviewerName("Zac Lauer");
    plt4.setStarRating(5);
    plt4.setBody("4x4 needed for sure. Super muddy and hard to find trail at some points but very peaceful. Not a single person on the trail in the afternoon/evening which was SHOCKING for a weekend in Washington.");
    plt4.setTrail(trailService.findByName("Pinnacle Lake Trail"));
    reviews.add(plt4);

    Review plt5 = new Review();
    plt5.setReviewerName("Ted Cartwright");
    plt5.setStarRating(4);
    plt5.setBody("the road is is extremely rough, recommend 4x4 or AWD and not low as there are big holes. the trail is fun and challenging, definitely be prepared for deep mud and the creek that are unavoidable. also some climbing involved that's difficult for medium dogs. otherwise,  beautiful lake and views and well worth the hike.");
    plt5.setTrail(trailService.findByName("Pinnacle Lake Trail"));
    reviews.add(plt5);

    Review bvfls1 = new Review();
    bvfls1.setReviewerName("Angie Hill");
    bvfls1.setStarRating(5);
    bvfls1.setBody("Tuesday 5/25/21 8am only two other vehicles at trail head. Some potholes getting there but nothing terrible. There's pit toilet bathrooms at parking lot. Trail to first waterfall view is relatively easy and elevation gain is not difficult. Some mud, but expected as it was a wet rainy day. After the first waterfall view the trail gets steeper with switchbacks and some stairs. There are three more nice waterfall views. The lake is mostly iced over still and as others have noted there are some large trees over the trail that head to lunch rock. There was a small amount of snow after the fallen trees but we didn't post-hole or find need for microspikes - the snow is nearly gone.  Overall a beautiful hike even though the weather was wet. Lots to see, and streams to cross. If you'd like to see some of this hike scenery before going there yourself, search YouTube for Beyond1031 and you can see our vlog dated May 25, 2021 ***PLEASE*** pack out what you bring in! - we saw garbage, water bottles, dog feces bags and orange peels.  Disappointing to see stuff like this happening more and more frequently. We picked up and packed out other people's garbage to dispose of.");
    bvfls1.setTrail(trailService.findByName("Bridal Veil Falls and Lake Serene"));
    reviews.add(bvfls1);

    Review bvfls2 = new Review();
    bvfls2.setReviewerName("Kelsi Haley");
    bvfls2.setStarRating(5);
    bvfls2.setBody("Very rocky and muddy. Couple of fallen trees when you get to Lake Serene but nothing impassable. Hardly any snow, overall beautiful as always");
    bvfls2.setTrail(trailService.findByName("Bridal Veil Falls and Lake Serene"));
    reviews.add(bvfls2);

    Review bvfls3 = new Review();
    bvfls3.setReviewerName("Sean Lafountain");
    bvfls3.setStarRating(4);
    bvfls3.setBody("The gravel road up to the parking lot has some pretty serious potholes, so watch out. The first mile or so of the trail is fairly easy. Up to the falls is a workout but not too bad. The way up to lake serene is pretty tough with lots of elevation gain and slippery rocks but IMO it is totally worth it if you’re able. A little snow at the top and then if you continue the trail over the small bridge and over the fallen trees(that block the trail) there’s a lot more snow.  It is super packed snow so you can walk on it with just boots and it has a nice rock slope to sit and look but if you’re not confident the trail before the fallen trees looks great too! Walking poles would have been nice on the way down, I actually slipped once. I saw one person do the trail in tennis shoes but please be kind to yourself and bring hiking boots.");
    bvfls3.setTrail(trailService.findByName("Bridal Veil Falls and Lake Serene"));
    reviews.add(bvfls3);

    Review bvfls4 = new Review();
    bvfls4.setReviewerName("Emma Tumbleson");
    bvfls4.setStarRating(4);
    bvfls4.setBody("great hike! started around 8:30 and there were only a few, the lot was a little over half full when we finished around 1, but that was a Tuesday. The falls are particularly impressive, but unfortunately it was so foggy I could hardly see the lake. Hope to come back and see it better! There is only a tiny bit of snow on the trail at the very top, so that's nothing to worry about. There are some bad potholes on the road just before the parking lot.");
    bvfls4.setTrail(trailService.findByName("Bridal Veil Falls and Lake Serene"));
    reviews.add(bvfls4);

    Review bvfls5 = new Review();
    bvfls5.setReviewerName("soph User");
    bvfls5.setStarRating(5);
    bvfls5.setBody("I wish that I had brought hiking poles — after the Falls, it gets slippery and rocky, especially as you get closer to the lake. Would've been particularly helpful on the return. Such a gorgeous hike, definitely sore!");
    bvfls5.setTrail(trailService.findByName("Bridal Veil Falls and Lake Serene"));
    reviews.add(bvfls5);

    Review wft1 = new Review();
    wft1.setReviewerName("Zach Nelson");
    wft1.setStarRating(5);
    wft1.setBody("Great trail, excellent views of the falls and nearby valley. Quite a few people, and on a Wednesday ");
    wft1.setTrail(trailService.findByName("Wallace Falls Trail"));
    reviews.add(wft1);

    Review wft2 = new Review();
    wft2.setReviewerName("Benny Chou");
    wft2.setStarRating(5);
    wft2.setBody("Went with some friends, a little cloudy but little to no mud. reached the upper Wallace falls. New hiker, 1 hr 59 min round trip.");
    wft2.setTrail(trailService.findByName("Wallace Falls Trail"));
    reviews.add(wft2);

    Review wft3 = new Review();
    wft3.setReviewerName("Brian Cemenska");
    wft3.setStarRating(5);
    wft3.setBody("nice trail with inclines and plenty of scenic places to rest if needed ");
    wft3.setTrail(trailService.findByName("Wallace Falls Trail"));
    reviews.add(wft3);

    Review wft4 = new Review();
    wft4.setReviewerName("taylor sandefur");
    wft4.setStarRating(5);
    wft4.setBody("awesome hike! some tougher inclines for a beginner hiker like mysel, but nothing too challenging. all viewpoints of the falls are amazing. i started my hike just before 2pm on a sunday, and the trail was busy but not overcrowded. bathrooms were clean and the trails were well kept and marked. ");
    wft4.setTrail(trailService.findByName("Wallace Falls Trail"));
    reviews.add(wft4);

    Review wft5 = new Review();
    wft5.setReviewerName("Adam Shore");
    wft5.setStarRating(5);
    wft5.setBody("Light crowds on a Sunday, but not bad! Beautiful scenery through the trees on a misty afternoon.");
    wft5.setTrail(trailService.findByName("Wallace Falls Trail"));
    reviews.add(wft5);

    Review blt1 = new Review();
    blt1.setReviewerName("Jason L");
    blt1.setStarRating(5);
    blt1.setBody("Attempted to make it to the trailhead snow is still 4' deep going over jack pass. there is only one way to the trailhead and that's going on beckler rd. coming from the index side it's closed do to the bridge being washed out. if you don't plan on adding an extra 10 miles to your hike then wait for the snow to clear in a month. will make a second attempt at making it to the lake tomorrow. ");
    blt1.setTrail(trailService.findByName("Blanca Lake Trail"));
    reviews.add(blt1);

    Review blt2 = new Review();
    blt2.setReviewerName("Randy DePaoli");
    blt2.setStarRating(5);
    blt2.setBody("I did this hike in 2019. Writing this review to counteract people who give it 1 star because the road is closed. It is on a mountain people. Mother Nature doesn’t care about your expectations. It snows on mountains. The hike is fairly rigorous with a lot of switchbacks. When I did it, the road to the trailhead was washed out adding about 4 miles to the hike. Once you get to Virgin Lake, which is basically just a pond, you only have another 30 minutes to go. You will also pass some camping spots here. You cannot camp near Blanca so this is your last location to setup camp if you plan on staying. At this point you actually descend down to Blanca. When Blanca Lake comes into view, it is breathtaking! There are a few nice spots to sit and enjoy the lake and something to eat.");
    blt2.setTrail(trailService.findByName("Blanca Lake Trail"));
    reviews.add(blt2);

    Review blt3 = new Review();
    blt3.setReviewerName("Randy Rosander");
    blt3.setStarRating(5);
    blt3.setBody("Beautiful trail. Well worth the surprise at the end! I recommend jumping in the lake!");
    blt3.setTrail(trailService.findByName("Blanca Lake Trail"));
    reviews.add(blt3);

    Review blt4 = new Review();
    blt4.setReviewerName("Adrienne Breske");
    blt4.setStarRating(4);
    blt4.setBody("This hike is a long grind through and up the woods for great views at the lake. I did this hike in August and started around 9 am. the parking area was not very full at this time on a Saturday. When we got to the lake, there were quite a few people, and not a lot of beach area so everyone is kinda close and in each other's space. when we completed our hike there were many cars parked illegally where sings were posted for no parking. That was kinda disappointing to see. This was a harder hike, and I felt it was hard to stay motivated for the first couple miles due to lack of scenery and the nonstop uphill climb. However, the views at the lake did pay off! ");
    blt4.setTrail(trailService.findByName("Blanca Lake Trail"));
    reviews.add(blt4);

    Review blt5 = new Review();
    blt5.setReviewerName("Zenia Ramirez");
    blt5.setStarRating(4);
    blt5.setBody("Tonnnns of snow, we brought an AWD and couldn’t make it to the trail bc of the snow, saw some cars with snow tires turning around as well, we had some tire chains and lost them in the snow. So I’m sure it’s a good hike for another day! ");
    blt5.setTrail(trailService.findByName("Blanca Lake Trail"));
    reviews.add(blt5);

    Review hlt1 = new Review();
    hlt1.setReviewerName("Miranda Diebel");
    hlt1.setStarRating(5);
    hlt1.setBody("Great short hike with a nice view at the top.");
    hlt1.setTrail(trailService.findByName("Heybrook Lookout Trail"));
    reviews.add(hlt1);

    Review hlt2 = new Review();
    hlt2.setReviewerName("Monica Beard");
    hlt2.setStarRating(5);
    hlt2.setBody("The trail was well maintained and super easy to navigate. It wasn’t too crowded. The views were gorgeous even on this cloudy morning.");
    hlt2.setTrail(trailService.findByName("Heybrook Lookout Trail"));
    reviews.add(hlt2);

    Review hlt3 = new Review();
    hlt3.setReviewerName("Jacky Rodriguez");
    hlt3.setStarRating(4);
    hlt3.setBody("such a good workout! really short hike, but STEEP! about 2.5 miles round trip. got there at around 830. didn’t really run into anyone until we worked our way down. great hike to start the season! ");
    hlt3.setTrail(trailService.findByName("Heybrook Lookout Trail"));
    reviews.add(hlt3);

    Review hlt4 = new Review();
    hlt4.setReviewerName("Dei M");
    hlt4.setStarRating(4);
    hlt4.setBody("Great workout hike with rewarding views  at the top. Hiking poles helped a lot. We got there on Sat 9AM and there were about 6 parking spots left. Came back at 10:30 and the van parked right on the trailhead had broken window. It was the only car I noticed that was broken into. I just found it odd because it was very visible from the hiway and obviously foot traffic. Recent similar events were reported and is the only downside of this trail. ");
    hlt4.setTrail(trailService.findByName("Heybrook Lookout Trail"));
    reviews.add(hlt4);

    Review hlt5 = new Review();
    hlt5.setReviewerName("Julianne Powers");
    hlt5.setStarRating(4);
    hlt5.setBody("Great first hike of the summer season if need to get back into hiking shape. Only about 2.5 miles round trip. Steep going up, but a great workout. Pretty views at the top of the lookout, if you’re not too afraid of heights! :)");
    hlt5.setTrail(trailService.findByName("Heybrook Lookout Trail"));
    reviews.add(hlt5);

    Review glt1 = new Review();
    glt1.setReviewerName("Shermin 'Happy Feet'");
    glt1.setStarRating(4);
    glt1.setBody(" posted this same report on the WTA website. Hiked on Nov 19. Coming from Granite Falls, we parked 2.5 miles before the trailhead because there was a huge down tree blocking the road. Also lots of snow on the road, more than a foot deep. The road gets icy and slushy once pavement ends after Barlow Pass. Definitely need high clearance and 4wd. I also put on my chains. If wanting to to do this hike in the future, better to drive from Darrington as the road is much better I guess since we saw a Prius and a Civic. It's paved and not much snow yet since it's at lower elevation. As for the hike, lots of fresh snow, trail is wet, water is flowing. We only got to the junction where the Upper and Lower meets again. So we did a loop. It's beautiful there. But unfortunately we didn't have the time to hike all the way to the lake.");
    glt1.setTrail(trailService.findByName("Goat Lake Trail"));
    reviews.add(glt1);

    Review glt2 = new Review();
    glt2.setReviewerName("Matthew Moots");
    glt2.setStarRating(4);
    glt2.setBody("Lots of ice over the trail and water crossings made it pretty slick. Even fell into the water when crossing lol. ");
    glt2.setTrail(trailService.findByName("Goat Lake Trail"));
    reviews.add(glt2);

    Review glt3 = new Review();
    glt3.setReviewerName("Jessica Hayward");
    glt3.setStarRating(4);
    glt3.setBody("Lake was beautiful today! we took lower elliot first and it was scenic but very wet/muddy. Was thankful for my waterproof boots today. We only came across 7 other hiker groups but the fallen tree to the parking lot might of turned some people around. can't wait to do this one again in the summer! ");
    glt3.setTrail(trailService.findByName("Goat Lake Trail"));
    reviews.add(glt3);

    Review glt4 = new Review();
    glt4.setReviewerName("Kathy Cook\n");
    glt4.setStarRating(4);
    glt4.setBody("Great, snowy day up there. Road to parking is inaccessible due to downed trees. Went up lower Elliot loop, lots of trees down on the trail, one wooded trail section completely hit by trees, muddy/wet conditions. Towards the top was Hard to find trail to the lake near the waterfall. Came down upper Elliot loop and yes, not as scenic but way easier to navigate- not as many water crossings and thick muddy stretches. Snow up top, waterfalls were absolutely rushing. ");
    glt4.setTrail(trailService.findByName("Goat Lake Trail"));
    reviews.add(glt4);

    Review glt5 = new Review();
    glt5.setReviewerName("Evan Dwyer");
    glt5.setStarRating(5);
    glt5.setBody("stunning weather today! such a peaceful trail, although pretty sloppy in places. be mindful of the first switchback, pretty easy to get off trail if you don't turn around. potholes on last 5 miles of road be crazy");
    glt5.setTrail(trailService.findByName("Goat Lake Trail"));
    reviews.add(glt5);

    Review gbt1 = new Review();
    gbt1.setReviewerName("Joe Caraccio");
    gbt1.setStarRating(5);
    gbt1.setBody("10/10 views at the top. No crampons or micro spikes needed.");
    gbt1.setTrail(trailService.findByName("Gothic Basin Trail"));
    reviews.add(gbt1);

    Review gbt2 = new Review();
    gbt2.setReviewerName("Larry Hutchinson");
    gbt2.setStarRating(4);
    gbt2.setBody("Planned to go to Foggy Lake but turned it early.  6-10” heavy wet snow, lots of water on stream crossings, raining steady with mixed snow.  Had micro spikes, should have brought snowshoes.   Pretty slow walking in heavy snow.  It’s winter conditions from here on out.  Road up to Barlow Pass snow/slush, easy with 4WD, would be a bit tricky for 2WD without snow tires and low ground clearance.  Tried to get up to Deer Lake on the way home for a look but even in 4WD-L with the rear diff locked it was work breaking trail, finally gave it up, backed down a ways & turned around just shy of the lake & managed to not get stuck in the process.  Fun day, shorter hike than planned but nice walk in the woods nonetheless.");
    gbt2.setTrail(trailService.findByName("Gothic Basin Trail"));
    reviews.add(gbt2);

    Review gbt3 = new Review();
    gbt3.setReviewerName("Rod Standing");
    gbt3.setStarRating(5);
    gbt3.setBody("Great hike! winter is taking over though, no special gear needed as of yet! spikes and poles would be helpful but not necessary yet. The trail was quiet and it was nice not wearing a mask. ");
    gbt3.setTrail(trailService.findByName("Gothic Basin Trail"));
    reviews.add(gbt3);

    Review gbt4 = new Review();
    gbt4.setReviewerName("Tomboso Caceroso\n");
    gbt4.setStarRating(4);
    gbt4.setBody("10/29/20 - Easy/flat start followed by steady gains via switchbacks followed by difficult, uneven, rocky trail. Nice views over the latter half. Upper third with patches of ice - had to take off and put on the microspikes multiple times. Foggy Lake is still accessible, free of ice, and was perfectly calm. Ankle deep snow is present around the lake. Only saw 4 total people the entire day, had Foggy Lake to myself - the group of 3 stopped at Weeden Lake. ");
    gbt4.setTrail(trailService.findByName("Gothic Basin Trail"));
    reviews.add(gbt4);

    Review gbt5 = new Review();
    gbt5.setReviewerName("Jesse Frome");
    gbt5.setStarRating(5);
    gbt5.setBody("Winter has arrived at 5000 feet. Ran into a blizzard just before the basin and had to turn back. Snow covered the path to the lake. Bring mircospikes, wear boots with gators and extra layers. It was too cold, wet and windy to use a touch-screen device, so plan accordingly.");
    gbt5.setTrail(trailService.findByName("Gothic Basin Trail"));
    reviews.add(gbt5);

    Review b4ict1 = new Review();
    b4ict1.setReviewerName("Keegan Green");
    b4ict1.setStarRating(5);
    b4ict1.setBody("The parking lot is open, but the bridge is still out. Be prepared to wade through thigh deep water to hike most of the trail. The caves are still buried under snow, but it's still worth it. The mountains and waterfalls are stunning. ");
    b4ict1.setTrail(trailService.findByName("Big Four Ice Caves Trail"));
    reviews.add(b4ict1);

    Review b4ict2 = new Review();
    b4ict2.setReviewerName("Sharon Nichols");
    b4ict2.setStarRating(5);
    b4ict2.setBody("I have done this one twice and I enjoyed it every time. Make sure to go after July when the caves are open and not covered in snow!");
    b4ict2.setTrail(trailService.findByName("Big Four Ice Caves Trail"));
    reviews.add(b4ict2);

    Review b4ict3 = new Review();
    b4ict3.setReviewerName("Lacey Davidson");
    b4ict3.setStarRating(2);
    b4ict3.setBody("Road is closed. 2 mile hike to the trailhead on paved road. Got to the trailhead and bridge was out. ");
    b4ict3.setTrail(trailService.findByName("Big Four Ice Caves Trail"));
    reviews.add(b4ict3);

    Review b4ict4 = new Review();
    b4ict4.setReviewerName("Evan Kolar");
    b4ict4.setStarRating(4);
    b4ict4.setBody("Trail was beautiful but the bridge is closed. We crossed the river by foot  and made it all the way to the base of the caves. Slower commute but beautiful and worth it 5/10/21");
    b4ict4.setTrail(trailService.findByName("Big Four Ice Caves Trail"));
    reviews.add(b4ict4);

    Review b4ict5 = new Review();
    b4ict5.setReviewerName("Jonny Gen\n");
    b4ict5.setStarRating(5);
    b4ict5.setBody("This trail is so beautiful went last year 2020 but overrun by trash people who trash the place with their trash dirty mask and throw it into the trail really disappointing the trail is beautiful but needs to be aware of these trash people who liter the area like a bunch of retards there’s a garbage for that people are to lazy to just throw away their mask into the garbage.");
    b4ict5.setTrail(trailService.findByName("Big Four Ice Caves Trail"));
    reviews.add(b4ict5);

    if (reviewService.findAll().size() == 0) {
      reviews.forEach(review -> reviewService.save(review));
    }
  }
}