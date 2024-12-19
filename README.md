---
# WebClient Example: Fetching Data from ReqRes API

This is a simple Spring Boot project demonstrating how to call REST services using the `WebClient` API in Spring. The project fetches user data from the ReqRes API (`https://reqres.in/api/users`) and displays it via a REST endpoint.

---

## Features

- **REST API Integration**: Fetches data from an external API (`https://reqres.in/api/users`) using Spring's `WebClient`.
- **WebClient Bean Configuration**: Centralized configuration of `WebClient` for dependency injection.
- **Clean and Simple Code**: Demonstrates best practices in making API calls with `WebClient`.

---

## Technologies Used

- **Java 17**
- **Spring Boot 3.x**
- **Spring WebFlux**: For `WebClient`
- **Maven**: Dependency management

---

## How It Works

1. A `WebClient` bean is defined in a configuration class (`WebClientConfig`) with a base URL set to the ReqRes API.
2. The `WebClient` bean is injected into a service class (`UserService`) to make GET requests.
3. The `UserService` fetches user data from the ReqRes API and returns it as a Java object (`UserResponse`).
4. The controller (`UserController`) exposes a REST endpoint (`/users`) that calls the `UserService` to fetch the data.

---

## How to Run the Project

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/your-repository-name.git
   ```

2. Navigate to the project directory:
   ```bash
   cd your-repository-name
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the project:
   ```bash
   mvn spring-boot:run
   ```

5. Access the API endpoint:
   Open your browser or use Postman to access:
   ```
   http://localhost:8080/users
   ```

---

## API Response Example

Sample response fetched from `https://reqres.in/api/users`:
```json
{
  "data": [
    {
      "id": 1,
      "email": "george.bluth@reqres.in",
      "first_name": "George",
      "last_name": "Bluth",
      "avatar": "https://reqres.in/img/faces/1-image.jpg"
    },
    {
      "id": 2,
      "email": "janet.weaver@reqres.in",
      "first_name": "Janet",
      "last_name": "Weaver",
      "avatar": "https://reqres.in/img/faces/2-image.jpg"
    }
  ]
}
```

---

## Project Structure

```plaintext
src/main/java
├── com.example.webclient
│   ├── config
│   │   └── WebClientConfig.java    # WebClient Bean Configuration
│   ├── controller
│   │   └── UserController.java     # REST Controller
│   ├── model
│   │   └── UserResponse.java       # Data Model for API Response
│   ├── service
│       └── UserService.java        # Service Layer
```

---

## Dependencies

Add the following dependencies in your `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-webflux</artifactId>
    </dependency>
</dependencies>
```

---

## Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request.

---

## Author

**Abhishek Kumar**  
GitHub: [abhishek-kr03](https://github.com/your-username)
```
