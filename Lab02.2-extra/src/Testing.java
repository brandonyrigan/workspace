import java.util.Arrays;

class Testing {
    public static void main(String[] args) {
//        int[] numbers = {3, 9, 6, 2, 1, 10, 5};
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length - 1; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = temp;
//                }
//            }
//        }

//        int[] sortedNumbers = new int[numbers.length];
//        int currentSmallest = numbers[0];
//        int smallestIndex = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                if (numbers[j] < currentSmallest) {
//                    currentSmallest = numbers[j];
//                    smallestIndex = j;
//                }
//            }
//            sortedNumbers[i] = currentSmallest;
//            currentSmallest = Integer.MAX_VALUE;
//            smallestIndex = Integer.MAX_VALUE;
//        }
//        System.out.println(Arrays.toString(sortedNumbers));
//
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        String[] strings = {"2", "40", "7", "5"};
//        int[] ints = new int[strings.length];
//
//        for (int i = 0; i < strings.length; i++) {
//            ints[i] = Integer.parseInt(strings[i]);
//        }
//
//        System.out.println(ints.getClass().getComponentType());
//        System.out.println("ints: " + Arrays.toString(ints));
//        System.out.println(strings.GetType());
//        System.out.println("strings: " + Arrays.toString(strings));

        String[] arrayA = {"Hello", "Boston"};
        String[] arrayB = {"Hello", "Boston"};
        boolean equals1 = Arrays.equals(arrayA, arrayB);
        System.out.println(equals1);

        String initialString = "I love Boston. Yes, you do love boston.";
        String[] split = initialString.split("[, ?.@&$]+");
        String[] uniqueWords = new String[split.length];
        int uniqueCounter = 0;

        for (int i = 0; i < split.length; i++) {
            boolean wordFound = isWordFound(split[i], uniqueWords, uniqueCounter);
            if (wordFound) {
                continue;
            } else {
                uniqueWords[uniqueCounter++] = split[i];
            }
        }

        System.out.println(Arrays.toString(uniqueWords));


    }
    private static boolean isWordFound(String word, String[] uniqueWords, int currentIndex) {
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (uniqueWords[i].equalsIgnoreCase(word)) {
                found = true;
            }
        }
        return found;
    }
}
