class MyMath {
    public static final int MINIMUM_AGE = 5;
    public static final int MAXIMUM_AGE = 100;

    public static int getBiggerNumber(int x, int y) {
        return Math.max(x, y);
    }

    public static int getSmallerNumber(int x, int y) {
        return Math.min(x, y);
    }

    public static boolean isAgeInRange(int age) {
        if (age >= MINIMUM_AGE && age <= MAXIMUM_AGE) {
            return true;
        } else return false;
    }
}
