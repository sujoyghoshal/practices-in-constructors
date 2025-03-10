public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }
}