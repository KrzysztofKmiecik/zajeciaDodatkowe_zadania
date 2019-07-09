package Ex6MyDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyDate {
    private int day;
    private int month;
    private int year;

    public String showDate(char mode) {
        switch (mode) {
            case 'a': {
                return new String(String.format("%d.%d.%d", this.day, this.month, this.year));
            }
            case 'b': {
                return new String(String.format("%02d.%02d.%d", this.day, this.month, this.year));
            }
            case 'c': {
                String[] sMonth = {"sty", "lut", "mar", "kwi", "maj", "cze", "lip", "sie", "wrz", "paz", "lis", "gru"};
                return new String(String.format("%d %s %d", this.day, sMonth[this.month - 1], this.year));
            }

        }
        return new String("");
    }

    public static boolean isLeapYear(int year) {

        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
