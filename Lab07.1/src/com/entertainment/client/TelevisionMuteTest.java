package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(70);
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.setVolume(50);
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
    }
}
