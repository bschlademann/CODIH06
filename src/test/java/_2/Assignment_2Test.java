package _1;

import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Assignment_2Test {
    private Assignment_1 assignment1;

    @Before
    public void before() {
        assignment1 = new Assignment_1();
    }

    @After
    public void after() {
        assignment1 = null;
    }


}