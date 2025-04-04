# Translator-Service

Text Translator Web App

Overview

The Text Translator Web App is a Spring Boot-based web application designed to translate text into different languages. The application exposes a REST API that will eventually leverage Google Cloud Translation API for high-quality translations.

Status

✅ Spring Boot backend setup

✅ REST API endpoint created

⏳ Google Cloud Translation API integration pending (Reason: Google Cloud Premium account required)

Features (Implemented & Planned)

✅ Implemented Features:

REST API with Spring Boot

Basic endpoint to handle translation requests (currently placeholder logic)

🔜 Planned Features:

Integration with Google Cloud Translation API for actual translation

Improved error handling and validation

Frontend (optional, if necessary)

API Endpoints

1. Translate Text

Endpoint:

GET /api/translate?text=hello&targetLanguage=es

Parameters:

Parameter

Type

Description

text

String

The text to translate

targetLanguage

String

The language code (e.g., es for Spanish)

Response (Current Placeholder):

{
  "translatedText": "Translation placeholder"
}

Pending Integration: Google Cloud Translation API

I plan to integrate Google Cloud Translation API to provide real-time, accurate translations. However, this integration requires a Google Cloud Premium account, which is currently unavailable due to payment issues.

Next Steps

Obtain a Google Cloud Premium account

Implement API integration with Google Cloud Translation

Add unit tests and improve error handling

Running the Project

Prerequisites

Java 17+

Maven

Steps

Clone the repository:

git clone https://github.com/yourusername/text-translator.git
cd text-translator

Build and run the project:

mvn clean install
mvn spring-boot:run

Test the API using Postman or a browser:

http://localhost:8080/api/translate?text=hello&targetLanguage=es

Contributions

Contributions are welcome! If you’d like to contribute, feel free to submit a pull request.

 Stay tuned for future updates!
