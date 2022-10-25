public class StringAndStringBuilderClient {
    public static void main(String[] args) {
        System.out.println("== " + (StringAndStringBuilder.constructMyAddressUsingString() == StringAndStringBuilder.constructMyAddressUsingStringBuilder()));
        System.out.println(".equals " + StringAndStringBuilder.constructMyAddressUsingString().equals(StringAndStringBuilder.constructMyAddressUsingStringBuilder()));
    }
}
