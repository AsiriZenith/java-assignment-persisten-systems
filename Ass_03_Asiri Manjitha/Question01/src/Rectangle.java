public class Rectangle {

    private int length = 0;
    private int breadth = 0;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return "length=" + length +
                ", breadth=" + breadth +
                ", area=" + this.calculateArea();
    }
}
