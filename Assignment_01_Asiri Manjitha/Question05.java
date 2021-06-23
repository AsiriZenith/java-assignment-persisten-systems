import java.util.Scanner;

/**
 * Question05
 */
public class Question05 {

    static boolean isPrimeNumber(int num) {
        boolean result = true;
        for(int i = 2; i <= num/2; ++i){
            if(num % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Number  : ");
        int number = myObj.nextInt();

        if (isPrimeNumber(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number."); 
        }
        myObj.close();
    }
}