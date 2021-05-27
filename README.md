Seattle Trails Review Site (Version: 1.0)

This web app is developed as a final group project which is part the fullfullment of the Launch Academy software development program. Launch Academy is a Boston based coding bootcamp focusing on web development.

This web site is a place where users can add a review about any trail located in the Seattle area. Users can navigate to specific trail and enter a review about that trail using the form that is displayed by clicking the 'add review' button at the bottom of the Trail informtion. Contents of the review include name of reviewer, star rating and text content of the review.

Creators:
- Ashlyn Morin
- Steve Taylor
- Ami Drammeh
- Paul Ritzman
- Sina Mitiku

Other contributors:
- Evan DuBois - EE at Launch Academy

Tools and frameworks used:
- React front-end
- Spring data back-end
- PostgreSql database
- Yarn
- Maven


How to run this project on your local machine:
1. Navigate to the directory location you want to store this project.
2. In your terminal:
    - git clone https://github.com/LAGroup5/ReviewSite
    - dropdb review_site
    - createdb review_site
    - cd into project
    - open your IDE
3. In your IDE:
    - Navigate to src/main/resources/application.properties
    - update your spring datasource url to match your db location.
    - update flyway.url, user, and password to reflect your local db info.
4. Back in your terminal:
    - yarn install
    - cd src/main/frontend
    - open a second terminal
        - in second terminal:
            - cd into project
            - ./mvnw spring-boot:run
5. In your browser, Navigate to localhost 8080. See Home controller for all possible routes.

** Planning our app: **

ER Diagram:

![ER Diagram:](/gitHubResources/ER_diagram.PNG)

React Component Tree:

![React Component Tree:](/gitHubResources/react_component_tree.PNG)

User Stories:

![User Stories:](/gitHubResources/User_stories.PNG)




