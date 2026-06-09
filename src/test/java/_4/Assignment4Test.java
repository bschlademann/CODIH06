package _4;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;
import static com.codeborne.selenide.Configuration.headless;

@RunWith(JUnitParamsRunner.class)
public class Assignment4Test {
    @Test
    @Parameters({
            "79.9   ,   25      ,   --",
            "80     ,   24.9    ,   --",
            "80     ,   25      ,   39.1",
            "800    ,   250     ,   3.9",
    })
    public void bmiTest(float height, float weight, String expectedBmi) {
        headless = true;
        open("https://www.apotheken-umschau.de/gesund-bleiben/abnehmen/body-mass-index-den-bmi-berechnen-706435.html");
        executeJavaScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input'));",
                $("input[model='height']"), String.valueOf(height)
        );
        executeJavaScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input'));",
                $("input[model='weight']"), String.valueOf(weight)
        );
        String rawBmi = executeJavaScript("return document.querySelector('#result').textContent");
//        return value is invalid because weight < 25kg || height < 80cm
        if ("--".equals(rawBmi)) {
            assertEquals(expectedBmi, rawBmi);
        } else {
            float bmi = Float.parseFloat(rawBmi);
            assertEquals(Float.parseFloat(expectedBmi), bmi, 0.1f);
        }
    }
}
