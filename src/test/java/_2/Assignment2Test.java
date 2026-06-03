package _2;

import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Assignment2Test {
    private Assignment2 assignment2;

    @Before
    public void before() {
        assignment2 = new Assignment2();
    }

    @After
    public void after() {
        assignment2 = null;
    }


}