## Project

In this tutorial, we'll implement a simple Java application applying hexagonal architecture design principles.

Additionally, we'll organize our application layers using Java Modules, which requires JDK version 9 or higher.

With this approach, we'll decouple our core business logic and aim to improve understandability and maintainability.

### Documentation

For a more detailed description please refer to the article:

    https://medium.com/@daniel.strmecki_67382/a-practical-example-of-applying-java-modules-in-a-hexagonal-architecture-d345deec654b
    

### Build

```
mvn clean package
```

### Run

```
java -jar infrastructure/target/infrastructure-1.0-jar-with-dependencies.jar
```

## Database

### Install MySQL

Tested with MySQL Community version 8.0.20.
Download it here: https://dev.mysql.com/downloads/installer/

### Create table

```
USE books_database;
CREATE TABLE books (
    id VARCHAR(40) PRIMARY KEY, 
    title VARCHAR(100) NOT NULL, 
    author VARCHAR(100) NOT NULL, 
    description VARCHAR(100) NOT NULL
);
```