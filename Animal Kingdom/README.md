
# Animal Kingdom Simulator

## Objective
This Java application simulates the behaviors of different animals in an animal kingdom using inheritance and polymorphism. It allows you to explore various animal types and their unique behaviors.

## Overview
The application consists of a base class `Animal`, from which several subclasses derive. Each subclass represents a different type of animal and overrides certain methods to provide specific behavior.

## Features
- **Animal Base Class**: Defines common properties and methods for all animals.
- **Subclasses**: 
  - `Dog`: Represents dogs with specific methods and behaviors.
  - `Cat`: Represents cats with their unique methods.
  - `Bird`: Represents birds with flying capabilities and specific sounds.
  - `Fish`: Represents fish and includes swimming behavior inherited from the `Move` class.
- **Interface**: The `Flyable` interface defines flying behavior for birds.
- **Dynamic Method Invocation**: The application dynamically calls methods based on the animal type at runtime.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- An IDE or text editor to run the code.

## Implementation
### Base Class - Animal
- **Properties**: 
  - `name`: (String) The name of the animal.
  - `age`: (int) The age of the animal.
- **Methods**:
  - `eat()`: Prints a general message about eating.
  - `sleep()`: Prints a message about sleeping.
  - `makeSound()`: An abstract method that subclasses must override.
  - `displayInfo()`: Displays the animal's name and age.

### Subclasses
- **Dog Class**: Overrides `makeSound()` to output barking sound and includes `fetch()` behavior.
- **Cat Class**: Overrides `makeSound()` to output meowing sound and includes `scratch()` behavior.
- **Bird Class**: Implements `Flyable` interface, overrides `makeSound()` for bird sounds, and includes `preening()` and `fly()` behaviors.
- **Fish Class**: Inherits from `Move`, overrides `makeSound()` to represent fish sounds and includes behaviors related to eating and sleeping.

### Main Class
- The `Main` class creates instances of each subclass and calls their methods to demonstrate their behaviors.
- It uses an `ArrayList` to store animal objects and iterates through them to invoke methods dynamically based on their types.

## How to Run using Git Bash
1. **Clone the repository** or **download the source code** to your local machine.
   ```bash
   git clone https://github.com/itsvee0120/AD300.git
   cd AD300/"Animal Kingdom"
   ```

2. **Navigate to the project directory** where the Java files are located.

3. **Compile the Java files** using the following command:
   ```bash
   javac Main.java
   ```

4. **Run the application** using the following command:
   ```bash
   java Main
   ```

## Example Output
The application will output various animal behaviors based on the created instances. For example:
```
Benji is 7 years old.
Mainly eats meat: beef, etc.
Mainly sleeps at night.
Benji barks Woof Woof!
Benji is fetching the ball.
```

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests for improvements or new features.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
README.md for "GPA to percent range" assignment is genereated using AI prompt (mainly example cases) then checked by Violet to ensure readality and comprehension.



