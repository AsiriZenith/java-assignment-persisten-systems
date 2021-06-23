import java.util.Scanner;

/**
 * Question09
 */
public class Question09 {
    static float calPayback(float charge) {
		float payback = 0;
		float overLimit = 0;
		if (charge>2500) {
			overLimit = (charge-2500);
			payback += overLimit*1/100;
			charge -= overLimit;
		} 
		if (charge>1500) {
			overLimit =(charge-1500);
			payback += overLimit*0.75/100;
			charge -= overLimit;
		}
		if (charge>500) {
			overLimit = (charge-500);
			payback += overLimit*0.5/100;
			charge -= overLimit;
		}
		if (charge<=500){
			overLimit = charge;
			payback += overLimit*0.25/100;
		}
		return payback;
	}
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the charge value : ");
        int charge = myObj.nextInt();
        System.out.println("Credit card payback : "+calPayback(charge));
        myObj.close();
    }
}
