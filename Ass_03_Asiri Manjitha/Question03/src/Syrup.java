public class Syrup extends Medicine{

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println(this.getClass().getName() + ": up to 5 years only");
    }
}
