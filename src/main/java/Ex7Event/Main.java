package Ex7Event;

import Ex6MyDate.MyDate;

public class Main {
    public static void main(String[] args) {
        MyDate currentDate = new MyDate(25, 2, 2019);
        Event event = new Event("Opener", new MyDate(6, 04, 2020));

        System.out.println(String.format("Remains in years: %s", event.howManyYearsRemainsToEvent(currentDate)));
        System.out.println(String.format("Remains in months: %s", event.howManyMonthsRemainToEvent(currentDate)));
        System.out.println(String.format("Remains in days: %s", event.howManyDaysRemainToEvent(currentDate)));
    }
}
/*OUTPUT
Remains in years: 1
Remains in months: 13
Remains in days: 406

Process finished with exit code 0
 */
