package com.levelup.lesson3.task5.skateboard;

import com.levelup.lesson3.task5.board.Board;
import com.levelup.lesson3.task5.wheel.Side;
import com.levelup.lesson3.task5.wheel.Wheel;

public interface ISkateBoard {
    boolean jump();

    boolean drive(int distance, Side side);

    boolean setBoard(Board board);

    boolean setWheels(Wheel[] wheels);
}
