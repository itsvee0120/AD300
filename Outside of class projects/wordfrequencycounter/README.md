# Word Counter & Word Frequency Counter - README

## Overview

The **Word Counter & Word Frequency Counter** application allows users to upload `.doc`, `.docx`, `.pdf` or `.txt` files and view the total word count along with the frequency of each word in the document. The application uses Apache POI for reading `.doc` and `.docx` files, Apache PDFBox for reading `.pdf` files and provides a simple GUI for ease of use.


## Install The App To Your Computer

### If Your Machine Has a JDK/JRE Already

**Please read the version's description carefully as there are significant changes between version 1.1 and 1.2.**

| Description                                                                                                                         | Download Link                                                                                                                       |
|-------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|
| **Version 1.1** - allows users to upload `.doc`, `.docx`, `.txt`                                                                    | [Download Version 1.1](https://drive.google.com/file/d/1E7JWt77YsocIfMO1jU6FJLUTf27BuDpi/view?usp=drive_link)                    |
| **Version 1.2** - allows users to upload `.doc`, `.docx`, `.pdf`, `.txt`                                                          | [Download Version 1.2](https://drive.google.com/file/d/1yaMOlqMzKhqbC7eVtNzbZDhOT0E2dukl/view?usp=drive_link)                    |

---

### If You Do Not Have a JDK/JRE or Are Not Sure

**Please read the version's description carefully as there are significant changes between version 1.1 and 1.2.**

| Description                                                                                                                         | Download Link                                                                                                                       |
|-------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|
| **Version 1.1** - allows users to upload `.doc`, `.docx`, `.txt`                                                                    | [Download Version 1.1](https://drive.google.com/file/d/10NECDFdscUAQr_NG-X8B58qKb7RGO0Jb/view?usp=drive_link)                    |
| **Version 1.2** - allows users to upload `.doc`, `.docx`, `.pdf`, `.txt`                                                          | [Download Version 1.2](https://drive.google.com/file/d/1b6RDZ9vS-NyVeTqQwbsgbqZSVwWAWJU9/view?usp=drive_link)                    |


## Demo

https://github.com/user-attachments/assets/272774fe-d7d5-4b5f-a45e-a60a17b018a6

Here's a sample README for your project, which you can customize further based on your needs:


## Features

- Select and open documents in the following formats:
  - Microsoft Word (.doc and .docx)
  - Portable Document Format (.pdf)
  - Plain Text (.txt)
- Count total words and display word frequencies.
- A user-friendly GUI with buttons for selecting files and resetting results.
- Displays results in a scrollable text area.

## Technologies Used

- Java
- Apache PDFBox
- Apache POI
- Swing for the GUI

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/itsvee0120/AD300.git
   ```

2. **Set up your Java environment:**
   Ensure you have Java Development Kit (JDK) installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

3. **Add dependencies:**
   The `pom.xml` file in this project should be enough, However if needed, please, include the following libraries in your project:
   - [Apache PDFBox](https://pdfbox.apache.org/download.cgi)
   - [Apache POI](https://poi.apache.org/download.html)

   You can add them to your project manually or use a build tool like Maven or Gradle.

5. **Compile and run:**
   Compile the Java files and run the `Main` class to launch the application.

   ```bash
   javac Main.java
   java Main
   ```

## Usage

1. Click on the **"Select File"** button to open the file chooser dialog.
2. Choose a document (.doc, .docx, .pdf, or .txt) from your file system.
3. The application will display the total word count and the frequency of each word in the document.
4. Click on the **"Reset"** button to clear the results and start over.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Special thanks to the creators of Apache PDFBox and Apache POI for their excellent libraries that made this project possible.

