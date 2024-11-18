

# Waiting List Manager

## Overview

The **Waiting List Manager** is a Java-based graphical user interface (GUI) application that helps you manage a queue of people in a waiting list. Using Java Swing for the GUI, this application allows you to add, serve, and check people on the waiting list, as well as perform other essential list operations such as deleting, resetting, and displaying the entire list.


## Download the application on to your computer
Download the application Waiting List Manager.exe [here](https://drive.google.com/file/d/1-cXVfzbWB-12AKihTAj7FJfa7fWAcSDF/view?usp=drive_link)

**To download and run the applications please ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
installed on your machine.**

## Demo

## Download the application on to your computer
Download the application Geometry Calculator.exe [here](https://drive.google.com/file/d/1-cXVfzbWB-12AKihTAj7FJfa7fWAcSDF/view?usp=drive_link)

**To download and run the applications please ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
installed on your machine.**

## Demo



https://github.com/user-attachments/assets/06e15a56-8503-42f2-a976-d6823ed06f45





## Features

The application offers the following features:

- **Add Person**: Adds a person to the waiting list.
- **Serve Person**: Removes the next person in line from the waiting list.
- **Check Next Person**: Displays the name of the next person without removing them.
- **Check By Name**: Checks if a specific person is in the waiting list.
- **Delete By Name**: Removes a person from the waiting list based on their name.
- **List Size**: Displays the current size of the waiting list.
- **Display List**: Shows all people in the waiting list.
- **Reset The List**: Clears the entire waiting list.
- **Clear Result Area**: Clears the displayed results in the text area.

## Requirements

- **Java 8** or higher.
- **IDE**: Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or command line.

## Installation and Running the Application

1. **Clone the Repository**:
   Clone this repository to your local machine using Git or download the ZIP file and extract it.

   ```bash
   git clone <repository-url>
   ```

2. **Compile the Program**:
   If using a terminal, navigate to the folder containing `WaitingListManagerGUI.java` and compile it using the following command:

   ```bash
   javac WaitingListManagerGUI.java
   ```

3. **Run the Program**:
   After compilation, run the application with the command:

   ```bash
   java WaitingListManagerGUI
   ```

   Alternatively, you can open the project in an IDE and run the program directly.

## GUI Description

- **Main Frame**: A JFrame containing all components, such as buttons, text fields, and a result area.
- **Enter Name Field**: A text field where users can input the name of a person to be added, checked, or deleted from the waiting list.
- **Buttons**: The application has several buttons for various operations (add, serve, delete, etc.), and each button triggers a specific action on the waiting list.
- **Result Area**: A JTextArea that displays the results of operations like serving a person, checking the list, and errors.

### Layout

- **Title**: The application title "Waiting List Manager" is displayed at the top of the screen.
- **Button Panel**: Buttons are arranged in a grid layout for easy access. The buttons are used to interact with the waiting list.
- **Result Area**: The result area displays the output of each operation, such as the names in the waiting list or an error message.

## Button Actions and Functionality

Each button performs a specific operation on the waiting list:

- **Add Person**: Adds the person entered in the text field to the waiting list if they are not already present. If the name is empty or already exists, a warning message is shown.
- **Serve Person**: Removes the first person in the list (the one who has been waiting the longest) and displays a message with their name.
- **Check Next Person**: Displays the next person in line without removing them.
- **Check By Name**: Allows you to check if a specific name exists in the waiting list.
- **Delete By Name**: Removes a person from the waiting list based on the entered name.
- **List Size**: Displays the current size of the waiting list.
- **Display List**: Displays all names currently in the waiting list.
- **Reset The List**: Clears all entries in the waiting list after a confirmation dialog.
- **Clear Result Area**: Clears the output displayed in the result area.

## Example Usage

### Adding People to the Waiting List:
1. Type a name in the **Enter Name** field.
2. Click **Add Person** to add that person to the list.
3. If the person is already in the list, a message will be shown in the result area.

### Serving People:
1. Click **Serve Person** to serve (remove) the first person in the queue.
2. The name of the served person will be displayed in the result area.

### Checking Next Person:
1. Click **Check Next Person** to display the name of the next person without removing them from the list.

### Deleting a Person by Name:
1. Enter the name of the person to delete in the **Enter Name** field.
2. Click **Delete By Name** to remove them from the list if they are present.

### Displaying the List:
1. Click **Display List** to show all the names in the waiting list.

### Resetting the List:
1. Click **Reset The List** to clear all people from the waiting list after a confirmation dialog.


## Code Structure

The program is structured as follows:

- **WaitingListManagerGUI.java**: The main Java class that contains the GUI and logic for handling the waiting list.
- **Imports**: Uses Java Swing components such as `JFrame`, `JButton`, `JTextArea`, and `JTextField` to create the user interface.
- **Collections**: A `Queue<String>` (LinkedList) is used to maintain the waiting list, and a `Set<String>` (HashSet) is used to track unique names.

## License

This project is open source and available under the [MIT License](LICENSE).

## Contributing

If you want to contribute to the development of this project, feel free to fork the repository, make changes, and submit a pull request. Any contributions are welcome!

## Acknowledgments

- Thanks to the Java community for the Swing library, which makes GUI development in Java accessible and efficient.
- Inspiration for the project came from real-world waiting list management systems.

---

## Known Limitations

- The waiting list is not persistent and resets when the application is closed.
- Names are case-sensitive; "John" and "john" are treated as different names.

---

## Contact

If you have any questions or suggestions, feel free to reach out!

**Author**: Violet Nguyen  
**GitHub**: [itsvee0120](https://github.com/itsvee0120)  
