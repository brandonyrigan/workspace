import java.time.LocalDate;

class WrapperExample {
    public static int convertStringToIntPrimitive(String toBeConvertedString) {
        return Integer.parseInt(toBeConvertedString);
    }

    public static int convertStringToIntegerObject(String toBeConvertedString) {
        return Integer.valueOf(toBeConvertedString);
    }
}
