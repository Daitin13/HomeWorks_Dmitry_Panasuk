package com.levelup.lesson3.task5.board;

import com.levelup.lesson3.task5.exception.MaxJumpCountExp;
import org.junit.Before;
import org.junit.*;
import org.junit.runner.notification.RunListener;

import static org.junit.Assert.assertTrue;

public class BoardTest {
    private Board board;

    @Before
    public void setUp() {

    }

    @Test
    public void shouldJumpSuccessWithWoodBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, TypeBoard.WOOD);
        //WHEN
        boolean actualResult = board.jump();
        //THEN
        assertTrue("Should jump with wood board", actualResult == expectedResult);
    }

    @Test
    public void shouldJumpSuccessWithCarbonBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, TypeBoard.CARBON);
        //WHEN
        boolean actualResult = board.jump();
        //THEN
        assertTrue("Should jump with carbon board", actualResult == expectedResult);
    }

    @Test
    public void shouldJumpSuccessWithPlasticBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, TypeBoard.PLASTIC);
        //WHEN
        boolean actualResult = board.jump();
        //THEN
        assertTrue("Should jump with plastic board", actualResult == expectedResult);
    }

    @Test(expected = MaxJumpCountExp.class)
    public void shouldJumpExceptionWithWoodBoard() {
        //GIVEN
        boolean expectedResult = false;
        board = new Board("test", 100, TypeBoard.WOOD);
        //WHEN
        boolean actualResult = board.jump();
        //THEN
        assertTrue("Exception should jump with wood board", actualResult == expectedResult);
    }

    @Test(expected = MaxJumpCountExp.class)
    public void shouldJumpExceptionWithCarbonBoard() {
        //GIVEN
        boolean expectedResult = false;
        board = new Board("test", 200, TypeBoard.CARBON);
        //WHEN
        boolean actualResult = board.jump();
        //THEN
        assertTrue("Exception should jump with carbon board", actualResult == expectedResult);
    }

    @Test(expected = MaxJumpCountExp.class)
    public void shouldJumpExceptionWithPlasticBoard() {
        //GIVEN
        boolean expectedResult = false;
        board = new Board("test", 150, TypeBoard.PLASTIC);
        //WHEN
        boolean actualResult = board.jump();
        //THEN
        assertTrue("Exception should jump with plastic board", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckBoardTrueWithWoodBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, TypeBoard.WOOD);
        //WHEN
        boolean actualResult = board.checkBoard();
        //THEN
        assertTrue("Should checkboard true with wood board", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckBoardFalseWithWoodBoard() {
        //GIVEN
        boolean expectedResult = false;
        board = new Board("test", 100, TypeBoard.WOOD);
        //WHEN
        boolean actualResult = board.checkBoard();
        //THEN
        assertTrue("Should checkboard false with wood board", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckBoardTrueWithCarbonBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, TypeBoard.CARBON);
        //WHEN
        boolean actualResult = board.checkBoard();
        //THEN
        assertTrue("Should checkboard true with carbon board", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckBoardFalseWithCarbonBoard() {
        //GIVEN
        boolean expectedResult = false;
        board = new Board("test", 200, TypeBoard.CARBON);
        //WHEN
        boolean actualResult = board.checkBoard();
        //THEN
        assertTrue("Should checkboard false with carbon board", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckBoardTrueWithPlasticBoard() {
        //GIVEN
        boolean expectedResult = true;
        board = new Board("test", 0, TypeBoard.PLASTIC);
        //WHEN
        boolean actualResult = board.checkBoard();
        //THEN
        assertTrue("Should checkboard true with plastic board", actualResult == expectedResult);
    }

    @Test
    public void shouldCheckBoardFalseWithPlasticBoard() {
        //GIVEN
        boolean expectedResult = false;
        board = new Board("test", 200, TypeBoard.PLASTIC);
        //WHEN
        boolean actualResult = board.checkBoard();
        //THEN
        assertTrue("Should checkboard false with plastic board", actualResult == expectedResult);
    }

}
