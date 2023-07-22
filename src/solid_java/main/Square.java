package solid_java.main;

public class Square implements Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int computeArea() {
        return length * length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
