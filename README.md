# GestorEmail

GestorEmail is a Java-based email client application that allows users to send emails using the JavaFX framework for the user interface and Apache Commons Email for email handling.

## Features

- Send emails using SMTP
- SSL/TLS support
- User-friendly interface built with JavaFX
- Clear input fields
- Close application

## Requirements

- Java 22 or higher
- Maven
- Internet connection

## Dependencies

The project uses the following dependencies:

- `org.openjfx:javafx-controls:22.0.1`
- `org.openjfx:javafx-fxml:22.0.1`
- `org.apache.commons:commons-email:1.5`
- `jakarta.servlet:jakarta.servlet-api:6.1.0`

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/AfroOrange/GestorEmail.git
    cd GestorEmail
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

## Usage

1. Run the application:
    ```sh
    mvn exec:java 
    ```

2. Fill in the required fields in the application interface:
    - **Servidor SMTP**: SMTP server name (e.g., `smtp.gmail.com`)
    - **Puerto**: SMTP port (e.g., `465` for SSL or `587` for TLS)
    - **Usar conexión SSL**: Check if using SSL
    - **Remitente (From)**: Sender's email address
    - **Contraseña**: Sender's email password
    - **Destinatario (To)**: Recipient's email address
    - **Asunto (Subject)**: Email subject
    - **Mensaje**: Email message

3. Click the **Enviar** button to send the email.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [JavaFX](https://openjfx.io/)
- [Apache Commons Email](https://commons.apache.org/proper/commons-email/)
- [Maven](https://maven.apache.org/)
