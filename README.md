**Movies App**
This is a simple RESTful backend application for managing movies and actors. The backend is built using Spring Boot and provides basic CRUD operations for Movie and Actor entities. The project demonstrates the use of Data Transfer Objects (DTOs) to transfer data between different layers of the application.

**Features**
Movie Management: Create, read, update, and delete movie records.
Actor Management: Create, read, update, and delete actor records.
DTO Usage: Utilizes DTOs to encapsulate the data that is transferred between the client and server.
RESTful API: Follows REST principles for building the API endpoints.
Spring Data JPA: Uses Spring Data JPA to simplify the database interaction.
Service Layer: Contains business logic for handling movie and actor operations.
Controller Layer: Exposes endpoints for accessing movie and actor services.


**Project Structure**
com.example.moviesapp.config: Configuration classes, including security configurations.
com.example.moviesapp.controller: REST controllers for handling HTTP requests.
com.example.moviesapp.dto: DTOs for transferring movie and director data.
com.example.moviesapp.model: Entity classes representing the database structure.
com.example.moviesapp.repository: Repository interfaces for data access.
com.example.moviesapp.service: Service classes containing business logic.
com.example.moviesapp.util: Utility classes for additional functionalities.

**API Endpoints**
Movie
GET /movies: Retrieve all movies.
GET /movies/{id}: Retrieve a specific movie by ID.
POST /movies: Create a new movie.
DELETE /movies/{id}: Delete a movie by ID.

Actor
GET /actors: Retrieve all actors.
GET /actors/{id}: Retrieve a specific actor by ID.
POST /actors: Create a new actor.
DELETE /actors/{id}: Delete a actor by ID.
