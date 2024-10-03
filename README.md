Overview
This project is a Password Generator application built using Spring Boot. It allows users to generate secure passwords based on customizable parameters such as length, inclusion of special characters, numbers, and upper/lowercase letters. The project serves as a foundational example for those looking to explore Spring Boot frameworks and RESTful services in a simple yet practical application.

Features
Generate secure passwords with customizable options:
Specify length of the password.
Include or exclude special characters.
Toggle numbers and uppercase/lowercase letters.
REST API endpoints for generating passwords.
Basic user interface for interacting with the API.

Project Structure
The project is structured as follows:
password-generator-spring-boot
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.passwordgenerator
│   │   │       ├── controllers
│   │   │       ├── services
│   │   │       └── PasswordGeneratorApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
├── README.md
├── pom.xml
└── ...

How to Run the Project
Clone the repository:

git clone https://github.com/Vighnesh-Hagavane/password-generator-spring-boot.git
Navigate to the project directory:
cd password-generator-spring-boot
Build and run the application using Maven:
mvn spring-boot:run
Open a browser and navigate to http://localhost:8080 to access the application.

REST Endpoints
GET /generate: Generate a password with default settings.
GET /generate?length=12&includeSpecial=true&includeNumbers=true: Customize password generation using query parameters.

Dependencies
Spring Boot Starter Web: For building web applications.
Spring Boot Starter Test: For unit testing the application.

Future Enhancements
Add authentication to secure the endpoints.
Build a frontend interface with user controls.
Store generated passwords in a database for history tracking.

Contributing
Feel free to fork this repository and contribute by opening pull requests. Suggestions for new features and enhancements are welcome!

License
This project is licensed under the MIT License. See the LICENSE file for details.

Author
Vighnesh Hagavane
GitHub: Vighnesh-Hagavane
