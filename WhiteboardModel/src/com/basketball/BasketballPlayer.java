package com.basketball;

public class BasketballPlayer {
    public static final int MIN_HEIGHT = 48;
    public static final int MAX_HEIGHT = 100;
    private String name;
    private int height;
    private PositionTypes position;
    private static int basketballPlayerCount;

    public BasketballPlayer() {
        basketballPlayerCount++;
    }

    public BasketballPlayer(String name) {
        this();
        setName(name);
    }

    public BasketballPlayer(String name, int height, PositionTypes position ) {
        this(name);
        setHeight(height);
        setPosition(position);
    }

    public void dribble() {
        System.out.println("dribble");
        crossover();
    }

    public void pass() {
        System.out.println("pass");
    }

    public void shoot() {
        System.out.println("shoot");
    }

    private static void crossover() {
        System.out.println("crossover");
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > MIN_HEIGHT && height < MAX_HEIGHT) {
            this.height = height;
        } else {
            System.out.println("Invalid height... must be between " + MIN_HEIGHT + " and " + MAX_HEIGHT);
        }

    }

    public PositionTypes getPosition() {
        return position;
    }

    public void setPosition(PositionTypes position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getBasketballPlayerCount() {
        return basketballPlayerCount;
    }

    public String toString() {
        return "Basketball Player: Name: " + getName() + " Height: " + getHeight() + " Position: " + getPosition();
    }
}
