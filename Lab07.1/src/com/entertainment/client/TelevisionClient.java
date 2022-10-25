package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);
        tv1.setDisplay(DisplayType.OLED);

        Television tv2 = new Television("Sony", Television.MIN_VOLUME);

        Television tv3 = new Television("Toshiba");

        Television tv4 = new Television("Samsung", 24, DisplayType.PLASMA);
        System.out.println(tv4);

        Television tv5 = new Television("Sony", 40);
        System.out.println(tv5);

        System.out.println(Television.getInstanceCount() + " instances");
    }
}
