package class12;

class Book {
    private int bookId;
    private String title;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

}

public class SameHashCodeReferenceExample5 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Programming");
        Book book2 = new Book(2, "Java Programming");

        System.out.println("Hash Code for book1: " + book1.hashCode());
        System.out.println("Hash Code for book2: " + book2.hashCode());

        Book book3 = book1; // Assigning the reference of book1 to book3
        System.out.println("Hash Code for book3 (referenced from book1): " + book3.hashCode());

        // Check equality using equals()
        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));
    }
}
