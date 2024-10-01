import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPAConverterGUI extends JFrame {
    private final JTextField percentageField;
    private final JLabel resultLabel;

    public GPAConverterGUI() {
        // Set up the frame
        setTitle("GPA Converter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the panel and set its layout
        // Declare the panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); // Add padding


        // Create and add components
        JLabel title = new JLabel("NSC GPA Converter - Violet Nguyen");
        JLabel promptLabel = new JLabel("Enter student's percentage:");
        percentageField = new JTextField(10);
        JButton button = new JButton("Convert to GPA");
        resultLabel = new JLabel( "The GPA is: ");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertToGPA();
            }
        });

        // Add components to the panel
        panel.add(title);
        panel.add(promptLabel);
        panel.add(percentageField);
        panel.add(button);
        panel.add(resultLabel);

        // Add the panel to the frame
        add(panel);
    }

    private void convertToGPA() {
        try {
            // Get the percentage from the text field
            double percentage = Double.parseDouble(percentageField.getText());
            double gpa = calculateGPA(percentage);

            if (gpa < 0) {
                resultLabel.setText("Invalid percentage entered.");
            } else {
                resultLabel.setText("The GPA is: " + gpa);
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a number.");
        }
    }

    private double calculateGPA(double percentage) {
        // Check the percentage range using if-else statements
        if (percentage >= 95.0 && percentage <= 100.0) {
            return 4.0;
        } else if (percentage >= 94.0) {
            return 3.9;
        } else if (percentage >= 93.0) {
            return 3.8;
        } else if (percentage >= 92.0) {
            return 3.7;
        } else if (percentage >= 91.0) {
            return 3.6;
        } else if (percentage >= 90.0) {
            return 3.5;
        } else if (percentage >= 89.0) {
            return 3.4;
        } else if (percentage >= 88.0) {
            return 3.3;
        } else if (percentage >= 87.0) {
            return 3.2;
        } else if (percentage >= 86.0) {
            return 3.1;
        } else if (percentage >= 85.0) {
            return 3.0;
        } else if (percentage >= 84.0) {
            return 2.9;
        } else if (percentage >= 83.0) {
            return 2.8;
        } else if (percentage >= 82.0) {
            return 2.7;
        } else if (percentage >= 81.0) {
            return 2.6;
        } else if (percentage >= 80.0) {
            return 2.5;
        } else if (percentage >= 79.0) {
            return 2.4;
        } else if (percentage >= 78.0) {
            return 2.3;
        } else if (percentage >= 77.0) {
            return 2.2;
        } else if (percentage >= 76.0) {
            return 2.1;
        } else if (percentage >= 75.0) {
            return 2.0;
        } else if (percentage >= 74.0) {
            return 1.9;
        } else if (percentage >= 73.0) {
            return 1.8;
        } else if (percentage >= 72.0) {
            return 1.7;
        } else if (percentage >= 71.0) {
            return 1.6;
        } else if (percentage >= 70.0) {
            return 1.5;
        } else if (percentage >= 69.0) {
            return 1.4;
        } else if (percentage >= 68.0) {
            return 1.3;
        } else if (percentage >= 67.0) {
            return 1.2;
        } else if (percentage >= 66.0) {
            return 1.1;
        } else if (percentage >= 65.0) {
            return 1.0;
        } else if (percentage >= 0.0) {
            return 0.0;
        } else {
            return -1.0; // Indicate invalid percentage
        }
    }

    public static void main(String[] args) {
        // Run the GUI
        SwingUtilities.invokeLater(() -> {
            GPAConverterGUI converterGUI = new GPAConverterGUI();
            converterGUI.setVisible(true);
        });
    }
}
