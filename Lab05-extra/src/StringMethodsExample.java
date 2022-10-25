import java.util.Locale;

public class StringMethodsExample {
    public static void main(String[] args) {
        String msg = "hello world";
        String msg2 = "HELLO WORLD";
        String msg3 = "This is a string.";
        String msg4 = "This is a string.";
        String msg5 = "    lots of empty space   ";

        //contains()
        boolean contain = msg.contains("world");
        System.out.println(msg + " Contains: " + contain);

        //endsWith()
        boolean endsWith = msg2.endsWith(".");
        System.out.println(msg2 + " Ends with: " + endsWith);

        //equals()
        boolean equals = msg3.equals(msg4);
        boolean equals2 = msg.equals(msg2);
        System.out.println(msg3 + " " + msg4 + " Equals: " + equals);
        System.out.println(msg + " " + msg2 + " Equals: " + equals2);

        //equalsIgnoreCase()
        boolean equalsCase = msg.equalsIgnoreCase(msg2);
        boolean equalsCase2 = msg3.equalsIgnoreCase(msg4);
        System.out.println(msg + " " + msg2 + " Equals Ignore Case: " + equalsCase);
        System.out.println(msg3 + " " + msg4 + " Equals Ignore Case: " + equalsCase2);

        //indexOf()
        int indexOf = msg.indexOf('w');
        System.out.println(msg + " Index of 'w': " + indexOf);

        //length()
        int length = msg.length();
        System.out.println(msg + " Length: " + length);

        //split()
        String[] splitString = msg3.split(" ");
        for (String word : splitString) {
            System.out.println("Split String: " + word);
        }

        //startsWith()
        boolean startsWith = msg.startsWith("h");
        System.out.println(msg + " Starts With 'h': " + startsWith);

        //strip()
        String strip = msg5.strip();
        System.out.println(msg5 + " Strip: " + strip);

        //substring()
        String subString = msg.substring(2);
        System.out.println(msg + " SubString: " + subString);

        //toLowerCase()
        String lowerCase = msg2.toLowerCase();
        System.out.println(msg2 + " Lower Case: " + lowerCase);

        //toUpperCase()
        String upperCase = msg.toUpperCase();
        System.out.println(msg + " Upper Case: " + upperCase);
    }
}
