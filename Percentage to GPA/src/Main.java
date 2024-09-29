import java.util.Scanner;

class PercentToGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for student percentage
        System.out.print("Enter student's grade in percentage (example: 90 or 90.0): ");
        double input = scanner.nextDouble();

        // Variable to hold the GPA value
        double gpa = 0.0;

        // Check the percentage range using if-else statements
        if (input >= 95.0 && input <= 100.0) {
            gpa = 4.0;
        } else if (input >= 94.0 && input < 95.0) {
            gpa = 3.9;
        } else if (input >= 93.0 && input < 94.0) {
            gpa = 3.8;
        } else if (input >= 92.0 && input < 93.0) {
            gpa = 3.7;
        } else if (input >= 91.0 && input < 92.0) {
            gpa = 3.6;
        } else if (input >= 90.0 && input < 91.0) {
            gpa = 3.5;
        } else if (input >= 89.0 && input < 90.0) {
            gpa = 3.4;
        } else if (input >= 88.0 && input < 89.0) {
            gpa = 3.3;
        } else if (input >= 87.0 && input < 88.0) {
            gpa = 3.2;
        } else if (input >= 86.0 && input < 87.0) {
            gpa = 3.1;
        } else if (input >= 85.0 && input < 86.0) {
            gpa = 3.0;
        } else if (input >= 84.0 && input < 85.0) {
            gpa = 2.9;
        } else if (input >= 83.0 && input < 84.0) {
            gpa = 2.8;
        } else if (input >= 82.0 && input < 83.0) {
            gpa = 2.7;
        } else if (input >= 81.0 && input < 82.0) {
            gpa = 2.6;
        } else if (input >= 80.0 && input < 81.0) {
            gpa = 2.5;
        } else if (input >= 79.0 && input < 80.0) {
            gpa = 2.4;
        } else if (input >= 78.0 && input < 79.0) {
            gpa = 2.3;
        } else if (input >= 77.0 && input < 78.0) {
            gpa = 2.2;
        } else if (input >= 76.0 && input < 77.0) {
            gpa = 2.1;
        } else if (input >= 75.0 && input < 76.0) {
            gpa = 2.0;
        } else if (input >= 74.0 && input < 75.0) {
            gpa = 1.9;
        } else if (input >= 73.0 && input < 74.0) {
            gpa = 1.8;
        } else if (input >= 72.0 && input < 73.0) {
            gpa = 1.7;
        } else if (input >= 71.0 && input < 72.0) {
            gpa = 1.6;
        } else if (input >= 70.0 && input < 71.0) {
            gpa = 1.5;
        } else if (input >= 69.0 && input < 70.0) {
            gpa = 1.4;
        } else if (input >= 68.0 && input < 69.0) {
            gpa = 1.3;
        } else if (input >= 67.0 && input < 68.0) {
            gpa = 1.2;
        } else if (input >= 66.0 && input < 67.0) {
            gpa = 1.1;
        } else if (input >= 65.0 && input < 66.0) {
            gpa = 1.0;
        } else if (input >= 0.0 && input < 65.0) {
            gpa = 0.0;
        } else {
            System.out.println("Invalid percentage entered.");
            return;
        }
        // Output the calculated GPA
        System.out.println("The GPA is: " + gpa);
    }
}

