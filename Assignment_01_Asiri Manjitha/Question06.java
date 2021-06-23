import java.util.Scanner;

/**
 * Question06
 */
public class Question06 {
    static void printPrime(int maxVal) {
        for (int i = 2; i < maxVal; ++i) {
            boolean isPrime = true;
            int sqrt = (int)Math.ceil(Math.sqrt(i));
            for (int divisor = 2; divisor <= sqrt; ++divisor) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
              System.out.println(i);
            } 
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Number  : ");
        int number = myObj.nextInt();

        printPrime(number);
        myObj.close();
    }
}
