package _1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MainTest {
    private Main main;

    @Before
    public void before() {
        main = new Main();
    }

    @After
    public void after() {
        main = null;
    }

    @Test
    public void test_1_a_C0() {
        main.a(1);
        assertEquals(1, main.getX());
    }

    @Test
    @Parameters({"1", "0"})
    public void test_1_a_C1(int x) {
        main.a(x);
        if (x > 0) {
            assertEquals(x, main.getX());
        } else {
            assertEquals(0, main.getX());
        }
    }

    @Test
    @Parameters({"1, 1", "1, 0"})
    public void test_1_b_C1(int x, int y) {
        main.b(x, y);
        if (x > 0 && y > 0) {
            assertEquals(1, main.getX());  // true-Zweig
        } else {
            assertEquals(0, main.getX());  // false-Zweig
        }
    }

    @Test
    @Parameters({"1, 1", "0, 0"})
    public void test_1_b_C2(int x, int y) {
        main.b(x, y);
        if (x > 0 && y > 0) {
            assertEquals(1, main.getX());
        } else {
            assertEquals(0, main.getX());
        }
    }

    @Test
    public void test_1_c_C2() {
        main.c(1);
        assertEquals(1, main.getX());
    }
}