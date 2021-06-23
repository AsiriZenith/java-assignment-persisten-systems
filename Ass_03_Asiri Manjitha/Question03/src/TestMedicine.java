import java.util.Random;

public class TestMedicine {

    public static Medicine getInstance(int n) {
        if (n == 1) {
            return new Ointment();
        } else if (n == 2) {
            return new Syrup();
        } else if (n == 3) {
            return new Tablet();
        }
        return null;
    }

    public static void main(String[] args) {
        Medicine[] medicine = new Medicine[10];

        Random rand = new Random();
        int n = rand.nextInt(3);
        n += 1;

        Medicine randomObject = getInstance(n);
        randomObject.displayLabel();
    }
}
