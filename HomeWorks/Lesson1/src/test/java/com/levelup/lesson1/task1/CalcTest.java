package com.levelup.lesson1.task1;

import com.levelup.lesson1.Calc;
import com.levelup.lesson1.Input;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    private Calc calc;

    @Before
    public void setUp() {

    }

    @Test

    public void summaCalcPositiveNumber() {//TODO
        //GIVEN
        double expectedResult = 10;
        Input inputTest = new Input(5, 5, "+");
        calc = new Calc();
        //WHEN
        double actualResult = calc.calc();
        //THEN
        assertEquals("  ", expectedResult, actualResult);

    }


}

