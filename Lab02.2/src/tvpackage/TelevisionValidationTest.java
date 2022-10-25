package tvpackage;

public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(0);
        tv.setBrand("Samsung");
        System.out.println(tv);

        tv.setVolume(100);
        tv.setBrand("Sony");
        System.out.println(tv);

        tv.setVolume(-1);
        tv.setBrand("Toshiba");
        System.out.println(tv);

        tv.setVolume(101);
        tv.setBrand("TCL");
        System.out.println(tv);

        Television tv2 = new Television("LG", 1045);
        System.out.println(tv2);


    }
}
