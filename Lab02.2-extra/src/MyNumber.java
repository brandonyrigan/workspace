class MyNumber {
    public static int computeRandomInt(int start, int end) {
        int range = end - start;
        int randomNum = (int)(Math.random() * range) + start;
        return randomNum;
    }
}
