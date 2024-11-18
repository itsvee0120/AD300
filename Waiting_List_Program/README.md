
# Waiting List Manager

A simple Java program that simulates a waiting list for a service (e.g., a restaurant or a doctor's office). The application uses a **Queue** to manage the order of people and a **Set** to ensure no duplicate entries.

## Features

- **Add a Person**: Add someone to the waiting list, ensuring no duplicates.
- **Serve a Person**: Serve and remove the person at the front of the queue.
- **View the Next Person**: See who's next without removing them from the list.
- **Check Membership**: Verify if a specific person is on the list.
- **Display the Waiting List**: View all names in the order they will be served.
- **Check the List Size**: See the total number of people in the waiting list.

## Technologies Used

- **Java Collections Framework**:
    - `Queue` implemented with a `LinkedList` for maintaining order.
    - `Set` implemented with a `HashSet` for efficient uniqueness checks.
- **Text-based User Interface**: Interactive console input for managing the waiting list.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)** version 8 or higher.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or the `javac` compiler for manual execution.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/itsvee0120/AD300.git
   ```
2. Navigate to the project directory:
   ```bash
   cd AD300/WaitingListManager
   ```

3. Open the project in your preferred Java IDE or compile the files manually.

### Running the Program

#### Using an IDE:
1. Open the `Main` class.
2. Run the program directly.

#### Using the Command Line:
1. Compile the program:
   ```bash
   javac Main.java WaitingListManager.java
   ```
2. Run the program:
   ```bash
   java Main
   ```

## How to Use

Upon running the program, a menu-driven interface will appear. Select options by entering the corresponding number:

1. **Add a Person**: Enter the name to add to the waiting list.
2. **Serve a Person**: Serve and remove the first person in line.
3. **View the Next Person**: Check who's next without removing them.
4. **Check Membership**: Enter a name to see if it's already in the waiting list.
5. **Display the Waiting List**: View all names in the order they will be served.
6. **Check the List Size**: See how many people are in the list.
7. **Exit**: Exit the program.

### Example Interaction

```plaintext
--- Waiting List Manager ---
1. Add Person
2. Serve Person
3. Next Person On The List
4. Check if Person is in List
5. Display Waiting List
6. Show Waiting List Size
0. Exit
Enter your choice (Number 0 to 6): 1
Enter name to add: Alice
Alice has been added to the waiting list.

Enter your choice (Number 0 to 6): 2
Serving: Alice

Enter your choice (Number 0 to 6): 3
The waiting list is empty.

Enter your choice (Number 0 to 6): 0
Exiting program. Goodbye!
```

## Code Structure

- **`Main`**: The execution class that contains the interactive menu for user input.
- **`WaitingListManager`**: Handles the core logic, using:
    - A `Queue` (`LinkedList`) to manage the order of people.
    - A `Set` (`HashSet`) to prevent duplicate entries.

## Repository

The project is hosted on GitHub at: [AD300](https://github.com/itsvee0120/AD300.git)

## Future Enhancements

- Add an option to prioritize certain people in the waiting list.
- Save and load the waiting list from a file for persistence.
- Add error handling for invalid inputs.

## License

This project is licensed under the MIT License.

