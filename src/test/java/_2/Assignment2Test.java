package _2;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Assignment2Test {

    @Test
    @Parameters({
            "-1     ,               ",  // negative input (boundary value)
            "1      ,               ",  // lower boundary, no prime factors
            "2      ,   2           ",  // while-loop (n%2==0), smallest prime
            "3      ,   3           ",  // if-path (n>2), smallest odd prime
            "9      ,   3 3         ",  // for+inner while (i≤√n, n%i==0), odd square
    })
    public void primeFactors(int input, String expected) {
        assertEquals(expected, Assignment2.primeFactors(input));
    }
}
