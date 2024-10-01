# Percent to GPA Conversion Program

## Description

This program converts a student's percentage grade into their GPA (Grade Point Average) based on a predefined scale. Users are prompted to enter a percentage, and the program outputs the corresponding GPA value.

## Requirements

- **Java JDK** installed on your machine.
- A **command line terminal** to compile and run the program.

## How to Run the Program

1. **Compile the Program:**
   - Open a terminal and navigate to the folder where the program file (`PercentToGPA.java`) is saved.
   - Compile the program using the following command:
     ```
     javac PercentToGPA.java
     ```

2. **Run the Program:**
   - Once compiled, run the program with the following command:
     ```
     java PercentToGPA
     ```

3. **Input a Grade Percentage:**
   - The program will prompt you to enter a percentage grade:
     ```
     Enter student's grade in percentage (example: 90 or 90.0):
     ```
   - Enter a valid percentage between **0.0 and 100.0**.

4. **View the GPA Output:**
   - After entering the percentage, the program will display the corresponding GPA based on the following scale:
     - For example, if you enter **90**, the output will be:
       ```
       The GPA is: 3.5
       ```

## GPA Conversion Table

| Percentage Range | GPA  |
|------------------|------|
| 95.0 - 100.0     | 4.0  |
| 94.0 - 94.9      | 3.9  |
| 93.0 - 93.9      | 3.8  |
| 92.0 - 92.9      | 3.7  |
| ...              | ...  |
| 65.0 - 65.9      | 1.0  |
| 0.0 - 64.9       | 0.0  |

## Error Handling

- If the input percentage is outside the valid range (i.e., less than 0 or greater than 100), the program will display an error message:
  ```
  Invalid percentage entered.
  ```

## Notes

- Ensure that the input is a **valid numeric value** (e.g., 85 or 85.0). Non-numeric inputs will cause the program to crash.
  
----------------***Disclaimer***------------------------------------------------------------------------------------------------------------
* README.md for "GPA to percent range" assignment is genereated using AI prompt (mainly example cases) then checked by Violet to
  ensure readality and comprehension.
