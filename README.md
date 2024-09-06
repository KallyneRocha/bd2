# 📚 BD-2
Project for college, with the objective of organizing the books of a library.

## ✈️ How to run the project

### Before you begin, make sure you have the following:

- Java 17 installed on your system. You can download it from Java SE Downloads.
- Apache Maven 3.9.3 installed. You can get it from Apache Maven Downloads.
- XAMPP 8.0.28 or other MySQL database server installed. You can download XAMPP from XAMPP Downloads.
- MySQL Workbench 8.0.33 or another MySQL database management tool installed. You can download MySQL Workbench from MySQL Workbench Downloads.
- IntelliJ IDEA 2023.1.3 or another editor of your choice.

#### Step 1: Setting the Environment
- Install Java 17 by following the instructions provided on the official website.
- Install Apache Maven 3.9.3 by following the instructions provided on the official website.
- Install XAMPP 8.0.28 and start the MySQL server.
- Use MySQL Workbench to create a database called "library-ual" and create a user with permissions to access the database.
- Clone the RESTful API repository for your development environment.

#### Step 2: Database Configuration
- Open the application-dev.properties file in the src/main/resources directory.
- Update the spring.datasource.url, spring.datasource.username, and spring.datasource.password properties with the correct information for your MySQL server.

#### Step 3: Compile and Run
- Open the project in IntelliJ IDEA or your editor of choice.
- Wait for Maven to import the dependencies.
- Build the project using Maven to download the dependencies and generate the executable package.
- Run the LibraryUalApplication class to start the RESTful API server.

#### Step 4: Interacting with the API
- Now that the API is running, you can start interacting with it using tools like cURL, Postman, or your browser.

To test the API using cURL, open a terminal and send an HTTP request to the desired route: http://localhost:8080/swagger-ui/index.html#/

## 🧪 Tests

JUnit 5 and Mockito were used for writing and executing unit tests at the Service classes. JUnit 5 allowed the testing of individual units of code in isolation and Mockito was used to create mock objects and defining simulated behaviors during unit tests. This combination enables thorough testing of the code's functionality at the unit level, ensuring that each component functions correctly and independently.

For integration testing, the project utilizes JUnit 5 along with MockMvc and Spring Boot Test. MockMvc provides the ability to simulate HTTP requests and receive corresponding responses. The @SpringBootTest and @AutoConfigureMockMvc annotations from Spring Boot Test automatically configure MockMvc for integration testing, creating a test context that closely resembles the actual runtime environment. By employing these technologies, the project verifies the interaction between various components and ensures the integrity of the system as a whole.

## 🖥️ Technologies Used

- [Java 17](https://www.oracle.com/br/java/)
- [Apache Maven 3.9.3](https://maven.apache.org/what-is-maven.html)
- [Springboot 3.1.1](https://spring.io/)
- [XAMPP 8.0.28](https://www.apachefriends.org/pt_br/download.html)
- [MySQL Workbench 8.0.33](https://www.mysql.com/products/workbench/)
- [IntelliJ 2023.1.3](https://www.jetbrains.com/pt-br/idea/)

## 📋 Dependencies

The project's dependencies are in the [pom.xml](https://github.com/teagoodilon/library-ual/blob/main/pom.xml) file composed by the following list:

- [Spring Boot Starter Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
- [Spring Boot Starter Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
- [Spring Boot Starter Test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test)
- [Spring Boot Starter Validation](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation)
- [Spring Boot DevTools](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
- [MySQL Connector/J](https://mvnrepository.com/artifact/mysql/mysql-connector-java)
- [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
- [Mockito Core](https://mvnrepository.com/artifact/org.mockito/mockito-core)
- [Mockito JUnit Jupiter](https://mvnrepository.com/artifact/org.mockito/mockito-junit-jupiter)
- [H2 Database](https://mvnrepository.com/artifact/com.h2database/h2)
- [Springdoc OpenAPI](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui) (2.0.3)

## 😆 Express our thanks
We are extremely grateful to Compass.UOL for the great learning experience in this second challenge and all support we received. We are looking forward to the next ones! 

## 💼 Collaborators

- [Fabrício Moreira Aguiar de Moraes](https://github.com/Moraes-Fabricio)
- [Kallyne Almeida da Rocha](https://github.com/KallyneRocha)
- [Thiago Odilon de Almeida](https://github.com/teagoodilon) 
- [Wolnei Assunçao Cordeiro](https://github.com/WolneiACordeiro)
