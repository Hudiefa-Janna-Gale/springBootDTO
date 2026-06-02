# 🎓 Spring Boot DTO Example

A simple Spring Boot REST API project demonstrating the use of **DTOs (Data Transfer Objects)** for creating, updating, and retrieving student information.

## 📚 Project Overview

This project was built to understand how DTOs work in Spring Boot and how they help separate API requests and responses from the main model.

The application allows users to:

- Create a new student
- Get all students
- Get a student by ID
- Update student information
- Delete a student

The project uses an in-memory `ArrayList` instead of a database to keep the focus on learning DTO concepts.

---

## 🏗 Project Structure

```text
src/main/java/com/students
│
├── Controller
│   └── StudentController.java
│
├── Services
│   └── StudentService.java
│
├── Models
│   └── Students.java
│
├── StudentCreateDTO
│   └── StudentCreateDTO.java
│
├── UpdateDTO
│   └── StudentUpdateDTO.java
│
└── ResponseDTO
    └── StudentResponseDTO.java
```

---

## 🔄 DTOs Used

### 1. StudentCreateDTO

Used when creating a new student.

```json
{
  "name": "John Doe",
  "dob": "2005-05-10",
  "password": "123456"
}
```

### 2. StudentUpdateDTO

Used when updating student information.

```json
{
  "name": "John Updated",
  "dob": "2005-06-01",
  "password": "newpassword"
}
```

### 3. StudentResponseDTO

Returned to the client after successful operations.

```json
{
  "id": "uuid",
  "name": "John Doe",
  "dob": "2005-05-10"
}
```

Notice that the password is not returned to the client for security purposes.

---

## 🚀 API Endpoints

### Create Student

**POST**

```http
/api/student
```

Request Body:

```json
{
  "name": "John Doe",
  "dob": "2005-05-10",
  "password": "123456"
}
```

---

### Get All Students

**GET**

```http
/api/student
```

---

### Get Student By ID

**GET**

```http
/api/student/{id}
```

Example:

```http
/api/student/550e8400-e29b-41d4-a716-446655440000
```

---

### Update Student

**PUT**

```http
/api/student/{id}
```

Request Body:

```json
{
  "name": "Updated Name",
  "dob": "2004-12-01",
  "password": "updatedPassword"
}
```

---

### Delete Student

**DELETE**

```http
/api/student/{id}
```

Response:

```text
Student deleted successfully
```

---

## 🛠 Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Jakarta Validation
- Lombok
- Maven

---

## 🎯 Learning Objectives

This project demonstrates:

- REST API development
- DTO Pattern
- Constructor Injection
- Request Validation
- CRUD Operations
- UUID Usage
- Service Layer Architecture
- Clean Code Structure

---

## 🔒 Why Use DTOs?

DTOs provide several advantages:

- Hide sensitive data such as passwords
- Separate API contracts from models
- Improve security
- Make code easier to maintain
- Prevent exposing internal application structure

---

## 👨‍💻 Author

**Hudeifa Jannagale**

Learning Spring Boot and Backend Development.

GitHub:
https://github.com/Hudiefa-Janna-Gale

---

## ⭐ Future Improvements

- Add Spring Data JPA
- Connect MySQL/PostgreSQL Database
- Global Exception Handling
- Swagger/OpenAPI Documentation
- Authentication & Authorization
- Unit Testing
