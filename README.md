# Spring Boot REST API Book Management - Interview Guide

A complete Spring Boot project demonstrating REST API concepts, perfect for interview preparation.

## 🎯 Project Overview
This project implements a Book Management System with complete CRUD operations using Spring Boot.

## 🔑 Key Concepts Covered

### 1. REST API Basics
- **@RestController**: Used in `bookcontroller.java` for handling REST requests
- **HTTP Methods Implementation**:
  - GET: Fetch books
  - POST: Add new books
  - PUT: Update books
  - DELETE: Remove books

### 2. Project Structure
```
bootrestbook/
├── controllers/
│   └── bookcontroller.java    # Handles HTTP requests
├── services/
│   └── BookService.java       # Business logic
└── entities/
    └── Book.java             # Data model
```

### 3. Key Annotations Used
- `@RestController`: Marks class as REST controller
- `@GetMapping`: Handles GET requests
- `@PostMapping`: Handles POST requests
- `@PutMapping`: Handles PUT requests
- `@DeleteMapping`: Handles DELETE requests
- `@RequestBody`: Converts JSON to Java objects
- `@PathVariable`: Extracts values from URL

### 4. Important Interview Concepts

#### REST API Design
- Each endpoint follows REST conventions
- Proper HTTP methods for CRUD operations
- Meaningful URL patterns (`/books`, `/books/{id}`)

#### Service Layer Pattern
- Separation of concerns
- Business logic in service layer
- Controller only handles request/response

#### Data Flow
1. Client sends HTTP request
2. Controller receives request
3. Service processes data
4. Response returned to client

## 📝 Interview Questions & Answers

### Q1: What is the difference between `@Controller` and `@RestController`?
- `@Controller`: Traditional MVC controller, returns view names
- `@RestController`: Combines `@Controller` and `@ResponseBody`, returns data directly

### Q2: Explain the role of `@RequestBody`
- Converts JSON/XML from request body to Java objects
- Used in POST/PUT methods to receive data
- Requires proper getters/setters in entity class

### Q3: Why do we use Service layer?
- Separates business logic from controllers
- Enables code reusability
- Makes testing easier
- Follows Single Responsibility Principle

### Q4: Explain your project's CRUD operations
1. **Create (POST)**:
   ```java
   @PostMapping("/books")
   public Book addBook(@RequestBody Book book)
   ```

2. **Read (GET)**:
   ```java
   @GetMapping("/books")
   public List<Book> getBooks()
   ```

3. **Update (PUT)**:
   ```java
   @PutMapping("/books/{bookId}")
   public Book updateBook(@RequestBody Book book)
   ```

4. **Delete (DELETE)**:
   ```java
   @DeleteMapping("/books/{bookId}")
   public void deleteBook(@PathVariable("bookId") int bookId)
   ```

## 🔄 Database Integration (Next Steps)
- Adding JPA dependencies
- Configuring MySQL database
- Creating proper entity mappings
- Implementing JPA Repository

## 📚 Best Practices Demonstrated
1. Proper package structure
2. Service layer implementation
3. Clear naming conventions
4. Separation of concerns

## 🛠️ How to Run
1. Clone the repository
2. Run `mvn spring-boot:run`
3. Access endpoints at `http://localhost:8080/books`

## 🧪 Testing API
Use Postman to test:
- GET `http://localhost:8080/books`
- POST `http://localhost:8080/books` with JSON body
- PUT `http://localhost:8080/books/{id}`
- DELETE `http://localhost:8080/books/{id}`