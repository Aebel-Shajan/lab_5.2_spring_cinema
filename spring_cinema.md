# Lab - The Spring Cinema

We now have all the tools available to integrate an SQL database into our API. That means we can improve our cinema experience from the SQL lessons by using an API to save new films instead of writing the queries manually!

## MVP

Create a new Spring Boot project with the `Web`, `DevTools`, `PostgreSQL` and `JPA` dependencies. This will form the basis of your API which will need:

- A `Movie` model with the properties:
    - `id`
    - `title`
    - `rating`
    - `duration`

With annotations to facilitate database integration.

- A `MovieRepository` to connect the model to the database
- A `MovieController` with the following routes:
    - `GET /movies`
    - `GET /movies/{id}`
    - `POST /movies`
- A `MovieService` to connect the controller and repository

Test the routes using Postman to ensure you can add a new movie and see those already in the database.

## Extensions

- Add functionality to update a movie in the database
- Add functionality to delete a movie from the database

## Advanced Extension

- Use a `@RequestParam` to add a `maxDuration` parameter to the `GET /movies` request. Pass this through to the service and use it to return only the movies with a duration less than the value.