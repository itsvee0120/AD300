import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import animals.Animal;
import animals.Dog;
import animals.Cat;
import animals.Fish;
import animals.Bird;
import animals.Lion;
import animals.Rabbit;
import animals.Elephant;
import animals.Cheetah;

public class AnimalAppGUI {
    // GUI Components and Variables
    private final JFrame frame;
    private final JLabel label;
    private final JLabel imageLabel;
    private final JComboBox<String> animalComboBox;
    private final JTextArea infoArea;
    private final JScrollPane scrollPane; // Add JScrollPane variable
    private final ArrayList<Animal> animals;

    private int labelX;
    private Timer movementTimer;

    // Constructor: Initializes the GUI Components
    public AnimalAppGUI() {
        // Frame Setup Section
        frame = new JFrame("Animal Kingdom");
        frame.setSize(360, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        // Frame Icon Setup
        ImageIcon image = new ImageIcon("Icon.png");
        frame.setIconImage(image.getImage());

        // Animal List Initialization
        animals = new ArrayList<>();
        animals.add(new Dog("Benji", 7));
        animals.add(new Cat("Ash", 3));
        animals.add(new Fish("Goldie", 1));
        animals.add(new Bird("Frankie", 4));
        animals.add(new Lion("King", 5));
        animals.add(new Rabbit("Moa", 1));
        animals.add(new Elephant("Scott", 3));
        animals.add(new Cheetah("Nyx", 2));

        // ComboBox Setup Section
        String[] animalNames = {"Select Animal", "All Animals", "Dog", "Cat", "Fish", "Bird", "Lion", "Rabbit", "Elephant", "Cheetah"};
        animalComboBox = new JComboBox<>(animalNames);
        animalComboBox.addActionListener(new AnimalSelectionListener());

        // Dropdown Panel Setup for ComboBox
        JPanel dropdownPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        dropdownPanel.setBackground(new Color(116, 140, 112));
        dropdownPanel.add(animalComboBox);

        // JTextArea Setup Section
        infoArea = new JTextArea();
        infoArea.setText("Data will show up here.");
        infoArea.setEditable(false);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);
        infoArea.setBackground(new Color(205, 224, 202));
        infoArea.setFont(new Font("SansSerif", Font.PLAIN, 14));

        // Set margin for JTextArea
        infoArea.setMargin(new Insets(10, 10, 10, 10)); // Set top, left, bottom, right margins to 10 pixels

        // Create JScrollPane for infoArea
        scrollPane = new JScrollPane(infoArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // JLabel Setup Section
        label = new JLabel();
        label.setText("Welcome to Animal Kingdom!");
        label.setForeground(new Color(205, 224, 202));
        label.setFont(new Font("MV Boli", Font.BOLD, 20));

        // Image Label Setup Section
        imageLabel = new JLabel();
        ImageIcon img = resizeImageIcon(new ImageIcon("Dog.png"), 160, 160);
        imageLabel.setIcon(img);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Label Panel Setup Section
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel.setBackground(new Color(116, 140, 112));
        labelPanel.add(label);
        labelPanel.add(imageLabel);

        // Adding Components to Frame
        frame.add(dropdownPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER); // Add the JScrollPane to the center
        frame.add(labelPanel, BorderLayout.SOUTH);

        // Movement Initialization
        labelX = frame.getWidth();
        startLabelMovement();

        // Set Frame Visibility
        frame.setVisible(true);
    }

    // Method to Start JLabel Movement Across the Frame
    private void startLabelMovement() {
        movementTimer = new Timer(90, new ActionListener() {
            private final int targetX = -150;

            @Override
            public void actionPerformed(ActionEvent e) {
                labelX -= 5;
                imageLabel.setLocation(labelX, imageLabel.getY());

                if (labelX < targetX) {
                    labelX = frame.getWidth();
                }
            }
        });

        movementTimer.setInitialDelay(0);
        movementTimer.start();
    }

    // Method to Resize ImageIcon for JLabel
    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    private class AnimalSelectionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = animalComboBox.getSelectedIndex();
            if (selectedIndex == 1) { // "All Animals"
                displayAllAnimalInfo();
            } else if (selectedIndex > 1) { // Specific animal selected
                Animal selectedAnimal = animals.get(selectedIndex - 2); // Adjust for the JComboBox offset
                displaySingleAnimalInfo(selectedAnimal);
            } else {
                infoArea.setText(""); // Clear the JTextArea for "Select Animal" option
            }
        }
    }

    // Method to Display Information About All Animals
    private void displayAllAnimalInfo() {
        StringBuilder info = new StringBuilder();
        for (Animal animal : animals) {
            appendAnimalInfo(info, animal);
        }
        infoArea.setText(info.toString());
    }

    // Method to Display Information for a Single Animal
    private void displaySingleAnimalInfo(Animal animal) {
        StringBuilder info = new StringBuilder();
        appendAnimalInfo(info, animal);
        infoArea.setText(info.toString());
        System.out.println(info.toString()); // For debugging
    }

    // Helper Method to Append Animal Information to JTextArea
    private void appendAnimalInfo(StringBuilder info, Animal animal) {
        info.append("Name: ").append(animal.name).append("\n");
        info.append("Type: ").append(animal.getType()).append("\n");
        info.append("Age: ").append(animal.age).append("\n");
        info.append("Eating Habit: ").append(animal.getEat()).append("\n");
        info.append("Sleeping Habit: ").append(animal.getSleep()).append("\n");
        info.append("Sound: ").append(animal.makeSound()).append("\n");

        // Add Behaviors Based on the Specific Animal Type
        switch (animal) {
            case Dog dog -> info.append("Behavior: ").append(dog.fetch()).append("\n");
            case Cat cat -> info.append("Behavior: ").append(cat.scratch()).append("\n");
            case Fish fish -> info.append("Behavior: ").append(fish.move()).append("\n");
            case Bird bird -> {
                info.append("Behavior: ").append(bird.preening()).append("\n");
                info.append("Fly: ").append(bird.fly()).append("\n");
            }
            case Lion lion -> info.append("Behavior: ").append(lion.hunt()).append("\n");
            case Rabbit rabbit -> info.append("Behavior: ").append(rabbit.hop()).append("\n");
            case Elephant elephant -> info.append("Behavior: ").append(elephant.bathe()).append("\n");
            case Cheetah cheetah -> info.append("Behavior: ").append(cheetah.sprint()).append("\n");
            default -> {
            }
        }
        info.append("\n");
    }

    // Main Method to Launch the Application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AnimalAppGUI::new);
    }
}
