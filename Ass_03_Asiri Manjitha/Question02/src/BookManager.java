import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    Scanner sc;
    List<Book> bookList;

    public BookManager() {
        sc = new Scanner(System.in);
        bookList = new ArrayList<>();
    }

    public void createBooks() {
        Book book = new Book();
        System.out.print("Enter book title : ");
        book.setBook_title(sc.nextLine());
        System.out.print("Enter Author name : ");
        book.setBook_author(sc.nextLine());
        System.out.print("Enter book publication details : ");
        book.setBook_publication(sc.nextLine());
        System.out.print("Enter book price : ");
        book.setBook_price(sc.nextDouble());
        bookList.add(book);
    }

    public void showBooks() {
        if (bookList.size() == 0) {
            System.out.println("Empty Book List!!");
        } else {
            System.out.println("Book Title\t\tPrice");
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i));
            }
        }
    }
}
