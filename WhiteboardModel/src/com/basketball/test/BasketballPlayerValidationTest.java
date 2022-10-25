package com.basketball.test;

import com.basketball.BasketballPlayer;
import com.basketball.PositionTypes;

public class BasketballPlayerValidationTest {
    public static void main(String[] args) {
        BasketballPlayer player1 = new BasketballPlayer("Kobe Bryant", 101, PositionTypes.SHOOTING_GUARD);
        System.out.println(player1);

        BasketballPlayer player2 = new BasketballPlayer("Kevin Durant", 84, PositionTypes.SMALL_FORWARD);
        System.out.println(player2);

        BasketballPlayer player3 = new BasketballPlayer("Steph Curry", 0, PositionTypes.POINT_GUARD);
        System.out.println(player3);
    }
}
