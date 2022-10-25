public class FlowControl {
    public static boolean isItEvenNumber(int number) {
        boolean isEven = false;
        if (number % 2 == 0) {
            isEven = true;
        } else isEven = false;

        return isEven;
    }

    public static int hexCharToDecimal(char hexChar) {
        int decimal = 0;
        switch(hexChar) {
            case 'A':
                decimal = 10;
                break;
            case 'B':
                decimal = 11;
                break;
            case 'C':
                decimal = 12;
                break;
            case 'D':
                decimal = 13;
                break;
            case 'E':
                decimal = 14;
                break;
            case 'F':
                decimal = 15;
                break;
            default:
                decimal = hexChar - '0';
        }
        return decimal;
    }
}
