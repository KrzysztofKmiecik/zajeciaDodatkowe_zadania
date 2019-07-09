package Ex10Robot;

public class Robot {

    private int bateryLevel;// ( wartość od 0 do 100)
    private String RobotName;
    private boolean RobotEnable;
    private MovementsRobot movementsRobot;

    public Robot(final String robotName, final int bateryLevel) {
        this.bateryLevel = bateryLevel;
        this.RobotName = robotName;

    }

    public void moveRobot(MovementsRobot movementsRobot) throws NoEnoughBatteryPwerToMoveException, DeviceIsNotReadyException {

        if (this.isRobotEnable()) {
            if (this.bateryLevel > movementsRobot.getBateryCost()) {
                this.bateryLevel -= movementsRobot.getBateryCost();
                System.out.print(String.format("Robot made  %s which cost %d%% energy\t", movementsRobot, movementsRobot.getBateryCost()));
            } else
                throw new NoEnoughBatteryPwerToMoveException("Batery lavel is too low");
        } else {
            throw new DeviceIsNotReadyException("Robot was not enabled");
        }
    }

    public int getBateryLevel() {
        return bateryLevel;
    }

    public void setBateryLevel(final int bateryLevel) {
        this.bateryLevel = bateryLevel;
    }

    public String getRobotName() {
        return RobotName;
    }

    public void setRobotName(final String robotName) {
        this.RobotName = robotName;
    }

    public boolean isRobotEnable() {
        return RobotEnable;
    }

    public void setRobotEnable(final boolean robotEnable) {
        this.RobotEnable = robotEnable;
    }
}
