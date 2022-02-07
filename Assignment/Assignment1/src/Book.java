//Question 9: Write a program to create a book class. The Book class would have following private variables
        /*String name;
         *int bookID;
         *String genres;
         *double price;
         Create a constructor to initialize the values. Create getters and setters for variables.
         */
public class Book {
    String name;
    int bookID;
    String genres;
    double price;

    public Book(String name, int bookID, String genre, double price) {
        this.name = name;
        this.bookID = bookID;
        this.genres = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
