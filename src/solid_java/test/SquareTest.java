package solid_java.test;

import org.junit.jupiter.api.Test;
import solid_java.main.Square;

public class SquareTest {
    @Test
    void createSquare() {
        Square square = new Square(3);
        assert square != null;
    }

    @Test
    void squareComputeArea() {
        Square square = new Square(3);
        assert square.computeArea() == 9;
    }


    @Test
    void squareGetLength() {
        Square square = new Square(3);
        assert square.getLength() == 3;
    }

    @Test
    void squareSetLength() {
        Square square = new Square(3);
        square.setLength(5);

        assert square.getLength() == 5;
        assert square.computeArea() == 25;
    }
}
