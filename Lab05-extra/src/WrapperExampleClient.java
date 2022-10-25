import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class WrapperExampleClient {
    public static void main(String[] args) {
        System.out.println(WrapperExample.convertStringToIntPrimitive("10"));
        System.out.println(WrapperExample.convertStringToIntPrimitive("5"));

        System.out.println(WrapperExample.convertStringToIntegerObject("22"));
        System.out.println(WrapperExample.convertStringToIntegerObject("28"));

        LocalDate bday = LocalDate.of(1994, 7, 8);
        String display = bday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(display);

        LocalDate moonLanding = LocalDate.of(1969, 7, 20);
        display = moonLanding.format(DateTimeFormatter.ofPattern("EEE, d MMM yyyy"));
        System.out.println(display);

        LocalTime end = LocalTime.of(13, 20);
        display = end.format(DateTimeFormatter.ofPattern("h:mm a"));
        System.out.println(display);
    }
}
