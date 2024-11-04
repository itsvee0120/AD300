# Word Counter & Word Frequency Counter - README

## Overview

The **Word Counter & Word Frequency Counter** application allows users to upload `.doc`, `.docx`, or `.txt` files and view the total word count along with the frequency of each word in the document. The application uses Apache POI for reading `.doc` and `.docx` files, and provides a simple GUI for ease of use.

## Install The App To Your Computer
* If your machine has a JDK/JRE already click on [this link to download the app](https://drive.google.com/file/d/1E7JWt77YsocIfMO1jU6FJLUTf27BuDpi/view?usp=drive_link)
* If you do not have a JDK/JRE or not sure click on [this link to install using an installer](https://drive.google.com/file/d/10NECDFdscUAQr_NG-X8B58qKb7RGO0Jb/view?usp=drive_link)

## Features

- **File Selection**: Users can upload `.doc`, `.docx`, or `.txt` files using a "Select File" button.
- **Word Count Display**: Displays the total word count of the selected file.
- **Word Frequency Count**: Lists each unique word along with its frequency.
- **Reset Functionality**: Clears the display areas for a fresh start.
- **GUI Components**:
    - File selection and reset buttons.
    - Display areas for word count and frequency.
    - Basic image logo integration for a personalized UI.

## Technologies

- **Java Swing** for the graphical user interface (GUI).
- **Apache POI** for reading and extracting content from `.doc` and `.docx` files.

## Installation and Setup

1. **Clone or download the repository** containing this code.
2. **Add Apache POI Library**:
    - Download the latest Apache POI libraries from [Apache POI](https://poi.apache.org/download.html).
    - Include `poi`, `poi-ooxml`, and any other required JAR files in your project’s build path.

3. **Run the Program**:
    - Compile and run the `MyFrame` class to launch the application.

## Usage Instructions

1. **Launch the Application**: Run the `MyFrame` class to open the application window.
2. **Select a File**: Click the "Select File" button, choose a `.doc`, `.docx`, or `.txt` file from your computer, and confirm.
3. **View Results**:
    - The **total word count** appears in the bottom text area.
    - The **word frequency list** is displayed in the main results area with indented formatting.
4. **Reset the Display**: Click the "Reset" button to clear all text areas and prepare for a new file selection.

## Code Structure

- **Main Class**: `MyFrame`
    - **GUI Components**:
        - `JFrame`, `JLabel`, `JButton`, `JTextArea`, `JScrollPane` for the main UI layout.
        - `selectButton` and `resetButton` for file selection and resetting the text areas.
    - **File Reading Methods**:
        - `readDocFile(File file)`: Reads `.doc` files.
        - `readDocxFile(File file)`: Reads `.docx` files.
        - `readTxtFile(File file)`: Reads `.txt` files and calculates word frequencies.
    - **Helper Methods**:
        - `appendIndentedResult(String text)`: Appends formatted text to `resultArea`.
        - `processParagraphs(String[] paragraphs)`: Processes paragraphs to calculate word counts and frequencies.

## Notes

- Ensure that the `src/main/resources` directory contains an image file named `frog.png` (used as an icon in the button panel).
- Modify `fileChooser.setCurrentDirectory` to set a default directory if needed.
- The application currently supports English words and strips punctuation; this can be adapted to support other languages.

## Dependencies

- Java JDK 8 or above
- Apache POI libraries (for `.doc` and `.docx` file reading)

## License

This project is open source under the MIT License.

Enjoy using the **Word Counter & Word Frequency Counter**!
