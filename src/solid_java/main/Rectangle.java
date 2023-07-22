package solid_java.main;

public class Rectangle implements Shape {
    public int width;
    public int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public int computeArea() {
        return width * length;
    }
}
