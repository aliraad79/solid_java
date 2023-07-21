package solid_java.test;

import org.junit.jupiter.api.Test;
import solid_java.main.Rectangle;

public class RectangleTest {

    @Test
    void createRectangle(){
        Rectangle rectangle = new Rectangle(3,4);
        assert rectangle != null;
        assert rectangle.width == 3;
        assert rectangle.length == 4;
    }

    @Test
    void rectangleComputeArea(){
        Rectangle rectangle = new Rectangle(3,4);
        assert rectangle.computeArea() == 12;
    }

    @Test
    void rectangleSetLength(){
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.setLength(5);

        assert  rectangle.length == 5;
    }

    @Test
    void rectangleGetLength(){
        Rectangle rectangle = new Rectangle(3,4);
        assert  rectangle.getLength() == 4;
    }

    @Test
    void rectangleSetWidth(){
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.setWidth(5);

        assert  rectangle.width == 5;
    }

    @Test
    void rectangleGetWidth(){
        Rectangle rectangle = new Rectangle(3,4);
        assert  rectangle.getWidth() == 3;
    }
}
