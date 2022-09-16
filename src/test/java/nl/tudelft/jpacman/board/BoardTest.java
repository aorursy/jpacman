package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class BoardTest {

    @Test
    void testBasicSquare(){
        final Square[][] grid = {
            { mock(Square.class), mock(Square.class), mock(Square.class) },
            { mock(Square.class), mock(Square.class), mock(Square.class) },
        };
        final Board board = new Board(grid);

        assert(board.getHeight() == 3);
        assert(board.getWidth() == 2);
    }

    @Test
    void testBasicIsNotNull(){
        final Square[][] grid = {
            {null}
        };
        final Board board = new Board(grid);

        assert(board.squareAt(0 ,0) != null);
    }
}
