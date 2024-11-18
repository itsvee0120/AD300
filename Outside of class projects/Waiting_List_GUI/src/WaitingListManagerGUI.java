import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WaitingListManagerGUI {
    private Queue<String> waitingList;
    private Set<String> uniqueNames;

    // Global Variables
    private JFrame frame;
    private JTextArea resultArea;
    private JTextField nameField;
    private JButton addButton, serveButton, nextButton, checkButton, sizeButton, resetButton, displayButton, clearButton, deleteByNameButton;

    public WaitingListManagerGUI() {
        waitingList = new LinkedList<>();
        uniqueNames = new HashSet<>();
        initializeGUI();
    }

    private void initializeGUI() {
        // Main Frame
        frame = new JFrame("Waiting List Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 600); // Adjusted width to 550px
        frame.setLayout(null); // Using null layout for precise positioning
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Title
        JLabel titleLabel = new JLabel("Waiting List Manager", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        titleLabel.setBounds(0, 20, 550, 30); // Centered at the top
        frame.add(titleLabel);

        // Enter Name Field
        JPanel namePanel = new JPanel();
        namePanel.setBounds(75, 70, 400, 40); // Recentered to fit new width
        namePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        nameField = new JTextField(25); // Global JTextField
        nameField.setForeground(Color.BLUE);
        namePanel.add(new JLabel("Enter Name:"));
        namePanel.add(nameField);
        frame.add(namePanel);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3, 20, 20)); // 3 rows, 3 columns, 20px horizontal and vertical gap
        buttonPanel.setBounds(20, 140, 500, 180); // Adjusted for new frame size
        buttonPanel.setPreferredSize(new Dimension(500, 200)); // Ensure the panel size fits the layout

        // Create smaller buttons with text visible
        addButton = new JButton("Add Person");
        serveButton = new JButton("Serve Person");
        nextButton = new JButton("Check Next Person");
        checkButton = new JButton("Check By Name");
        sizeButton = new JButton("List Size");
        displayButton = new JButton("Display List");
        resetButton = new JButton("Reset The List");
        clearButton = new JButton("Clear Result Area");
        deleteByNameButton = new JButton("Delete By Name");

        // Resize buttons for better visibility and fit
        Dimension buttonSize = new Dimension(100, 40); // Width x Height
        addButton.setPreferredSize(buttonSize);
        serveButton.setPreferredSize(buttonSize);
        nextButton.setPreferredSize(buttonSize);
        checkButton.setPreferredSize(buttonSize);
        sizeButton.setPreferredSize(buttonSize);
        displayButton.setPreferredSize(buttonSize);
        resetButton.setPreferredSize(buttonSize);
        clearButton.setPreferredSize(buttonSize);
        deleteByNameButton.setPreferredSize(buttonSize);

        addButton.setBackground(new Color(174, 194, 179));
        serveButton.setBackground(new Color(174, 194, 179));
        nextButton.setBackground(new Color(174, 194, 179));
        checkButton.setBackground(new Color(174, 194, 179));
        sizeButton.setBackground(new Color(174, 194, 179));
        displayButton.setBackground(new Color(174, 194, 179));
        clearButton.setBackground(new Color(139, 194, 210));
        resetButton.setBackground(new Color(253, 200, 237));
        deleteByNameButton.setBackground(new Color(174, 194, 179));

        // Add buttons to buttonPanel
        buttonPanel.add(addButton);
        buttonPanel.add(serveButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(checkButton);
        buttonPanel.add(deleteByNameButton);
        buttonPanel.add(sizeButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(resetButton);

        frame.add(buttonPanel);

        // Result Panel
        resultArea = new JTextArea(10, 30); // Global JTextArea
        resultArea.setFont(new Font("SansSerif", Font.PLAIN, 16));
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBounds(20, 350, 500, 200); // Adjusted for new frame size
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); // Only show scrollbar when needed
        frame.add(scrollPane);

        // Add button functionality
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Please enter a name to add.",
                        "Input Required",
                        JOptionPane.WARNING_MESSAGE
                );
            } else if (uniqueNames.contains(name)) {
                resultArea.append("This person is already in the list.\n");
            } else {
                waitingList.offer(name);
                uniqueNames.add(name);
                resultArea.append(name + " has been added to the waiting list.\n");
                nameField.setText("");
            }
        });

        serveButton.addActionListener(e -> {
            if (waitingList.isEmpty()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Waiting List is empty.",
                        "Error",
                        JOptionPane.WARNING_MESSAGE
                );
            } else {
                String servedPerson = waitingList.poll();
                uniqueNames.remove(servedPerson);
                resultArea.append(servedPerson + " has been served.\n");
            }
        });

        nextButton.addActionListener(e -> {
            if (waitingList.isEmpty()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Waiting List is empty.",
                        "Error",
                        JOptionPane.WARNING_MESSAGE
                );
            } else {
                resultArea.append("Next person: " + waitingList.peek() + "\n");
            }
        });

        checkButton.addActionListener(e -> {
            if (nameField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Please enter a name to check.",
                        "Input Required",
                        JOptionPane.WARNING_MESSAGE
                );
            } else {
                String name = nameField.getText().trim();
                if (uniqueNames.contains(name)) {
                    resultArea.append(name + " is in the waiting list.\n");
                } else {
                    resultArea.append(name + " is not in the waiting list.\n");
                }
            }
        });

        deleteByNameButton.addActionListener(e -> {
            String name = nameField.getText().trim(); // Get the name from the text field
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Please enter a name to delete.",
                        "Input Required",
                        JOptionPane.WARNING_MESSAGE
                );
            } else if (uniqueNames.contains(name)) {
                waitingList.remove(name);
                uniqueNames.remove(name);
                resultArea.append(name + " has been deleted from the waiting list.\n");
                nameField.setText("");
            } else {
                resultArea.append(name + " is not in the waiting list.\n");
            }
        });

        sizeButton.addActionListener(e -> {
            resultArea.append("List size: " + waitingList.size() + "\n");
        });

        displayButton.addActionListener(e -> {
            if (waitingList.isEmpty()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Waiting List is empty.",
                        "Error",
                        JOptionPane.WARNING_MESSAGE
                );
            } else {
                resultArea.append("Waiting List: " + String.join(", ", waitingList) + "\n");
            }
        });

        clearButton.addActionListener(e -> {
            resultArea.setText("");
            nameField.setText("");
        });

        resetButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(
                    frame,
                    "This will delete the entire waiting list. Are you sure?",
                    "Confirm Reset",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );
            if (confirm == JOptionPane.YES_OPTION) {
                waitingList.clear();
                uniqueNames.clear();
                resultArea.setText("");
                nameField.setText("");
                JOptionPane.showMessageDialog(frame, "The waiting list has been reset.", "Reset Successful", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Show frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WaitingListManagerGUI::new);
    }
}
