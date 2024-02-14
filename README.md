![Spring oot CRUDApplication](Springboot_CRUD_Application.png)

This repository contains a simple Spring Boot CRUD (Create, Read, Update, Delete) application.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Screenshots](#screenshots)

## Features

- **CRUD Operations:** Perform Create, Read, Update, and Delete operations on data.
- **RESTful API:** Exposes RESTful endpoints for interacting with the application.
- **Spring Boot:** Utilizes the Spring Boot framework for easy setup and development.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL (or your preferred database)
- Maven (or Gradle)

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/danthalomous/CST339_MilestoneProject
    ```

2. **Navigate to the project directory:**

    ```bash
    cd CST339_MilestoneProject
    ```

3. **Configure the database:**

    - Create a MySQL database (or use an existing one).
    - Update the database configuration in `src/main/resources/application.properties`.

4. **Build the project:**

    ```bash
    mvn clean install
    ```

5. **Run the application:**

    ```bash
    java -jar target/CST339_MilestoneProject-1.0.jar
    ```

## Usage

Once the application is up and running, you can interact with it via its RESTful API. Use tools like Postman or curl to send HTTP requests to the endpoints.

## Endpoints

- **GET /products:** Retrieve all entities.
- **GET /showAddNewProduct:** Shows New Products
- **POST /addProduct:** Create a new entity.
- **GET /delete/{id}:** Delete an existing entity by ID.
- **GET /update/{id}:** Update an entity by ID.
- **POST /processUpdate:** Process the Update
- **GET /search/{searchTerm}:** Search Through the Products

## Screenshots

