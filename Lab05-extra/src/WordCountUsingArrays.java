import java.util.Arrays;

public class WordCountUsingArrays {
    public static void main(String[] args) {
        String array = "Hello I love Boston. Yes, you do Love Boston.";
        String[] splitArray = array.split("[, ?.@]+");
        System.out.println(Arrays.toString(splitArray));
        for (int i = 0; i < splitArray.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < splitArray.length; j++) {
                if (splitArray[i].equalsIgnoreCase(splitArray[j])) {
                    counter++;
                    splitArray[j] = "seen";
                }
            }
            if (!splitArray[i].equals("seen")) {
                System.out.println(splitArray[i] + ": " + counter);
            }
        }
        System.out.println(Arrays.toString(splitArray));
    }
}
