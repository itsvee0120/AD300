
# Book Sorting Application

## Overview

This Java application demonstrates a `Book` class with various sorting features. The program allows books to be sorted by title, author, publication year, or by a combination of author and title. The goal is to showcase the use of the `Comparable` interface and custom `Comparator` implementations.

---

## Features

- **Default Sorting by Title**:
  Books are sorted alphabetically by title using the `Comparable` interface.

- **Sorting by Author**:
  Custom comparator (`AuthorComparator`) for sorting books alphabetically by author names.

- **Sorting by Year**:
  Custom comparator (`YearComparator`) for sorting books by publication year, with newer books appearing first.

- **Chained Sorting (Author → Title)**:
  Custom comparator (`AuthorThenTitleComparator`) for sorting books by author, then by title if authors are the same.

---

## Class Details

### 1. `Book` Class
- **Attributes**: `title`, `author`, `year`.
- **Methods**:
    - `toString()`: Displays book details.
    - Implements `Comparable` for default sorting by title.

### 2. Custom Comparators
- **`AuthorComparator`**: Sorts by author names.
- **`YearComparator`**: Sorts by publication year (newest books first).
- **`AuthorThenTitleComparator`**: Chained sorting by author, then title.

---

## How to Run

1. Clone the repository or download the code.
2. Compile the files using `javac`:
   ```bash
   javac Main.java
   ```
3. Run the application:
   ```bash
   java Main
   ```
4. Observe the sorted output for each criterion.

---

## Sample Output

```
Books sorted by Title:
Title: 1984, Author: George Orwell, Year: 1949
Title: Moby Dick, Author: Herman Melville, Year: 1851
Title: Pride and Prejudice, Author: Jane Austen, Year: 1813
Title: The Great Gatsby, Author: F. Scott Fitzgerald, Year: 1925
Title: To Kill a Mockingbird, Author: Harper Lee, Year: 1960

Books sorted by Author:
Title: Pride and Prejudice, Author: Jane Austen, Year: 1813
Title: The Great Gatsby, Author: F. Scott Fitzgerald, Year: 1925
Title: Moby Dick, Author: Herman Melville, Year: 1851
Title: To Kill a Mockingbird, Author: Harper Lee, Year: 1960
Title: 1984, Author: George Orwell, Year: 1949

Books sorted by Year:
Title: To Kill a Mockingbird, Author: Harper Lee, Year: 1960
Title: 1984, Author: George Orwell, Year: 1949
Title: The Great Gatsby, Author: F. Scott Fitzgerald, Year: 1925
Title: Moby Dick, Author: Herman Melville, Year: 1851
Title: Pride and Prejudice, Author: Jane Austen, Year: 1813

Books sorted by Author, then Title:
Title: Pride and Prejudice, Author: Jane Austen, Year: 1813
Title: The Great Gatsby, Author: F. Scott Fitzgerald, Year: 1925
Title: Moby Dick, Author: Herman Melville, Year: 1851
Title: To Kill a Mockingbird, Author: Harper Lee, Year: 1960
Title: 1984, Author: George Orwell, Year: 1949
```

---

## Technologies Used

- **Language**: Java
- **Concepts**:
    - Object-Oriented Programming
    - Comparable and Comparator Interfaces
    - Collections Framework (`List`, `ArrayList`, `Collections.sort()`)

---

## Project Structure

```
src/
├── Book.java               # Book class with Comparable implementation
└── Main.java               # Main class to test the program
```

---

## Author

**Violet Nguyen**

