class ArrayExample {
    private static String[] family = {"Art", "Eleonor", "RJ", "Brandon"};

    public static void convertAndDisplayNamesToUpperCase() {
        for (String member : family) {
            System.out.println("Upper Case: " + member.toUpperCase());
        }
    }

    public static int[] findOddNumbersFromArray(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number % 2 == 1) {
                counter++;
            }
        }
        int[] oddNumbers = new int[counter];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 == 1) {
                oddNumbers[index] = number;
                index++;
            }
        }
        return oddNumbers;
    }

    public static int findLargestNumberFromArray(int[] numbers) {
        int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }

    public static void convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(String myName, String... myFriends) {
        System.out.print("Varargs: " + myName.toUpperCase() + " ");
        for (String friend : myFriends) {
            System.out.print(friend.toUpperCase() + " ");
        }
        System.out.println();
    }
}
