package class13;

class Library {
    private static int totalBooks =100; // Total books in the library
    private int borrowedBooks; // Books borrowed by an individual

    public Library(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
        totalBooks -= borrowedBooks; // Reduce total books when books are borrowed
    }

    public void returnBooks(int returnedBooks) {
        borrowedBooks -= returnedBooks;
        totalBooks += returnedBooks; // Increase total books when books are returned
    }

    public void displayStatus() {
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Borrowed Books: " + borrowedBooks);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Library library1 = new Library(5);
        library1.displayStatus();

        Library library2 = new Library(3);
        library2.displayStatus();

        library1.returnBooks(2);
        library1.displayStatus();

        library2.returnBooks(1);
        library2.displayStatus();
    }
}
