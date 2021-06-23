import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
        System.out.println("Enter Details for Create Rectangle Objects");
        List<Rectangle> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("length : ");
            int length = sc.nextInt();
            System.out.print("breadth : ");
            int breadth = sc.nextInt();
            Rectangle rectangle = new Rectangle(length,breadth);
            list.add(rectangle);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Rectangle " + (i+1) + " details : " + list.get(i));
        }
        sc.close();
    }
}
