package HustBookStore;

public class Book extends Product {
    private String publisher;
    private String author;
    private String isbn;

    public Book(int id, String name, double purchasePrice, double sellingPrice, int quantity, String publisher, String author, String isbn) {
        super(id, name, purchasePrice, sellingPrice, quantity);
        this.publisher = publisher;
        this.author = author;
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
