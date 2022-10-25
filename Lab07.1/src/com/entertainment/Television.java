package com.entertainment;

public class Television {
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public DisplayType display = DisplayType.LED;

    //FIELDS OR INSTANCE VARIABLES
    private String brand = "Toshiba";
    private int volume = 1;
    private int oldVolume;
    private boolean isMuted;

    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    //BUSINESS METHODS
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV to volume " + volume + " isConnected: " + isConnected);
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted()) {
            oldVolume = volume;
            setVolume(MIN_VOLUME);
            isMuted = true;
        } else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    //ACCESSOR METHODS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
//        switch (brand) {
//            case "Samsung":
//            case "Sony":
//            case "Toshiba":
//                this.brand = brand;
//                break;
//            default:
//                System.out.println("Not a valid brand.. must be Samsung, Sony, or Toshiba");
//        }
        for (int i = 0; i < VALID_BRANDS.length; i++) {
            if (VALID_BRANDS[i].equals(brand)) {
                this.brand = brand;
            }
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
            System.out.println("invalid volume.. must be between 0-100");
        } else {
            isMuted = false;
            this.volume = volume;
        }
    }

    public boolean isMuted() {
        return isMuted;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    //PRIVATE METHODS
    private boolean verifyInternetConnection() {
        return true;
    }

    //toString()
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: brand = " + brand + ", volume = " + volumeString + ", display = " + display;
    }
}
