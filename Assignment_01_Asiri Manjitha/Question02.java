import java.util.Scanner;
/**
 * Question02
 */
public class Question02 {
    
    static boolean checkAlpha(char alph) {
        boolean result = false;

        if (alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u' || alph == 'A' || alph == 'E' || alph == 'I' || alph == 'O' || alph == 'U') {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Char Value : ");
        char val = myObj.next().charAt(0);

        if (checkAlpha(val)) {
            System.out.println("Chacked value is vowel");
        } else {
            System.out.println("Chacked value is not vowel");
        }

        myObj.close();
    }
}
