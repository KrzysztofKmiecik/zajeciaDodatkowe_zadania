package Ex10Robot;

public class NoEnoughBatteryPwerToMoveException extends Throwable {
    public NoEnoughBatteryPwerToMoveException(final String s) {
        super(s);
    }
}
