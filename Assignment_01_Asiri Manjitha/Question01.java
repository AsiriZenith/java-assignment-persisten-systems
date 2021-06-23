import java.util.Scanner;

/**
 * Question01
 */
public class Question01 {

    static int calMax(int x,int y,int z) {
        int maxValue;
        if (x > y) {
            if (x > z) {
                maxValue = x;
            } else {
                maxValue = z;
            }
        } else {
            if (y > z) {
                maxValue = y;
            } else {
                maxValue = z;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int x = myObj.nextInt();

        System.out.print("Enter Number 2 : ");
        int y = myObj.nextInt();

        System.out.print("Enter Number 3 : ");
        int z = myObj.nextInt();

        int maxValue = calMax(x, y, z);
        System.out.println("Maximum Value is : " + maxValue);

        myObj.close();
    }
}