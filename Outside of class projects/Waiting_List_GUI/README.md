# Waiting List Manager - README

## Project Overview

The **Waiting List Manager** is a Java-based GUI application that allows users to manage a queue of individuals waiting for service. It provides an intuitive interface for adding, serving, and managing names in a waiting list, ensuring that each name is unique and handled systematically.

This project demonstrates the use of Java Swing for GUI design and data structures like `Queue` and `Set` to manage the waiting list efficiently.

---

## Download the application on to your computer
Download the application Geometry Calculator.exe [here](https://drive.google.com/file/d/1-r_EyXH2sYvOoGV2jGeMgnPpQSmV1TQQ/view?usp=drive_link)

**To download and run the applications please ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
installed on your machine.**


## Features

1. **Add Person**  
   Adds a new person to the waiting list. Ensures that duplicate names are not allowed.

2. **Serve Person**  
   Removes the next person in line from the waiting list and displays their name.

3. **Check Next Person**  
   Displays the name of the person who will be served next without removing them from the list.

4. **Check By Name**  
   Verifies if a specific name exists in the waiting list.

5. **List Size**  
   Displays the current number of people in the waiting list.

6. **Display List**  
   Shows all names currently in the waiting list.

7. **Reset**  
   Clears the entire waiting list and resets the input and result areas.

---

## How to Run

1. **Prerequisites**  
   Ensure you have Java installed on your system. The program requires **Java 8** or later.

2. **Compilation and Execution**
    - Compile the program using the following command:
      ```bash
      javac WaitingListManagerGUI.java
      ```
    - Run the program with:
      ```bash
      java WaitingListManagerGUI
      ```

3. The GUI window will launch, and you can interact with the application using the provided buttons and text fields.

---

## GUI Components

- **Title**: Displays the application title at the top of the window.
- **Name Input Field**: A text field for entering names to add or check in the waiting list.
- **Buttons**: Each button performs a specific action related to the waiting list.
- **Result Display Area**: A scrollable text area for displaying messages and the waiting list status.

---

## Code Highlights

1. **Data Structures**:
    - `Queue<String>`: Used to manage the order of names in the waiting list.
    - `Set<String>`: Ensures that names are unique.

2. **Swing Components**:
    - `JFrame`: Main application window.
    - `JTextField`: Input field for user input.
    - `JTextArea` and `JScrollPane`: For displaying results with a scrollable view.
    - `JButton`: Interactive buttons to trigger actions.

3. **Event Handling**:  
   All buttons are equipped with `ActionListener` to handle user actions.

4. **User Feedback**:  
   The `resultArea` provides real-time feedback for all operations.

---

## Example Usage

1. **Adding Names**:
    - Enter "John" in the name field and click *Add Person*.  
      Output:
      ```
      John has been added to the waiting list.
      ```

2. **Serving a Person**:
    - Click *Serve Person*.  
      Output:
      ```
      John has been served.
      ```

3. **Displaying the List**:
    - Click *Display List*.  
      Output:
      ```
      Waiting List: Alice, Bob, Charlie
      ```

4. **Resetting the List**:
    - Click *Reset*.  
      Output:  
      (Clears all data)

---

## Customization

1. **Modify GUI Appearance**:
    - Change colors, fonts, and layout settings by modifying the `initializeGUI()` method.

2. **Extend Functionality**:
    - Add features like saving/loading the waiting list or integrating a database for persistence.

---

## Known Limitations

- The waiting list is not persistent and resets when the application is closed.
- Names are case-sensitive; "John" and "john" are treated as different names.

---

## Contact

If you have any questions or suggestions, feel free to reach out!

**Author**: Violet Nguyen  
**GitHub**: [itsvee0120](https://github.com/itsvee0120)  
