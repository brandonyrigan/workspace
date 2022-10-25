import java.util.Arrays;

public class ArrayExampleClient {
    public static void main(String[] args) {
        ArrayExample.convertAndDisplayNamesToUpperCase();
        System.out.println("Odd Numbers: " + Arrays.toString(ArrayExample.findOddNumbersFromArray(new int[]{1,2,3,4,5,6,7,8,9})));
        System.out.println("Largest Number: " + ArrayExample.findLargestNumberFromArray(new int[]{8,3,2,1,4,5,6,10,8,2,3}));
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Brandon", "Jay", "Nicole", "Joy");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Brandon", "Nicole", "Joy");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Brandon", "Nicole");

    }
}
