import java.util.Scanner;

/**
 * Question07
 */
public class Question08 {
    static double billPrice = 0;
    public static double calculateBill_domestic_connectionType(int consumedUnits) {
        if (consumedUnits <= 100) {
            billPrice = consumedUnits * 4;
            if (billPrice > 250) {
                billPrice = 250;
            }
        } else if (consumedUnits > 100 && consumedUnits < 300) {
            billPrice = consumedUnits * 4.5;
        } else if (consumedUnits > 300 && consumedUnits < 500) {
            billPrice = consumedUnits * 4.75;
        } else if (consumedUnits > 500) {
            billPrice = consumedUnits * 5;
        }
        return billPrice;
    }

    public static double calculateBill_commercial_connectionType(int consumedUnits) {
        if (consumedUnits <= 100) {
            billPrice = consumedUnits * 4.25;
            if (billPrice > 350) {
                billPrice = 350;
            }
        } else if (consumedUnits > 100 && consumedUnits < 300) {
            billPrice = consumedUnits * 4.75;
        } else if (consumedUnits > 300 && consumedUnits < 500) {
            billPrice = consumedUnits * 5;
        } else if (consumedUnits > 500) {
            billPrice = consumedUnits * 5.25;
        }
        return billPrice;
    }

    public static double calculateBill(String connectionType,int consumedUnits) {
        if (connectionType == "domestic") {
            billPrice = calculateBill_domestic_connectionType(consumedUnits);
        } else if (connectionType == "commercial") {
            billPrice = calculateBill_commercial_connectionType(consumedUnits);
        } else {
            System.out.println("Wrong connection Type!!");
        }
        return billPrice;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("1.Domestic  2.Commercial");
        System.out.print("Please select the connection type : ");
        int connection = myObj.nextInt();
        String connectionType = "";
        if (connection == 1) {
            connectionType = "domestic";
        } else if (connection == 2) {
            connectionType = "commercial";
        } else {
            System.out.println("Entered was invalid!!");
        }
 
        System.out.print("Please select the consumed Units : ");
        int consumedUnits = myObj.nextInt();

        System.out.println("Electricity bill : Rs."+ calculateBill(connectionType,consumedUnits));
        myObj.close();
    }
}
