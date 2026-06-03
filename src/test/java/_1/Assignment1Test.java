package _1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Assignment1Test {
    private Assignment1 assignment1;

    @Before
    public void before() {
        assignment1 = new Assignment1();
    }

    @After
    public void after() {
        assignment1 = null;
    }

    @Test
    public void test_1_a_C0() {
        assignment1.a(1);
        assertEquals(1, assignment1.getX());
    }

    @Test
    @Parameters({"1", "0"})
    public void test_1_a_C1(int x) {
        assignment1.a(x);
        if (x > 0) {
            assertEquals(x, assignment1.getX());
        } else {
            assertEquals(0, assignment1.getX());
        }
    }

    @Test
    @Parameters({"1, 1", "1, 0"})
    public void test_1_b_C1(int x, int y) {
        assignment1.b(x, y);
        if (x > 0 && y > 0) {
            assertEquals(1, assignment1.getX());  // true-Zweig
        } else {
            assertEquals(0, assignment1.getX());  // false-Zweig
        }
    }

    @Test
    @Parameters({"1, 1", "0, 0"})
    public void test_1_b_C2(int x, int y) {
        assignment1.b(x, y);
        if (x > 0 && y > 0) {
            assertEquals(1, assignment1.getX());
        } else {
            assertEquals(0, assignment1.getX());
        }
    }

    @Test
    public void test_1_c_C2() {
        main.c(1);
        assertEquals(1, main.getX());
    }
}