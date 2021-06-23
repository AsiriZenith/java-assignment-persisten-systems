public class Book {
    private String book_title;
    private double book_price;
    private String book_author;
    private String book_publication;

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_publication() {
        return book_publication;
    }

    public void setBook_publication(String book_publication) {
        this.book_publication = book_publication;
    }

    @Override
    public String toString() {
        return book_title + "\t\t\tRs." +book_price;
    }
}
