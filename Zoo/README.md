
# Zoo Demo

## Objective
This Java application simulates the behaviors of different animals in a zoo environment using inheritance and polymorphism. It allows you to explore various animal types and their unique sounds.

## Overview
The application consists of a base class `Animal`, from which several subclasses derive. Each subclass represents a different type of animal and overrides certain methods to provide specific behavior.

## Features
- **Animal Base Class**: Defines common properties and methods for all animals.
- **Subclasses**:
  - **Lion**: Represents lions and their distinctive sounds.
  - **Elephant**: Represents elephants  and their distinctive sounds.
  - **Monkey**: Represents monkeys and their distinctive sounds.
- **Overloading Methods**: The application demonstrates method overloading by allowing animals to make sounds multiple times.
- **Dynamic Method Invocation**: The application dynamically calls methods based on the animal type at runtime.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- An IDE or text editor to run the code.

## Implementation

### Base Class - Animal
- **Properties**:
  - `name`: (String) The name of the animal.
- **Methods**:
  - `makeSound()`: An abstract method that subclasses must override.
  - `makeSound(int times)`: Overloaded method that prints the sound multiple times.
  - `getName()`: Returns the name of the animal.

### Subclasses
- **Lion Class**: Overrides `makeSound()` to output a roaring sound.
- **Elephant Class**: Overrides `makeSound()` to output a trumpeting sound.
- **Monkey Class**: Overrides `makeSound()` to output monkey sounds.

### Main Class
The `ZooDemo` class creates instances of each subclass and calls their methods to demonstrate their behaviors. It uses an `ArrayList` to store animal objects and iterates through them to invoke methods dynamically based on their types.

## How to Run using Git Bash
1. Clone the repository or download the source code to your local machine.

   ```bash
   git clone https://github.com/itsvee0120/AD300.git
   cd AD300/"Zoo"
   ```

2. Navigate to the project directory where the Java files are located.

3. Compile the Java files using the following command:

   ```bash
   javac ZooDemo.java Animal.java Lion.java Elephant.java Monkey.java
   ```

4. Run the application using the following command:

   ```bash
   java ZooDemo
   ```

## How to Run by Downloading ZIP
1. Download the ZIP file of the repository from GitHub.
2. Go to the repository page and click on the green "Code" button.
3. Select "Download ZIP."
4. Extract the ZIP file to a desired location on your machine.
5. Open your terminal or command prompt and navigate to the extracted project directory:

   ```bash
   cd path/to/extracted/Zoo
   ```

6. Compile the Java files using the following command:

   ```bash
   javac ZooDemo.java Animal.java Lion.java Elephant.java Monkey.java
   ```

7. Run the application using the following command:

   ```bash
   java ZooDemo
   ```

## Example Output
The application will output various animal sounds based on the created instances. For example:

```
Maddie makes a sound like this:
 Roar
Maddie can make multiple sounds like this:
 Roar Roar Roar

Del makes a sound like this:
 Trumpet
Del can make multiple sounds like this:
 Trumpet Trumpet Trumpet

Robin makes a sound like this:
 Ooh Ooh Ah Ah
Robin can make multiple sounds like this:
 Ooh Ooh Ah Ah Ooh Ooh Ah Ah Ooh Ooh Ah Ah
```

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests for improvements or new features.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
README.md for the "Zoo Demo" assignment is generated using AI prompts (mainly example cases) then checked by Violet to ensure readability and comprehension.

