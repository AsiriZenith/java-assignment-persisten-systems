import java.util.Scanner;

/**
 * Question04
 */
public class Question04 {
    static double calTax(int gp) {
        double amount_of_tax_owed = 0;
        if (gp > 240 && gp < 480) {
            amount_of_tax_owed = gp * 0.15;
        } else if (gp > 480) {
            amount_of_tax_owed = gp * 0.28;
        } else if (gp < 240) {
            amount_of_tax_owed = 0;
        }
        return amount_of_tax_owed;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter gross pay value : ");
        int grosspay  = myObj.nextInt();

        System.out.println("Amount of tax owed : "+calTax(grosspay));
        myObj.close();
    }
}
