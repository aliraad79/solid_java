package solid_java.main;

public class Rectangle {
    public int width;
    public int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public int  computeArea() {
        return width * length;
    }

}
