import java.util.Scanner;

/**
 * Question03
 */
public class Question03 {
    
    static double calInterest(int amt) {
        double interestVal = 0;
        if (amt < 1000) {
            interestVal = amt + amt * 0.04;
        } else if (amt < 5000) {
            interestVal = amt + amt * 0.045;
        } else if (amt > 5000) {
            interestVal = amt + amt * 0.05;
        }
        return interestVal;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Deposit Amount  : ");
        int amt = myObj.nextInt();
        
        System.out.println("Deposit amount earns in a year : "+calInterest(amt));
        myObj.close();
    }
}
