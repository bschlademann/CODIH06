package _3;

import org.junit.Test;

import static _3.Assignment3.findLineStart;
import static _3.Assignment3.findLineLength;
import static _3.Assignment3.LineStart;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Assignment3Test {

    @Test
    public void testExceptionCases() {
//        matrix has 0 rows and 0 columns
        assertThrows(NoLineStartFoundException.class,
                () -> findLineStart(new int[0][0]));
//        matrix has 1 row and 0 columns
        assertThrows(NoLineStartFoundException.class,
                () -> findLineStart(new int[][]{{}}));
//        matrix has no '1' element
        assertThrows(NoLineStartFoundException.class,
                () -> findLineStart(new int[6][6]));
    }

    @Test
    public void findLineStart_FirstElement() throws NoLineStartFoundException {
        int[][] m = new int[2][2];
        m[0][0] = 1;
        assertEquals(new LineStart(0, 0), findLineStart(m));
    }

    @Test
    public void findLineStart_LastElement() throws NoLineStartFoundException {
        int[][] m = new int[2][2];
        m[1][1] = 1;
        assertEquals(new LineStart(1, 1), findLineStart(m));
    }

    // --- findLineLength - C2 ---

    @Test
    public void findLineLength_NoNeighbor() {
        int[][] m = new int[3][3];
        m[0][0] = 1;
        assertEquals(1, findLineLength(m, new LineStart(0, 0)));
    }

    @Test
    public void findLineLength_Right() {
        int[][] m = new int[3][3];
        m[0][0] = 1; m[0][1] = 1; m[0][2] = 1;
        assertEquals(3, findLineLength(m, new LineStart(0, 0)));
    }


    @Test
    public void findLineLength_DiagonalDownRight() {
        int[][] m = new int[3][3];
        m[0][0] = 1; m[1][1] = 1; m[2][2] = 1;
        assertEquals(3, findLineLength(m, new LineStart(0, 0)));
    }

    @Test
    public void findLineLength_Down() {
        int[][] m = new int[3][3];
        m[0][0] = 1; m[1][0] = 1; m[2][0] = 1;
        assertEquals(3, findLineLength(m, new LineStart(0, 0)));
    }

    @Test
    public void findLineLength_DiagonalDownLeft() {
        int[][] m = new int[3][3];
        m[0][1] = 1; m[1][0] = 1;
        assertEquals(2, findLineLength(m, new LineStart(0, 1)));
    }

    @Test
    public void findLineLength_LastRow() {
        int[][] m = new int[1][3];
        m[0][0] = 1;
        assertEquals(1, findLineLength(m, new LineStart(0, 0)));
    }

    @Test
    public void findLineLength_LeftEdge() {
        int[][] m = new int[3][1];
        m[0][0] = 1;
        assertEquals(1, findLineLength(m, new LineStart(0, 0)));
    }

    @Test
    public void findLineLength_RightEdge() {
        int[][] m = new int[3][3];
        m[0][2] = 1;
        assertEquals(1, findLineLength(m, new LineStart(0, 2)));
    }

}
