package _3;

import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static _3.Assignment3.findLineStart;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(JUnitParamsRunner.class)
public class Assignment3Test {
    private Assignment3 assignment3;

    @Before
    public void before() {
        assignment3 = new Assignment3();
    }

    @After
    public void after() {
        assignment3 = null;
    }

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
    /**
     * matrix.length == 0 → äußere Schleife 0× (sofort Exception)
     * matrix[0].length == 0 → innere Schleife 0× (Exception)
     * 1 an erster Position (0,0) → frühester return
     * 1 an letzter Position (rows-1, cols-1) → spätester return
     * Keine 1 → kompletter Scan + Exception
     */

}
