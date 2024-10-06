
# Animal Kingdom GUI Application

## Overview
The **Animal Kingdom GUI Application** is a Java-based graphical user interface (GUI) that allows users to explore various animals in an engaging and interactive manner. Users can select different animals from a dropdown menu and view detailed information about each one, including their characteristics and behaviors.

## Features
- **Animal Selection**: Users can choose from a list of animals, including Dog, Cat, Fish, Bird, Lion, Rabbit, Elephant, and Cheetah.
- **Dynamic Information Display**: The application updates a text area with specific information about the selected animal, including its name, type, age, eating habits, sleeping habits, and sounds.
- **Animated Interface**: The welcome label moves across the screen, enhancing the user experience.
- **Responsive Design**: The GUI adjusts to show a scrollbar when necessary for easy navigation of animal information.

## Requirements
- Java Development Kit (JDK) version 8 or higher.
- IDE (Integrated Development Environment) such as IntelliJ IDEA, Eclipse, or NetBeans for running the application.

## Installation
### Using Git Bash
1. **Open Git Bash** on your computer.

2. **Clone the Repository**:
 ```bash
  git clone https://github.com/itsvee0120/AD300.git
cd AD300/"Animal Kingdom"
   ```

3. **Navigate to the Project Directory**:
   ```bash
   cd AnimalApp
   ```

4. **Open the Project**:
   - Import the project into your chosen IDE.

5. **Add Required Files**:
   - Ensure that you have the images (`Icon.png` for the application icon and individual animal images) in the project root directory for the GUI to display correctly.

## Running the Application
1. **Compile the `AnimalAppGUI` class** using your IDE.
2. **Execute the `main` method** to launch the application.
3. Use the dropdown menu to select an animal and view its information.

## Code Structure
- **AnimalAppGUI.java**: Main class that creates the GUI and handles animal selection.
- **animals** package: Contains classes for each animal type (e.g., Dog, Cat, Fish, etc.), defining their properties and behaviors.

## Example Usage
- Upon launching the application, you will see a welcome message and a dropdown menu. 
- Selecting "All Animals" will display information for all the animals in the list.
- Choosing a specific animal will provide detailed information about that animal, including its unique behaviors.

## Contributing
Contributions are welcome! If you would like to improve this project, please fork the repository and submit a pull request with your changes.

## License
This project is licensed under the MIT License. See the LICENSE file for more information.
