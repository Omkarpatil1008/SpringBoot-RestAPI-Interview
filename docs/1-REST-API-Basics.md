# REST API Interview Guide

## 1. Core Concepts

### What is REST?
- REST (Representational State Transfer) is an architectural style
- Stateless communication between client and server
- Uses standard HTTP methods (GET, POST, PUT, DELETE)

### HTTP Methods
1. **GET**: Retrieve resources
   ```java
   @GetMapping("/books")
   public List<Book> getBooks() {
       return bookService.getAllBooks();
   }
   ```

2. **POST**: Create new resources
   ```java
   @PostMapping("/books")
   public Book addBook(@RequestBody Book book) {
       return bookService.addBook(book);
   }
   ```

3. **PUT**: Update existing resources
   ```java
   @PutMapping("/books/{id}")
   public Book updateBook(@RequestBody Book book) {
       return bookService.updateBook(book);
   }
   ```

4. **DELETE**: Remove resources
   ```java
   @DeleteMapping("/books/{id}")
   public void deleteBook(@PathVariable int id) {
       bookService.deleteBookById(id);
   }
   ```

## 2. Important Annotations

### @RestController vs @Controller
- `@Controller`: Traditional MVC controller
- `@RestController`: Combination of `@Controller` and `@ResponseBody`
- Used for REST APIs where data is returned directly

### Request Handling Annotations
- `@RequestMapping`: Base mapping for controller
- `@GetMapping`: Handle GET requests
- `@PostMapping`: Handle POST requests
- `@PutMapping`: Handle PUT requests
- `@DeleteMapping`: Handle DELETE requests

### Parameter Annotations
- `@PathVariable`: URL path variables
- `@RequestBody`: Request body content
- `@RequestParam`: Query parameters

## 3. Common Interview Questions

1. **Q: What is the difference between PUT and POST?**
   - POST: Create new resource
   - PUT: Update existing resource
   - POST is not idempotent, PUT is idempotent

2. **Q: What is idempotency?**
   - Multiple identical requests should have same effect as single request
   - GET, PUT, DELETE are idempotent
   - POST is not idempotent

3. **Q: Why use @RestController over @Controller?**
   - Eliminates need for @ResponseBody
   - Indicates REST API controller
   - Better for microservices

4. **Q: Explain @PathVariable vs @RequestParam**
   - @PathVariable: Part of URL path (/books/{id})
   - @RequestParam: Query parameter (?name=value)

## 4. Best Practices

1. **URL Naming**
   - Use nouns for resources
   - Use plural forms
   - Keep it simple and readable
   ```
   Good: /api/books/{id}
   Bad: /api/getBook?bookId=1
   ```

2. **HTTP Status Codes**
   - 200: Success
   - 201: Created
   - 400: Bad Request
   - 404: Not Found
   - 500: Server Error

3. **Response Format**
   - Consistent JSON structure
   - Include status and message
   - Handle errors properly

4. **Version Your API**
   ```
   /api/v1/books
   /api/v2/books
   ```