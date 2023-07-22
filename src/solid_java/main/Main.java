package solid_java.main;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5);

        System.out.println("Rectangle Area is : " + rectangle.computeArea());

        Square square = new Square(3);

        System.out.println("Square Area is : " + square.computeArea());
    }
}