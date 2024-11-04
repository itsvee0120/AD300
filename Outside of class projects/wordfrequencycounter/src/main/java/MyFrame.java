import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyFrame extends JFrame implements ActionListener {

    JFrame frame;
    JButton selectButton, resetButton;
    JLabel label;
    JTextArea resultArea, countArea;
    JScrollPane scrollPane;

    MyFrame() {
        frame = new JFrame("Word Counter & Word Frequency Counter - Violet Nguyen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); // Use BorderLayout for overall layout

        // Create label
        label = new JLabel("Word Counter & Word Frequency Counter", SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 16));
        frame.add(label, BorderLayout.NORTH); // Add label to the top

        // Create panel for buttons on the left (WEST)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS)); // Use vertical layout for buttons
        buttonPanel.setPreferredSize(new Dimension(120, 100)); // Adjust the size if needed
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Set border for padding

        // Create select file button
        selectButton = new JButton("Select File");
        selectButton.addActionListener(this);
        selectButton.setBackground(new Color(135, 190, 141, 255));
        buttonPanel.add(selectButton);
        buttonPanel.add(Box.createVerticalStrut(10)); // Add vertical gap between buttons

        // Create reset button
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        resetButton.setBackground(new Color(180, 157, 203));
        buttonPanel.add(resetButton);
        buttonPanel.add(Box.createVerticalStrut(30)); // Add vertical gap between buttons

        // Set icon for button panel using a JLabel
        ImageIcon img = new ImageIcon(this.getClass().getResource("/frog.png"));
        JLabel iconLabel = new JLabel(resizeImageIcon(img, 100, 100)); // Resize the image if needed
        buttonPanel.add(iconLabel);

        // Add button panel to the WEST
        frame.add(buttonPanel, BorderLayout.WEST);

        // Create a central panel for the result area with scroll pane
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Add padding around center panel

        // Create result area
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("SansSerif", Font.PLAIN, 16));

        scrollPane = new JScrollPane(resultArea);
        scrollPane.setPreferredSize(new Dimension(300, 300)); // Adjust width as needed
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        // Add countArea to the SOUTH of centerPanel
        countArea = new JTextArea();
        countArea.setEditable(false);
        countArea.setFont(new Font("SansSerif", Font.BOLD, 15));
        countArea.setForeground(Color.BLUE);
        countArea.setBackground(new Color(203, 185, 225, 255));
        countArea.setPreferredSize(new Dimension(400, 30));

        centerPanel.add(countArea, BorderLayout.SOUTH);

        // Add centerPanel to the CENTER of the main frame
        frame.add(centerPanel, BorderLayout.CENTER);

        // Frame Icon Setup (ensure the path to the image is correct)
        ImageIcon image = new ImageIcon("src/main/resources/logo.png");
        frame.setIconImage(image.getImage());

        // Set frame properties
        frame.setSize(600, 400); // Adjust frame size for better visibility
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    // Method to add an indented line to resultArea
    public void appendIndentedResult(String text) {
        resultArea.append("  " + text + "\n"); // Adds a tab for indentation
    }

    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectButton) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("./src/main/resources"));
            fileChooser.setFileFilter(new FileNameExtensionFilter("Document Files", "doc", "docx", "txt"));

            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                resultArea.setText("Selected file: " + file.getName() + "\n\n");

                // Read the selected file based on its extension
                if (file.getName().endsWith(".doc")) {
                    readDocFile(file);
                } else if (file.getName().endsWith(".docx")) {
                    readDocxFile(file);
                } else if (file.getName().endsWith(".txt")) {
                    readTxtFile(file);
                } else {
                    resultArea.append("Please select a .doc, .docx, or .txt file.\n");
                }
            }
        } else if (e.getSource() == resetButton) {
            resultArea.setText(""); // Clear the text area
            countArea.setText("");
        }
    }

    // Method to read the .doc file
    public void readDocFile(File file) {
        try (FileInputStream fis = new FileInputStream(file);
             HWPFDocument document = new HWPFDocument(fis);
             WordExtractor extractor = new WordExtractor(document)) {

            String[] paragraphs = extractor.getParagraphText();
            processParagraphs(paragraphs);

        } catch (IOException e) {
            resultArea.append("Error reading the file: " + e.getMessage() + "\n");
        }
    }

    // Method to read the .docx file
    public void readDocxFile(File file) {
        try (FileInputStream fis = new FileInputStream(file);
             XWPFDocument document = new XWPFDocument(fis);
             XWPFWordExtractor extractor = new XWPFWordExtractor(document)) {

            String text = extractor.getText();
            String[] paragraphs = text.split("\\r?\\n");

            processParagraphs(paragraphs);

        } catch (IOException e) {
            resultArea.append("Error reading the file: " + e.getMessage() + "\n");
        }
    }

    // Method to read the .txt file with indentation in results
    public void readTxtFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            HashMap<String, Integer> wordCountMap = new HashMap<>();
            int totalWordCount = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z0-9'\\-]", "").toLowerCase();

                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                        totalWordCount++;
                    }
                }
            }

            TreeMap<String, Integer> sortedWordCountMap = new TreeMap<>(wordCountMap);

            appendIndentedResult("Word Frequencies:");
            for (Map.Entry<String, Integer> entry : sortedWordCountMap.entrySet()) {
                appendIndentedResult("- " + entry.getKey() + ": " + entry.getValue());
            }

            countArea.append("  Total Word Count: " + totalWordCount);

        } catch (IOException e) {
            resultArea.append("Error reading the file: " + e.getMessage() + "\n");
        }
    }

    // Helper method to process paragraphs with indentation for each word frequency entry
    private void processParagraphs(String[] paragraphs) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        int totalWordCount = 0;

        for (String paragraph : paragraphs) {
            String[] words = paragraph.trim().split("\\s+");

            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z0-9'\\-]", "").toLowerCase();

                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    totalWordCount++;
                }
            }
        }

        TreeMap<String, Integer> sortedWordCountMap = new TreeMap<>(wordCountMap);

        appendIndentedResult("Word Frequencies: ");
        for (Map.Entry<String, Integer> entry : sortedWordCountMap.entrySet()) {
            appendIndentedResult("- " + entry.getKey() + ": " + entry.getValue());
        }

        countArea.append("  Total Word Count: " + totalWordCount);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}