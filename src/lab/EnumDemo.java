package lab;

/**
 * @author Unish Rajak
 */

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class EnumDemo {
    public static void main(String[] args) {
        Day d = Day.WEDNESDAY;
        switch (d) {
            case MONDAY:
                System.out.println("Start of week");
                break;
            case WEDNESDAY:
                System.out.println("Midweek day");
                break;
            default:
                System.out.println("Another weekday");
        }
    }
}

