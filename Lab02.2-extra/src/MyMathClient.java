public class MyMathClient {
    public static void main(String[] args) {
        System.out.println(MyMath.getSmallerNumber(5, 3));
        System.out.println(MyMath.getBiggerNumber(40, 100));
        System.out.println(MyMath.isAgeInRange(39));
        System.out.println(MyMath.isAgeInRange(200));

        int index = 0;
        while (index < 5) {
            System.out.println("Index: " + index);
            index++;
        }

        int index2 = 5;
        do {
            System.out.println("Index2: " + index2);
            index2--;
        } while (index2 > 0);

        for (int i = 0; i < 3; i++) {
            System.out.println("Index3: " + i);
        }

        int[] array = {1, 2, 3, 4, 5};
        for (int num :
                array) {
            System.out.println(num);
        }

        String[] names = {"brandon", "nicole", "jay"};
        for (String name :
                names) {
            System.out.println(name);
        }
    }
}
