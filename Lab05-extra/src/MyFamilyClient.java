import java.util.EnumSet;

public class MyFamilyClient {
    public static void main(String[] args) {
        for (MyFamily member : MyFamily.values()) {
            System.out.print(member + " ");
        }

        System.out.println();

        for (MyFamily member : EnumSet.range(MyFamily.RJ, MyFamily.BRANDON)) {
            System.out.print(member + " ");
        }
    }
}
