package solid_java.test;

import org.junit.jupiter.api.Test;
import solid_java.main.Rectangle;
import solid_java.main.Square;

public class SquareTest {
    @Test
    void createSquare(){
        Square square = new Square(3);
        assert square != null;
    }
}
