class Computer {
    private String user = "Admin";
    private int screenSize = 24;
    private int capacity = 256;
    private static int numberOfTimesComputerIsInvoked;

    public Computer() {
        numberOfTimesComputerIsInvoked++;
    }

    public Computer(String user, int screenSize, int capacity) {
        this();
        this.user = user;
        this.screenSize = screenSize;
        this.capacity = capacity;
    }

    public void greetUser() {
        System.out.println("Hello " + user);
    }

    public void displayComputer() {
        System.out.println("Screen Size: " + screenSize + " Capacity: " + capacity);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getNumberOfTimesComputerIsInvoked() {
        return numberOfTimesComputerIsInvoked;
    }

    public String toString() {
        return "Computer: user: " + user + " screenSize: " + screenSize + " capacity: " + capacity;
    }


}
