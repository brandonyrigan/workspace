public class AlarmClock {
    private int snoozeInterval = 20;
    private static int nextId = 1;
    private int id;

    public AlarmClock() {
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
        this.id = nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        int oldValueLocal = this.snoozeInterval;
        snoozeInterval = snoozeInterval;
        System.out.println("old = " + oldValueLocal + " new = " + snoozeInterval);
    }

    public String toString() {
        return "AlarmClock: snoozeInterval: " + snoozeInterval;
    }
}

