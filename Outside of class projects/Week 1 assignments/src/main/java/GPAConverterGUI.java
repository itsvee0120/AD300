import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPAConverterGUI extends JFrame {
    private JPanel titlePanel, dropDownPanel, promptPanel, buttonPanel, resultPanel;
    private JTextField percentageField, GPAField;
    private JLabel percentageLabel, gpaLabel, title;
    private JComboBox<String> selector;
    private JButton calculateButton, resetButton;
    private JTextArea resultTextArea;

    public GPAConverterGUI() {
        // Set up the frame
        setTitle("GPA Converter - Violet Nguyen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(this.getClass().getResource("/gpa.png")).getImage());
        setLayout(new BorderLayout());

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(182, 209, 250));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Title setup
        title = new JLabel("NSC | GPA Converter", SwingConstants.CENTER);
        title.setFont(new Font("Monospaced", Font.BOLD, 20));
        ImageIcon img = new ImageIcon(this.getClass().getResource("/frog.png"));
        title.setIcon(resizeImageIcon(img, 100, 100));
        title.setVerticalTextPosition(SwingConstants.BOTTOM);
        title.setHorizontalTextPosition(SwingConstants.CENTER);

        titlePanel = createPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(title);

        // Selector dropdown setup
        selector = new JComboBox<>(new String[]{"Select Calculator", "GPA to Percentage", "Percentage to GPA"});
        selector.addActionListener(new SelectorListener());

        dropDownPanel = createPanel(new FlowLayout(FlowLayout.CENTER));
        dropDownPanel.add(selector);

        // Prompt panel setup
        percentageLabel = new JLabel("Enter percentage:");
        percentageField = new JTextField(10);
        gpaLabel = new JLabel("Enter GPA:");
        GPAField = new JTextField(10);

        promptPanel = createPanel(new FlowLayout(FlowLayout.CENTER));
        promptPanel.add(percentageLabel);
        promptPanel.add(percentageField);
        promptPanel.add(gpaLabel);
        promptPanel.add(GPAField);

        // Button setup
        calculateButton = new JButton("Calculate");
        resetButton = new JButton("Reset");
        calculateButton.setBackground(new Color(99, 155, 253, 255));
        resetButton.setBackground(new Color(156, 122, 236, 255));

        buttonPanel = createPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(calculateButton);
        buttonPanel.add(resetButton);

        // Result text area setup
        resultTextArea = new JTextArea(3, 26);
        resultTextArea.setText("Result will show here");
        resultTextArea.setFont(new Font("Monospaced", Font.BOLD, 15));
        resultTextArea.setLineWrap(true);

        resultTextArea.setWrapStyleWord(true);
        resultTextArea.setEditable(false);

        resultPanel = createPanel(new FlowLayout(FlowLayout.CENTER));
        resultTextArea.setBackground(new Color(190, 203, 224));
        resultPanel.add(new JScrollPane(resultTextArea));
        resultTextArea.setVisible(false);  // Hide JTextArea if no valid option is selected
        resultPanel.setVisible(false);

        // Add action listeners
        calculateButton.addActionListener(new CalculateButtonListener());
        resetButton.addActionListener(e -> resetFields());

        // Add panels to main panel
        panel.add(titlePanel, BorderLayout.NORTH);
        panel.add(dropDownPanel, BorderLayout.CENTER);
        panel.add(promptPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        panel.add(resultPanel, BorderLayout.SOUTH);

        // Initial frame size and setup
        setPreferredSize(new Dimension(300, 280));
        setMinimumSize(new Dimension(300, 280));
        add(panel);
        pack();
        setLocationRelativeTo(null); // Center on screen
        updateVisibility(false, false); // Hide elements on startup
    }

    private JPanel createPanel(LayoutManager layout) {
        JPanel panel = new JPanel(layout);
        panel.setBackground(new Color(182, 209, 250));
        return panel;
    }

    private void resetFields() {
        percentageField.setText("");
        GPAField.setText("");
        resultTextArea.setText("Result will show here");
    }

    private void updateVisibility(boolean isPercentage, boolean isGPA) {
        percentageLabel.setVisible(isPercentage);
        percentageField.setVisible(isPercentage);
        gpaLabel.setVisible(isGPA);
        GPAField.setVisible(isGPA);
        calculateButton.setVisible(isPercentage || isGPA);
        resetButton.setVisible(isPercentage || isGPA);
        resultTextArea.setVisible(isPercentage || isGPA);
        pack(); // Adjust frame size based on content
    }

    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    private class SelectorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String pick = (String) selector.getSelectedItem();
            switch (pick) {
                case "GPA to Percentage":
                    updateVisibility(false, true);
                    resultTextArea.setVisible(true);  // Show JTextArea for GPA to Percentage
                    resultPanel.setVisible(true);
                    setPreferredSize(new Dimension(300, 400)); // Set size for GPA to Percentage
                    break;
                case "Percentage to GPA":
                    updateVisibility(true, false);
                    resultTextArea.setVisible(true);  // Show JTextArea for Percentage to GPA
                    resultPanel.setVisible(true);
                    setPreferredSize(new Dimension(300, 400)); // Set size for Percentage to GPA
                    break;
                default:
                    updateVisibility(false, false);
                    resultTextArea.setVisible(false);  // Hide JTextArea if no valid option is selected
                    resultPanel.setVisible(false);
                    setPreferredSize(new Dimension(300, 280)); // Set default size for "Select Calculator"
            }
            pack(); // Resize frame based on selected option
        }
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String pick = (String) selector.getSelectedItem();
                if ("GPA to Percentage".equals(pick)) {
                    double gpa = Double.parseDouble(GPAField.getText());
                    resultTextArea.setText("The Percentage is: " + calculatePercentage(gpa));
                } else if ("Percentage to GPA".equals(pick)) {
                    double percentage = Double.parseDouble(percentageField.getText());
                    double gpa = calculateGPA(percentage);
                    resultTextArea.setText(gpa >= 0 ? "The GPA is: " + gpa : "Invalid percentage entered.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(promptPanel, "Please enter a valid number", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private double calculateGPA(double percentage) {
        // Check the percentage range using if-else statements
        if (percentage >= 95.0 && percentage <= 100.0) {
            return 4.0;
        } else if (percentage >= 94.0 && percentage < 95) {
            return 3.9;
        } else if (percentage >= 93.0 && percentage < 94) {
            return 3.8;
        } else if (percentage >= 92.0 && percentage < 93) {
            return 3.7;
        } else if (percentage >= 91.0 && percentage < 92) {
            return 3.6;
        } else if (percentage >= 90.0 && percentage < 91) {
            return 3.5;
        } else if (percentage >= 89.0 && percentage < 90) {
            return 3.4;
        } else if (percentage >= 88.0 && percentage < 89) {
            return 3.3;
        } else if (percentage >= 87.0 && percentage < 88) {
            return 3.2;
        } else if (percentage >= 86.0 && percentage < 87) {
            return 3.1;
        } else if (percentage >= 85.0 && percentage < 86) {
            return 3.0;
        } else if (percentage >= 84.0 && percentage < 85) {
            return 2.9;
        } else if (percentage >= 83.0 && percentage < 84) {
            return 2.8;
        } else if (percentage >= 82.0 && percentage < 83) {
            return 2.7;
        } else if (percentage >= 81.0 && percentage < 82) {
            return 2.6;
        } else if (percentage >= 80.0 && percentage < 81) {
            return 2.5;
        } else if (percentage >= 79.0 && percentage < 80) {
            return 2.4;
        } else if (percentage >= 78.0 && percentage < 79) {
            return 2.3;
        } else if (percentage >= 77.0 && percentage < 78) {
            return 2.2;
        } else if (percentage >= 76.0 && percentage < 77) {
            return 2.1;
        } else if (percentage >= 75.0 && percentage < 76) {
            return 2.0;
        } else if (percentage >= 74.0 && percentage < 75) {
            return 1.9;
        } else if (percentage >= 73.0 && percentage < 74) {
            return 1.8;
        } else if (percentage >= 72.0 && percentage < 73) {
            return 1.7;
        } else if (percentage >= 71.0 && percentage < 72) {
            return 1.6;
        } else if (percentage >= 70.0 && percentage < 71) {
            return 1.5;
        } else if (percentage >= 69.0 && percentage < 70) {
            return 1.4;
        } else if (percentage >= 68.0 && percentage < 69) {
            return 1.3;
        } else if (percentage >= 67.0 && percentage < 68) {
            return 1.2;
        } else if (percentage >= 66.0 && percentage < 67) {
            return 1.1;
        } else if (percentage >= 65.0 && percentage < 66) {
            return 1.0;
        } else if (percentage >= 0.0 && percentage < 65) {
            return 0.0;
        } else {
            return -1.0; // Indicate invalid percentage
        }
    }


    private String calculatePercentage(double gpa) {
        if (gpa == 4.0) {
            return "95% - 100%";
        } else if (gpa == 3.9) {
            return "94.0% - < 95.0%";
        } else if (gpa == 3.8) {
            return "93.0% - < 94.0%";
        } else if (gpa == 3.7) {
            return "92.0% - < 93.0%";
        } else if (gpa == 3.6) {
            return "91.0% - < 92.0%";
        } else if (gpa == 3.5) {
            return "90.0% - < 91.0%";
        } else if (gpa == 3.4) {
            return "89.0% - < 90.0%";
        } else if (gpa == 3.3) {
            return "88.0% - < 89.0%";
        } else if (gpa == 3.2) {
            return "87.0% - < 88.0%";
        } else if (gpa == 3.1) {
            return "86.0% - < 87.0%";
        } else if (gpa == 3.0) {
            return "85.0% - < 86.0%";
        } else if (gpa == 2.9) {
            return "84.0% - < 85.0%";
        } else if (gpa == 2.8) {
            return "83.0% - < 84.0%";
        } else if (gpa == 2.7) {
            return "82.0% - < 83.0%";
        } else if (gpa == 2.6) {
            return "81.0% - < 82.0%";
        } else if (gpa == 2.5) {
            return "80.0% - < 81.0%";
        } else if (gpa == 2.4) {
            return "79.0% - < 80.0%";
        } else if (gpa == 2.3) {
            return "78.0% - < 79.0%";
        } else if (gpa == 2.2) {
            return "77.0% - < 78.0%";
        } else if (gpa == 2.1) {
            return "76.0% - < 77.0%";
        } else if (gpa == 2.0) {
            return "75.0% - < 76.0%";
        } else if (gpa == 1.9) {
            return "74.0% - < 75.0%";
        } else if (gpa == 1.8) {
            return "73.0% - < 74.0%";
        } else if (gpa == 1.7) {
            return "72.0% - < 73.0%";
        } else if (gpa == 1.6) {
            return "71.0% - < 72.0%";
        } else if (gpa == 1.5) {
            return "70.0% - < 71.0%";
        } else if (gpa == 1.4) {
            return "69.0% - < 70.0%";
        } else if (gpa == 1.3) {
            return "68.0% - < 69.0%";
        } else if (gpa == 1.2) {
            return "67.0% - < 68.0%";
        } else if (gpa == 1.1) {
            return "66.0% - < 67.0%";
        } else if (gpa == 1.0) {
            return "65.0% - < 66.0%";
        } else if (gpa < 1.0 && gpa >= 0) {
            return "0.0% - < 65.0%"; // Below 1.0 GPA
        } else {
            return "Invalid GPA input";
            // Bigger than 4.0
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GPAConverterGUI gui = new GPAConverterGUI();
            gui.setVisible(true);
        });
    }
}
