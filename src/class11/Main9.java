package class11;

public class Main9 {
    public static void main(String[] args) {
        // Create a library with a maximum capacity of 5 books
        Library library = new Library("MyLibrary", 5);

        // Create some book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display the books in the library
        library.displayBooks();

        // Add more books
        Book book4 = new Book("Pride and Prejudice", "Jane Austen");
        library.addBook(book4);

        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger");
        library.addBook(book5);

        // Try to add another book (library is already full)
        Book book6 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        library.addBook(book6);

        // Display the updated list of books in the library
        library.displayBooks();

        // Print the total number of books in the library
        System.out.println("Total books in the library: " + library.getNumBooks());
    }
}

class Book {
    private static int totalBooks = 0;
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}

class Library {
    private String name;
    private Book[] books;
    private int numBooks;

    public Library(String name, int maxCapacity) {
        this.name = name;
        books = new Book[maxCapacity];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println((i + 1) + ". " + books[i].getTitle() + " by " + books[i].getAuthor());
        }
    }

    public int getNumBooks() {
        return numBooks;
    }
}
