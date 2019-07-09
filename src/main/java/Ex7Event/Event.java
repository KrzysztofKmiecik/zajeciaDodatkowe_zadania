package Ex7Event;

import Ex6MyDate.MyDate;

public class Event {
    private String eventNAme;
    private MyDate myDate;


    public Event(final String eventNAme, final MyDate myDate) {
        this.eventNAme = eventNAme;
        this.myDate = myDate;
    }

    public int howManyYearsRemainsToEvent(MyDate myCurrentDate) {
        return howManyMonthsRemainToEvent(myCurrentDate) / 12;

    }

    public int howManyMonthsRemainToEvent(MyDate myCurrentDate) {

        return howManyDaysRemainToEvent(myCurrentDate) / 30;
    }


    public int howManyDaysRemainToEvent(MyDate myCurrentDate) {
        return diffrenceInDays(myCurrentDate);
    }

    private int howManyDaysIsInMonth(int year, int month) {
        int[] numbersOfDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (MyDate.isLeapYear(year)) {
            numbersOfDaysInMonth[1] = 29;
        }
        return numbersOfDaysInMonth[month - 1];
    }

    private int diffrenceInDays(MyDate myCurrentDate) {
        int y2 = this.myDate.getYear();
        int m2 = this.myDate.getMonth();
        int d2 = this.myDate.getDay();
        int y1 = myCurrentDate.getYear();
        int m1 = myCurrentDate.getMonth();
        int d1 = myCurrentDate.getDay();

        int days = 0;
        int daysInMonth = 0;

        if (y1 == y2) {
            if (m1 == m2) {
                days = d2 - d1;
            } else {
                for (int i = m1; i < m2; i++) {
                    daysInMonth = howManyDaysIsInMonth(y1, i);
                    if (i == m1) {
                        days = days + daysInMonth - d1 + d2;
                    } else {
                        days += daysInMonth;
                    }
                }
            }
        } else {

            for (int i = m1; i <= 12; i++) {
                if (i == m1) {
                    days = days + howManyDaysIsInMonth(y1, i) - d1;
                } else {
                    days += howManyDaysIsInMonth(y1, i);
                }
            }
            for (int i = m2; i >= 1; i--) {
                if (i == m2) {
                    days = days + d2;
                } else {
                    days += howManyDaysIsInMonth(y2, i);
                }
            }

            if (y2 - y1 > 1) {
                for (int i = y1 + 1; i < y2; i++) {
                    if (MyDate.isLeapYear(i)) {
                        days += 366;
                    } else {
                        days += 365;

                    }

                }
            }

        }
        return days;


    }

}
