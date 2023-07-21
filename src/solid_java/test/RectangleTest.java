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
}
