package solid_java.main;

public class Square implements Shape {
    private int length;
    // Constructor of Square class, initializes the length variable
    public Square(int length) {
        this.length = length;
    } 
    // Overrides the computed Area method of the Shape interface
    // Calculates and returns the area of the square
    @Override
    public int computeArea() {
        return length * length;
    }
    // Setter and Getter method for the length variable
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
