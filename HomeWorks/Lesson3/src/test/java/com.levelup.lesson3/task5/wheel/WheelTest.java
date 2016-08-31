package com.levelup.lesson3.task5.wheel;

import com.levelup.lesson3.task5.wheel.Wheel;
import com.levelup.lesson3.task5.wheel.TypeWheel;
import com.levelup.lesson3.task5.exception.MaxDistanceExp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WheelTest {
    private Wheel wheel;

    @Before
    public void setUp() {

    }

    @Test
    public void shouldRunSuccessWithDistanceTrueBackRollingWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.run(1, Side.BACK);
        //THEN
        assertTrue("Should run(distance true, side back) with rolling wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldRunSuccessWithDistanceTrueForwardRollingWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.run(1, Side.FORWARD);
        //THEN
        assertTrue("Should run(distance true, side forward) with rolling wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldRunSuccessWithDistanceTrueRightRollingWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.run(1, Side.RIGHT);
        //THEN
        assertTrue("Should run(distance true, side right) with rolling wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldRunSuccessWithDistanceTrueLeftRollingWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.run(1, Side.LEFT);
        //THEN
        assertTrue("Should run(distance true, side left) with rolling wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldRunSuccessWithDistanceTrueBackPlainWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.run(1, Side.BACK);
        //THEN
        assertTrue("Should run(distance true, side back) with plain wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldRunSuccessWithDistanceTrueForwardPlainWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.run(1, Side.FORWARD);
        //THEN
        assertTrue("Should run(distance true, side forward) with plain wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldRunSuccessWithDistanceTrueRightPlainWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.run(1, Side.RIGHT);
        //THEN
        assertTrue("Should run(distance true, side right) with plain wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldRunSuccessWithDistanceTrueLeftPlainWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.run(1, Side.LEFT);
        //THEN
        assertTrue("Should run(distance true, side left) with plain wheel", actualResult == expectedResult);
    }

    @Test(expected = MaxDistanceExp.class)
    public void shouldRunSuccessWithDistanceFalseBackRollingWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.run(1000, Side.BACK);
        //THEN
        assertTrue("Should run(distance false, side back) with rolling wheel", actualResult == expectedResult);
    }

    @Test(expected = MaxDistanceExp.class)
    public void shouldRunSuccessWithDistanceFalseForwardRollingWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.run(1000, Side.FORWARD);
        //THEN
        assertTrue("Should run(distance false, side forward) with rolling wheel", actualResult == expectedResult);
    }

    @Test(expected = MaxDistanceExp.class)
    public void shouldRunSuccessWithDistanceFalseRightRollingWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.run(1000, Side.RIGHT);
        //THEN
        assertTrue("Should run(distance false, side right) with rolling wheel", actualResult == expectedResult);
    }

    @Test(expected = MaxDistanceExp.class)
    public void shouldRunSuccessWithDistanceFalseLeftRollingWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.run(1500, Side.LEFT);
        //THEN
        assertTrue("Should run(distance false, side left) with rolling wheel", actualResult == expectedResult);
    }

    @Test(expected = MaxDistanceExp.class)
    public void shouldRunSuccessWithDistanceFalseBackPlainWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.run(1500, Side.BACK);
        //THEN
        assertTrue("Should run(distance false, side back) with plain wheel", actualResult == expectedResult);
    }

    @Test(expected = MaxDistanceExp.class)
    public void shouldRunSuccessWithDistanceFalseForwardPlainWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.run(1500, Side.FORWARD);
        //THEN
        assertTrue("Should run(distance false, side forward) with plain wheel", actualResult == expectedResult);
    }

    @Test(expected = MaxDistanceExp.class)
    public void shouldRunSuccessWithDistanceFalseRightPlainWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.run(1500, Side.RIGHT);
        //THEN
        assertTrue("Should run(distance false, side right) with plain wheel", actualResult == expectedResult);
    }

    @Test(expected = MaxDistanceExp.class)
    public void shouldRunSuccessWithDistanceFalseLeftPlainWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.run(1500, Side.LEFT);
        //THEN
        assertTrue("Should run(distance false, side left) with plain wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckWheelsTrueWithRollingWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.checkWheels();
        //THEN
        assertTrue("Should checkwheels true with rolling wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckWheelsFalseWithRollingWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 1000, TypeWheel.ROLLING);
        //WHEN
        boolean actualResult = wheel.checkWheels();
        //THEN
        assertTrue("Should checkwheels false with rolling wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckWheelsTrueWithPlainWheel() {
        //GIVEN
        boolean expectedResult = true;
        wheel = new Wheel("test", 0, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.checkWheels();
        //THEN
        assertTrue("Should checkwheels true with plain wheel", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckWheelsFalseWithPlainWheel() {
        //GIVEN
        boolean expectedResult = false;
        wheel = new Wheel("test", 1500, TypeWheel.PLAIN);
        //WHEN
        boolean actualResult = wheel.checkWheels();
        //THEN
        assertTrue("Should checkwheels false with plain wheel", actualResult == expectedResult);
    }

}
