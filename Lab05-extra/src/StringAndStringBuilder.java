class StringAndStringBuilder {
    public static String constructMyAddressUsingString() {
        return new String("Masotta Ave");
    }

    public static String constructMyAddressUsingStringBuilder() {
        return new StringBuilder().append("Masotta")
                .append(" ")
                .append("Ave").toString();
    }
}
