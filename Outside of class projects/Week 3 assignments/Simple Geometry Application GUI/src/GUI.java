import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import shapes.Shape;
import shapes.Rectangle;
import shapes.Triangle;
import shapes.Circle;

public class GUI {
    private final JFrame frame;
    private JComboBox<String> shapeSelector;
    private JTextField input1, input2, input3;
    private JLabel resultLabel, resultLabel2, inputLabel1, inputLabel2, inputLabel3;
    private JButton calculateButton, resetButton;

    public GUI() {
        // Frame settings
        frame = new JFrame("Geometry Calculator");
        frame.setSize(250, 350); // Updated frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        ImageIcon image = new ImageIcon(this.getClass().getResource("/resources/Icon.png"));
        this.frame.setIconImage(image.getImage());

        // Initialize input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2, 5, 5)); // Adjusted spacing
        inputPanel.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));
        inputPanel.setBackground(new Color(173, 168, 237));

        // Shape selection drop-down
        shapeSelector = new JComboBox<>(new String[]{"Circle", "Rectangle", "Triangle"});
        shapeSelector.addActionListener(new ShapeSelectionListener());

        // Labels and text fields for parameters
        inputLabel1 = new JLabel("Radius:");
        input1 = new JTextField();
        inputLabel2 = new JLabel("Width:");
        input2 = new JTextField();
        inputLabel2.setVisible(false);
        input2.setVisible(false);
        inputLabel3 = new JLabel("Side C:");
        input3 = new JTextField();
        inputLabel3.setVisible(false);
        input3.setVisible(false);

        // Add components to the input panel
        inputPanel.add(new JLabel("Select Shape:"));
        inputPanel.add(shapeSelector);
        inputPanel.add(inputLabel1);
        inputPanel.add(input1);
        inputPanel.add(inputLabel2);
        inputPanel.add(input2);
        inputPanel.add(inputLabel3);
        inputPanel.add(input3);

        // Initialize button panel with adjusted padding
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, -5)); // Adjusted spacing
        buttonPanel.setBackground(new Color(173, 168, 237));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5)); // Added padding

        // Calculate and Reset buttons
        calculateButton = new JButton("Calculate");
        calculateButton.setFont(new Font("SansSerif", Font.BOLD, 12));
        calculateButton.setForeground(new Color(231, 218, 246));
        calculateButton.setBackground(new Color(91, 41, 145));
        calculateButton.addActionListener(new CalculateButtonListener());

        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("SansSerif", Font.BOLD, 12));
        resetButton.setForeground(new Color(231, 218, 246));
        resetButton.setBackground(new Color(113, 24, 79));
        resetButton.addActionListener(new ResetButtonListener());

        // Set preferred size for both buttons to make them the same size
        Dimension buttonSize = new Dimension(100, 35); // Adjusted button size
        calculateButton.setPreferredSize(buttonSize);
        resetButton.setPreferredSize(buttonSize);

        // Add buttons to the button panel
        buttonPanel.add(calculateButton);
        buttonPanel.add(resetButton);

        // Initialize result panel
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(2, 1));
        resultPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        resultPanel.setBackground(new Color(202, 199, 237));

        // Result labels with centered alignment and larger font size
        resultLabel = new JLabel("Area: ", SwingConstants.CENTER);
        resultLabel2 = new JLabel("Perimeter: ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("SansSerif", Font.BOLD, 16)); // Adjusted font size
        resultLabel2.setFont(new Font("SansSerif", Font.BOLD, 16)); // Adjusted font size
        resultLabel.setForeground(new Color(143, 8, 92));
        resultLabel2.setForeground(new Color(0, 51, 102));

        // Add result labels to result panel
        resultPanel.add(resultLabel);
        resultPanel.add(resultLabel2);

        // Add panels to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(resultPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    // Listener for shape selection drop-down
    private class ShapeSelectionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String shape = (String) shapeSelector.getSelectedItem();
            switch (shape) {
                case "Circle":
                    inputLabel1.setText("Radius:");
                    inputLabel2.setVisible(false);
                    input2.setVisible(false);
                    inputLabel3.setVisible(false);
                    input3.setVisible(false);
                    break;
                case "Rectangle":
                    inputLabel1.setText("Length:");
                    inputLabel2.setText("Width:");
                    inputLabel2.setVisible(true);
                    input2.setVisible(true);
                    inputLabel3.setVisible(false);
                    input3.setVisible(false);
                    break;
                case "Triangle":
                    inputLabel1.setText("Side A:");
                    inputLabel2.setText("Side B:");
                    inputLabel3.setText("Side C:");
                    inputLabel2.setVisible(true);
                    input2.setVisible(true);
                    inputLabel3.setVisible(true);
                    input3.setVisible(true);
                    break;
            }
        }
    }

    // Listener for calculate button
    private class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String shape = (String) shapeSelector.getSelectedItem();
                Shape selectedShape;
                switch (shape) {
                    case "Circle":
                        double radius = Double.parseDouble(input1.getText());
                        selectedShape = new Circle("Circle", radius);
                        break;
                    case "Rectangle":
                        double length = Double.parseDouble(input1.getText());
                        double width = Double.parseDouble(input2.getText());
                        selectedShape = new Rectangle("Rectangle", length, width);
                        break;
                    case "Triangle":
                        double sideA = Double.parseDouble(input1.getText());
                        double sideB = Double.parseDouble(input2.getText());
                        double sideC = Double.parseDouble(input3.getText());
                        selectedShape = new Triangle("Triangle", sideA, sideB, sideC);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid shape selected.");
                }
                double area = selectedShape.calculateArea();
                double perimeter = selectedShape.calculatePerimeter();
                resultLabel.setText(String.format("Area: %.2f", area));
                resultLabel2.setText(String.format("Perimeter: %.2f", perimeter));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Listener for reset button
    private class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1.setText("");
            input2.setText("");
            input3.setText("");
            resultLabel.setText("Area: ");
            resultLabel2.setText("Perimeter: ");
            inputLabel2.setVisible(false);
            input2.setVisible(false);
            inputLabel3.setVisible(false);
            input3.setVisible(false);
            shapeSelector.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI::new);
    }
}
