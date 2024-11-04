# Word Frequency Counter

This project consists of Java programs that calculate and display the frequency of words from various sources: a text file, user input, and a Word `.doc` document. Each program processes the text by counting each unique word, sorting them, and displaying the results. The code also handles basic text cleaning to remove punctuation.

## Features

1. **File-based Word Frequency Counter (Main.java)**
    - Reads a text file (`mytext.txt`) and counts the occurrences of each word.
    - Displays word frequencies sorted alphabetically.
    - Uses regular expressions to remove punctuation and normalize words to lowercase.
    - Uses `HashMap` for counting words and `TreeMap` for sorting.

2. **User Input Word Frequency Counter (WordFrequencyInput.java)**
    - Continuously accepts user input until "count" is typed.
    - Displays the frequency of each word entered by the user, as well as the total word count.
    - Processes input in real time, removing punctuation and normalizing to lowercase.
    - Uses `TreeMap` for sorted output.

3. **Word Document (.doc) Word Frequency Counter (ReadDocFileExample.java)**
    - Reads and processes a `.doc` file using Apache POI library to handle Word documents.
    - Cleans text by removing punctuation while preserving hyphens and apostrophes.
    - Counts each unique word and outputs word frequencies in sorted order.
    - Displays the total word count.

## Requirements

- **Java Development Kit (JDK)**
- **Apache POI library** (for handling `.doc` files in `ReadDocFileExample.java`)
    - Include `poi-scratchpad` library in your project dependencies to work with Word files.

## Installation

1. Clone the repository or download the code.
2. Place any required files (e.g., `mytext.txt` and `example.doc`) in the `src/main/resources` directory.

### Apache POI Installation
Download the Apache POI library from [Apache POI Downloads](https://poi.apache.org/download.html) and add it to your project’s dependencies.

## Usage

### Running `Main.java`
1. Place a text file named `mytext.txt` in `src/main/resources`.
2. Run `Main.java`:
   ```shell
   javac Main.java
   java Main
   ```
   The program will output the word frequencies from the text file.

### Running `WordFrequencyInput.java`
1. Run `WordFrequencyInput.java`:
   ```shell
   javac WordFrequencyInput.java
   java WordFrequencyInput
   ```
2. Enter text line by line. When you are done, type "count" to display the word frequencies and total word count.

### Running `ReadDocFileExample.java`
1. Place a `.doc` file named `example.doc` in `src/main/resources`.
2. Run `ReadDocFileExample.java`:
   ```shell
   javac ReadDocFileExample.java
   java ReadDocFileExample
   ```
   The program will output the word frequencies and total word count from the document.

## Code Details

### `countWordsInFile` Method (in `Main.java`)
- Reads each line from a file, then calls `processLine()` to clean and count words.

### `processLine` Method (in `Main.java`)
- Splits lines by whitespace and punctuation, converts to lowercase, and updates the word count in a map.

### `ReadDocFileExample` with Apache POI
- Uses `WordExtractor` from Apache POI to read paragraphs from a `.doc` file.
- Counts and cleans each word before adding it to a sorted map.

## Example Output

Example output from each program:
```plaintext
Word Frequencies:
apple: 3
banana: 1
orange: 2

Total Word Count: 6
```

## Test Cases

The following JUnit test cases are provided in `MainTest.java` to verify the functionality of the word frequency counter.

### Test Cases for `processLine` Method
1. **Repeated Words**  
   Input: `"Hello world! Hello universe."`  
   Expected Output:
    - "hello" count: 2
    - "world" count: 1
    - "universe" count: 1

2. **Mixed Case Words**  
   Input: `"HELLO Hello hello"`  
   Expected Output:
    - "hello" count: 3
    - Only one entry for "hello" in lowercase.

3. **Words with Punctuation**  
   Input: `"Hello, world! Hello... world? World."`  
   Expected Output:
    - "hello" count: 2
    - "world" count: 3

4. **Empty String**  
   Input: `""`  
   Expected Output:
    - Word map should be empty.

5. **Only Punctuation**  
   Input: `"!@#$%^&*()"`  
   Expected Output:
    - No words should be counted.

6. **Single Long Word**  
   Input: `"Supercalifragilisticexpialidocious"`  
   Expected Output:
    - "supercalifragilisticexpialidocious" count: 1

### Test Case for `countWordsInFile` Method
1. **File with Sample Text**  
   Input File: `testtext.txt` with content:
   ```
   Hello world!
   Hello universe.
   ```
   Expected Output:
    - "hello" count: 2
    - "world" count: 1
    - "universe" count: 1

### Running the Tests

Run the tests using JUnit. Example command:
```shell
javac -cp .:junit-5.8.1.jar MainTest.java
java -jar junit-5.8.1.jar --class-path . --scan-classpath
```

## Troubleshooting

- Ensure all files are in the correct directory (`src/main/resources`).
- For `.doc` processing, verify that Apache POI is properly installed.

## License

This project is licensed under the MIT License.