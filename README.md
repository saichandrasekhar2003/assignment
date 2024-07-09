# Swiggy

# Magical Arena

## Overview
This project simulates a magical arena where players battle until one player's health reaches zero. Each player has attributes for health, strength, and attack.

## Project Structure
- **src/main/java**: Contains the main source code.
- **src/test/java**: Contains the test code.

## How to Compile and Run the Project
To compile and run the project, follow these steps:

1. **Open Command Line/Terminal**: Navigate to the project directory.

2. **Compile the Code**: Use Maven to compile the project.
   ```sh
   mvn compile

Run the Application: Execute the main class to start the game
mvn exec:java -Dexec.mainClass="net.javaguides.gamerpro.Main"


Instructions for Running Tests (JUnit Tests):-
To run the JUnit tests included in the project, use Maven:
mvn test

Dependencies or Prerequisites
Java Development Kit (JDK) 8 or higher
Apache Maven for building and managing dependencies
Assumptions and Special Considerations
Players attack in turns based on their health; the player with lower health attacks first.
Attack and defense outcomes are determined by rolling six-sided dice.
The game ends when one player's health drops to zero.


### Explanation of Sections:
- **Overview**: Briefly describes what your project does.
- **Project Structure**: Outlines where different parts of your project are located (`src/main/java` for source code, `src/test/java` for test code).
- **How to Compile and Run**: Provides step-by-step instructions for compiling and running your project using Maven.
- **Instructions for Running Tests**: Describes how to execute JUnit tests using Maven.
- **Dependencies or Prerequisites**: Lists any software or tools required to build and run your project.
- **Assumptions and Special Considerations**: Notes any assumptions made during development or special conditions that affect the game simulation.

Feel free to customize this template further based on specific details of your project or additional information required by your project guidelines. This structured approach will help users understand and interact with your project effectively.
