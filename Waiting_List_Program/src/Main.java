import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WaitingListManager manager = new WaitingListManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Waiting List Manager ---");
            System.out.println("1. Add Person");
            System.out.println("2. Serve Person");
            System.out.println("3. Next Person On The List");
            System.out.println("4. Check if Person is in List");
            System.out.println("5. Display Waiting List");
            System.out.println("6. Show Waiting List Size");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (Number 0 to 6): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice >= 0 && choice <= 6) {
                switch (choice) {
                    case 1:
                        System.out.print("Enter name to add: ");
                        String nameToAdd = scanner.nextLine();
                        manager.addPerson(nameToAdd);
                        break;
                    case 2:
                        System.out.println(manager.servePerson());
                        break;
                    case 3:
                        System.out.println(manager.nextServePerson());
                        break;
                    case 4:
                        System.out.print("Enter name to check: ");
                        String nameToCheck = scanner.nextLine();
                        if (manager.isPersonInList(nameToCheck)) {
                            System.out.println(nameToCheck + " is in the waiting list.");
                        } else {
                            System.out.println(nameToCheck + " is not in the waiting list.");
                        }
                        break;
                    case 5:
                        manager.displayWaitingList();
                        break;
                    case 6:
                        System.out.println("Waiting list size: " + manager.waitingListSize());
                        break;
                    case 0:
                        System.out.println("Exiting program. Goodbye!");
                        break;
                }
            } else {
                System.out.println("Invalid choice. Please enter a number between 0 and 6.");
            }
        } while (choice != 0);

        scanner.close(); // Close scanner after exiting the loop
    }
}
