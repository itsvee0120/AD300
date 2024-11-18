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
    private JButton addButton, serveButton, nextButton, checkButton, sizeButton, resetButton, displayButton;

    public WaitingListManagerGUI() {
        waitingList = new LinkedList<>();
        uniqueNames = new HashSet<>();
        initializeGUI();
    }

    private void initializeGUI() {
        // Main Frame
        frame = new JFrame("Waiting List Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600); // Adjusted for better layout
        frame.setLayout(null); // Using null layout for precise positioning
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Title
        JLabel titleLabel = new JLabel("Waiting List Manager", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        titleLabel.setBounds(0, 20, 500, 30); // Centered at the top
        frame.add(titleLabel);

        // Enter Name Field
        JPanel namePanel = new JPanel();
        namePanel.setBounds(50, 70, 400, 40);



        namePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        nameField = new JTextField(20); // Global JTextField
      nameField.setForeground(Color.BLUE);
        namePanel.add(new JLabel("Enter Name:"));
        namePanel.add(nameField);
        frame.add(namePanel);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(80, 140, 350, 180);
        buttonPanel.setLayout(new GridLayout(4, 2, 20, 20)); // Two columns, four rows

        // Global Buttons
        addButton = new JButton("Add Person");
        serveButton = new JButton("Serve Person");
        nextButton = new JButton("Check Next Person");
        checkButton = new JButton("Check By Name");
        sizeButton = new JButton("List Size");
        displayButton = new JButton("Display List");
        resetButton = new JButton("Reset");

        addButton.setBackground(new Color(174, 194, 179));
        serveButton.setBackground(new Color(174, 194, 179));
       nextButton.setBackground(new Color(174, 194, 179));
        checkButton.setBackground(new Color(174, 194, 179));
        sizeButton.setBackground(new Color(174, 194, 179));
        displayButton.setBackground(new Color(174, 194, 179));
        resetButton.setBackground(new Color(253, 200, 237));

        buttonPanel.add(addButton);
        buttonPanel.add(serveButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(checkButton);
        buttonPanel.add(sizeButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(resetButton);



        frame.add(buttonPanel);

        // Result Panel
        resultArea = new JTextArea(10, 30); // Global JTextArea
        resultArea.setFont(new Font("SansSerif", Font.PLAIN, 16));
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBounds(20, 350, 450, 200); // Positioned at the bottom
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); // Only show scrollbar when needed
        frame.add(scrollPane);

        // Add button functionality
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (name.isEmpty()) {
                resultArea.append("Please enter a name.\n");
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
                resultArea.append("The waiting list is empty.\n");
            } else {
                String servedPerson = waitingList.poll();
                uniqueNames.remove(servedPerson);
                resultArea.append(servedPerson + " has been served.\n");
            }
        });

        nextButton.addActionListener(e -> {
            if (waitingList.isEmpty()) {
                resultArea.append("The waiting list is empty.\n");
            } else {
                resultArea.append("Next person: " + waitingList.peek() + "\n");
            }
        });

        checkButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (name.isEmpty()) {
                resultArea.append("Please enter a name.\n");
            } else if (uniqueNames.contains(name)) {
                resultArea.append(name + " is in the waiting list.\n");
            } else {
                resultArea.append(name + " is not in the waiting list.\n");
            }
        });

        sizeButton.addActionListener(e -> {
            resultArea.append("List size: " + waitingList.size() + "\n");
        });

        displayButton.addActionListener(e -> {
            if (waitingList.isEmpty()) {
                resultArea.append("The waiting list is empty.\n");
            } else {
                resultArea.append("Waiting List: " + String.join(", ", waitingList) + "\n");
            }
        });

        resetButton.addActionListener(e -> {
            waitingList.clear();
            uniqueNames.clear();
            resultArea.setText("");
            nameField.setText("");
        });

        // Show frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WaitingListManagerGUI::new);
    }
}
