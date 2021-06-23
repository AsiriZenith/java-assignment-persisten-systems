public class Tablet extends Medicine{

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println(this.getClass().getName() + ": store in a cool dry place");
    }
}
