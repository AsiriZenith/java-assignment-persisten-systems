import java.util.Scanner;

/**
 * Question01
 */
public class Question01 {

    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

    public static void main(String[] args) {
        System.out.print("Enter the sentence : ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.print("Enter the word : ");
        String word = sc.nextLine();

        System.out.println("Number of occurrences of given word in a sentence is : "+count(sentence, word));
        sc.close();
    }
}