# Academic Enrollment Portal

Spring Boot project for managing academic enrollments with Students, Courses, Teachers, and Enrollments.

## Tech Stack
- Java 17
- Spring Boot 3.2.2
- MySQL
- JPA / Hibernate
- Maven
- Spring Security + JWT
- Swagger/OpenAPI
- Lombok (optional)

## Features
- CRUD for Student, Teacher, and Course
- Student enrollment & teacher assignment
- Attendance and grade tracking
- Input validation and exception handling
- JWT authentication with roles (student, teacher, admin)
- API documentation with Swagger

## Setup
1. Clone the repo
2. Configure MySQL database in `application.properties`
3. Run `mvn clean install`
4. Start the app: `mvn spring-boot:run`
