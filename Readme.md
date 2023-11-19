# ToDo Application Documentation

## Table of Contents

1. [Introduction](#introduction)
2. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
3. [Application Structure](#application-structure)
4. [Dependencies](#dependencies)
5. [Configuration](#configuration)
6. [Usage](#usage)
   - [Running the Application](#running-the-application)
   - [Accessing the ToDo Application](#accessing-the-todo-application)
7. [Features](#features)
8. [Technologies Used](#technologies-used)

## Introduction

This documentation provides information on the ToDo application built using Spring Boot. The application is designed to manage and organize tasks efficiently.

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Maven
- Your favorite IDE (Integrated Development Environment)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-todo-app.git
   ```

2. Import the project into your IDE.

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

## Application Structure

The application follows the standard Spring Boot project structure:

```
your-todo-app/
|-- src/
|   |-- main/
|       |-- java/
|       |   |-- com.example.todo/
|       |       |-- controller/
|       |       |-- model/
|       |       |-- repository/
|       |       |-- service/
|       |-- resources/
|           |-- application.properties
|           |-- templates/
|               |-- *.html
|-- target/
|-- pom.xml
```

## Dependencies

The ToDo application uses the following dependencies:

- Spring Boot Devtools
- Thymeleaf
- Spring Data JPA
- Spring Web
- H2 Database
- Validation
- Lombok

## Configuration

The application configuration can be found in the `application.properties` file within the `src/main/resources` directory.

## Usage

### Running the Application

Execute the following command to run the application:

```bash
mvn spring-boot:run
```

### Accessing the ToDo Application

Open your web browser and navigate to [http://localhost:5000](http://localhost:5000).

## Features

- **Task Management:** Add, edit, and delete tasks.
- **Task Validation:** Ensure tasks meet specified criteria.
- **Persistence:** Utilizes H2 database for task storage.
- **User-friendly Interface:** Thymeleaf for server-side HTML rendering.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- H2 Database
- Maven
