public class Ointment extends Medicine{

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println(this.getClass().getName() + ": for external use only");
    }
}
