package solid_java.main;

public class Square implements Shape {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int computeArea() {
        return length * length;
    }
}
