# Spring Boot Project Structure Guide

## 1. Standard Project Structure
```
bootrestbook/
├── src/main/java/
│   └── com.api.book.bootrestbook/
│       ├── controllers/        # Handle HTTP requests
│       ├── services/          # Business logic
│       ├── entities/          # Data models
│       ├── repositories/      # Data access
│       └── config/           # Configuration classes
├── src/main/resources/
│   └── application.properties  # Application configuration
└── src/test/                  # Test classes
```

## 2. Layer Responsibilities

### Controller Layer
- Handles HTTP requests
- Input validation
- URL mapping
- Response formatting

### Service Layer
- Business logic
- Transaction management
- Data processing
- Error handling

### Repository Layer
- Database operations
- Data access
- Query execution

### Entity Layer
- Data models
- JPA entities
- Validation rules

## 3. Best Practices

### Package Naming
```java
com.companyname.project
com.companyname.project.module
```

### Class Naming
- Controllers: `*Controller`
- Services: `*Service`
- Entities: Domain name
- Repositories: `*Repository`

### Method Naming
- Controllers: `getResource`, `createResource`
- Services: `findBy*`, `saveEntity`
- Repositories: `findBy*`, `save*`

## 4. Configuration

### application.properties
```properties
# Server Configuration
server.port=8080

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/dbname
spring.datasource.username=root
spring.datasource.password=password

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 5. Common Interview Questions

1. **Q: Explain the layers in a Spring Boot application**
   - Controller: Handle requests
   - Service: Business logic
   - Repository: Data access
   - Entity: Data models

2. **Q: Why use Service layer?**
   - Separation of concerns
   - Reusable business logic
   - Transaction management
   - Unit testing

3. **Q: What is the role of application.properties?**
   - Configure application
   - Set database properties
   - Configure logging
   - Server settings

4. **Q: Explain dependency injection in Spring Boot**
   - @Autowired annotation
   - Constructor injection
   - Setter injection
   - Field injection