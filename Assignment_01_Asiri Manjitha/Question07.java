import java.util.Scanner;

/**
 * Question07
 */
public class Question07 {
    static int costs_the_theater = 20;
    static float calculateProfit(int numAttendees) {

        double cost = costs_the_theater + numAttendees * 0.5;
        double profit = numAttendees * 5 - cost;

        return (float)profit;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number of attendees : ");
        int numAttendees = myObj.nextInt();

        System.out.println("Income the show earns is : "+ calculateProfit(numAttendees));
        myObj.close();
    }
}
