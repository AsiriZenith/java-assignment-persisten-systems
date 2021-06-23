import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager bookManager = new BookManager();
        int option = 0;
        do {
            System.out.println("1.Create Book       2.Show Book       3.Exit");
            System.out.print("Enter you needed : ");
            option = sc.nextInt();

            if (option == 1) {
                bookManager.createBooks();
            } else if (option == 2) {
                bookManager.showBooks();
            } else if (option == 3) {
                System.out.println("LogOut");
            } else {
                System.out.println("Your entered was Invalid!!");
            }
        } while (option != 3);
    }
}
