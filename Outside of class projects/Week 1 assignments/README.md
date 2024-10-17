
# GPA Converter

## Description

The **GPA Converter** is a Java Swing application that allows users to convert a student's percentage score into a GPA (Grade Point Average) and vice versa according to [North Seattle College's grading system](https://northseattle.edu/college-high-school/grading-information). The application provides a simple and intuitive graphical user interface (GUI) for easy interaction.

## Download GPA Calculator Application
[Click here to download the application to your desktop](https://drive.google.com/file/d/1-ZArE0bHxQnwORupzkxEvYLAlfsP4s8t/view?usp=drive_link)

**Ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your machine.**

## Application Demo


https://github.com/user-attachments/assets/240aa57e-10e3-4a7e-b5c7-c8504e9c5825


## Features

- Input field for entering a student's percentage.
- A button to trigger the GPA/ Percentage conversion.
- Displays the calculated GPA, Percentage or an error message for invalid inputs.
- User-friendly design with clear prompts and results.

## Installation

1. Ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your machine.
2. Clone this repository or download the source code files.

 ```bash
   git clone https://github.com/itsvee0120/AD300.git
   cd AD300/"Outside of class projects"/"Week 1 assignments"
```


3. Compile the Java file using the following command:

   ```bash
   javac GPAConverterGUI.java
   ```

4. Run the application with:

   ```bash
   java GPAConverterGUI
   ```

## Usage

1. Launch the application.
2. Enter the student's percentage in the provided text field.
3. Click on the "Convert to GPA" button.
4. The calculated GPA will be displayed. If the input percentage is invalid, an appropriate error message will be shown.

## Code Structure

- **GPAConverterGUI.java**: The main class that contains the logic for the GPA conversion and the GUI setup.
  - **convertToGPA()**: Method to convert the entered percentage into GPA.
  - **calculateGPA(double percentage)**: Method that determines the GPA based on the percentage input using if-else statements.

## Example

If a student scored **85%**, after entering this value and clicking the "Convert to GPA" button, the application will display:

```
The GPA is: 3.0
```


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This project was created by Violet Nguyen.
- Inspired by [Alex Lee's GUI tutorial](https://www.youtube.com/watch?v=5o3fMLPY7qY.) and other documentations on Java Swing.
- README.md for "GPA to percent range" assignment is genereated using AI prompt (mainly example cases) then checked by Violet to
  ensure readality and comprehension.

