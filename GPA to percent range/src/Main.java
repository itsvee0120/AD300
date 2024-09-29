import java.util.Scanner;

class GPAToPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt the user to enter the GPA or type 'exit' to quit the program
            System.out.print("Enter the student's GPA (0.0 to 4.0) or type 'exit' to quit: ");
            String input = scanner.nextLine();

            // Check if the user wants to exit
            if (input.toLowerCase().equals("exit")) {
                System.out.println("Exiting the program.");
                break; // Exit the loop
            }


            // Try to parse the input to a double
            try {
                double gpa = Double.parseDouble(input);

                // Validate GPA input
                if (gpa < 0.0 || gpa > 4.0) {
                    System.out.println("Invalid GPA. Please enter a value between 0.0 and 4.0.");
                } else {
                    // Determine the percentage range based on GPA using switch
                    String percentRange = switch ((int) (gpa * 10)) { // Convert GPA to an integer range
                        case 40 -> "95% - 100%";
                        case 39 -> "< 95.0% to 94.0%";
                        case 38 -> "< 94.0% to 93.0%";
                        case 37 -> "< 93.0% to 92.0%";
                        case 36 -> "< 92.0% to 91.0%";
                        case 35 -> "< 91.0% to 90.0%";
                        case 34 -> "< 90.0% to 89.0%";
                        case 33 -> "< 89.0% to 88.0%";
                        case 32 -> "< 88.0% to 87.0%";
                        case 31 -> "< 87.0% to 86.0%";
                        case 30 -> "< 86.0% to 85.0%";
                        case 29 -> "< 85.0% to 84.0%";
                        case 28 -> "< 84.0% to 83.0%";
                        case 27 -> "< 83.0% to 82.0%";
                        case 26 -> "< 82.0% to 81.0%";
                        case 25 -> "< 81.0% to 80.0%";
                        case 24 -> "< 80.0% to 79.0%";
                        case 23 -> "< 79.0% to 78.0%";
                        case 22 -> "< 78.0% to 77.0%";
                        case 21 -> "< 77.0% to 76.0%";
                        case 20 -> "< 76.0% to 75.0%";
                        case 19 -> "< 75.0% to 74.0%";
                        case 18 -> "< 74.0% to 73.0%";
                        case 17 -> "< 73.0% to 72.0%";
                        case 16 -> "< 72.0% to 71.0%";
                        case 15 -> "< 71.0% to 70.0%";
                        case 14 -> "< 70.0% to 69.0%";
                        case 13 -> "< 69.0% to 68.0%";
                        case 12 -> "< 68.0% to 67.0%";
                        case 11 -> "< 67.0% to 66.0%";
                        case 10 -> "< 66.0% to 65.0%";
                        default -> "< 65.0% to 0.0%";
                    };
                    // Output the percentage range
                    System.out.println("The percentage range for a GPA of " + gpa + " is: " + percentRange);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric GPA or 'exit' to quit.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
