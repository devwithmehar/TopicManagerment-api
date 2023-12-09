# Management Tool API

This Spring Boot application provides APIs for managing topics and courses.

## Table of Contents
- [Introduction](#introduction)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Topics](#topics)
  - [Courses](#courses)
- [License](#license)

## Introduction

This project is a Spring Boot application that offers APIs for managing topics and courses. It includes controllers for topics and courses, along with corresponding services.

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/devwithmehar/TopicManagerment-api.git

   cd management-tool-api

2. Build the project:

    ```bash
    mvn clean install
    ````
    This command will download dependencies, compile the code, and create an executable JAR file.

3. Run the Application:

    ```bash
        java -jar target/management-tool-api.jar
    ```
    The application will start on http://localhost:8080



## Usage

### __Topics__

Get All Topics
```bash
GET /topics
```

Get a Topic 
```bash
GET /topics/{id}
```

Add a Topic

```bash
POST /topics
```

Update a Topic
```bash
PUT /topics/{id}
```
Delete a Topic

```bash
DELETE /topics/{id}
```

### __Courses__

Get All Courses for a Topic

```bash
GET /topics/{topicId}/courses
```

Get a Course

```bash
GET /topics/{topicId}/courses/{id}
```

Add a Course
```bash
POST /topics/{topicId}/courses
```

Update a Course

```bash
PUT /topics/{topicId}/courses/{id}
```

Delete a Course

```bash
DELETE /topics/{topicId}/courses/{id}
```

## License

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
