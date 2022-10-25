public class ComputerClient {
    public static void main(String[] args) {
        ComputerUsingOverloadedMethods result1 = new ComputerUsingOverloadedMethods();

        result1.add(2147483649L, 9);
        result1.add(1, 9);
        result1.subtract(5, 2);
        result1.subtract(2147483649L, 2);

        Computer computer = new Computer("Brandon", 27, 1000);
        computer.displayComputer();

        System.out.println(Computer.getNumberOfTimesComputerIsInvoked() + " instances");

        System.out.println(AlarmClock.getNextId() + " Alarm Clock");

    }

}



