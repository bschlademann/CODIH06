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
}