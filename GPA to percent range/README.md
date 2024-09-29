### **How to Interact with the GPA-to-Percentage Program**

#### **1. Starting the Program**
To begin, run the program in your preferred Java environment. This can be done through an IDE like Eclipse or IntelliJ, or via the command line if you have Java installed.

#### **2. User Input Prompts**
Once the program starts, you will be greeted with a prompt asking you to enter the student's GPA. The prompt will look like this:

```
Enter the student's GPA (0.0 to 4.0) or type 'exit' to quit:
```

#### **3. Entering a GPA**
You can input a GPA as a numeric value between **0.0 and 4.0**. For example:
- **Valid Input:** `3.5`
- **Invalid Input:** `5.0`, `-1.0`, or any non-numeric characters (e.g., `abc`).

#### **4. Exiting the Program**
If you wish to exit the program at any time, simply type **`exit`** and press **Enter**. The program will respond with:

```
Exiting the program.
```

#### **5. Receiving Output**
After entering a valid GPA:
- The program will calculate and display the corresponding percentage range for that GPA. For example, if you enter `3.5`, the output might look like this:

```
The percentage range for a GPA of 3.5 is: < 91.0% to 90.0%
```

#### **6. Handling Errors**
- **Invalid Numeric Input:** If you enter a GPA that is not a number or outside the allowed range (0.0 to 4.0), the program will notify you:

```
Invalid input. Please enter a numeric GPA or 'exit' to quit.
```

- **Out-of-Range GPA:** If you enter a valid number but it’s outside the specified range (e.g., `-1.0` or `5.0`), the program will output:

```
Invalid GPA. Please enter a value between 0.0 and 4.0.
```

#### **7. Repeating the Process**
After entering a GPA or exiting the program, the prompt will reappear, allowing you to enter another GPA or type `exit` to quit. You can continue this process as many times as you like.

### **Example Interaction**
Here’s an example of what a user interaction might look like:

```
Enter the student's GPA (0.0 to 4.0) or type 'exit' to quit: 3.8
The percentage range for a GPA of 3.8 is: < 94.0% to 93.0%
Enter the student's GPA (0.0 to 4.0) or type 'exit' to quit: abc
Invalid input. Please enter a numeric GPA or 'exit' to quit.
Enter the student's GPA (0.0 to 4.0) or type 'exit' to quit: exit
Exiting the program.
```

### **Conclusion**
This program provides a straightforward way to convert GPA to percentage ranges. Remember to enter a GPA within the valid range or type `exit` to terminate the program when you're done.

