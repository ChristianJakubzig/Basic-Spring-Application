# User Management API

This is a simple **User Management API** built using Spring Boot. It allows you to perform basic CRUD (Create, Read, Update, Delete) operations on users. This is my first project using Spring, and it's a great starting point to learn how to build RESTful APIs with Spring Boot.

## Features
- **List Users**: Get all users.
- **Get User by ID**: Retrieve a specific user by their ID.
- **Create User**: Add a new user.
- **Update User**: Modify the details of an existing user.
- **Delete User**: Remove a user by ID.

## Technologies Used
- **Java 22** 
- **Spring Boot** 
- **Maven**

### API Endpoints

| Method   | Endpoint      | Description         |
|----------|---------------|---------------------|
| `GET`    | `/users`      | Get all users       |
| `GET`    | `/users/{id}` | Get user by ID      |
| `POST`   | `/users`      | Create a new user   |
| `PUT`    | `/users/{id}` | Update user by ID   |
| `DELETE` | `/users/{id}` | Delete user by ID   |
