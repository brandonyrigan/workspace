public class AlarmClockClient {
    public static void main(String[] args) {
        AlarmClock alarm1 = new AlarmClock(10);
        AlarmClock alarm2 = new AlarmClock(20);
        int idOfAlarm1 = alarm1.getId();
        System.out.println("Alarm 1 id: " + idOfAlarm1);

        int idOfAlarm2 = alarm2.getId();
        System.out.println("Alarm 2 id: " + idOfAlarm2);
    }
}
