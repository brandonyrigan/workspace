package com.basketball.client;

import com.basketball.BasketballPlayer;
import com.basketball.PositionTypes;

public class BasketballPlayerClientArgs {
    public static void main(String[] args) {
        String name = args[0];
        int height = Integer.parseInt(args[1]);
        PositionTypes position = PositionTypes.valueOf(args[2]);

        BasketballPlayer player1 = new BasketballPlayer(name, height, position);
        System.out.println(player1);
    }
}
