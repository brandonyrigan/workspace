package com.basketball.client;

import com.basketball.BasketballPlayer;
import com.basketball.PositionTypes;

public class BasketballPlayerClient {
    public static void main(String[] args) {
        BasketballPlayer player1 = new BasketballPlayer("Lebron James", 80, PositionTypes.SMALL_FORWARD);
        System.out.println(player1);
        player1.dribble();
        player1.pass();

        BasketballPlayer player2 = new BasketballPlayer();
        player2.setName("Steph Curry");
        player2.setHeight(75);
        player2.setPosition(PositionTypes.POINT_GUARD);
        System.out.println(player2);
        player2.shoot();

        BasketballPlayer basketballPlayer = new BasketballPlayer();

    }
}
