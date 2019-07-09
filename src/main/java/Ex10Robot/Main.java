package Ex10Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("iRobot", 100);
        robot.setRobotEnable(true);
        robotStart(robot, MovementsRobot.STEP_LEFT);
        robotStart(robot, MovementsRobot.MOVE_HAND_LEFT);
        robotStart(robot, MovementsRobot.STEP_RIGHT);
        robot.setRobotEnable(false);
        robotStart(robot, MovementsRobot.STEP_RIGHT);
        robotStart(robot, MovementsRobot.JUMP);
        robot.setRobotEnable(true);
        robotStart(robot, MovementsRobot.JUMP);
        robotStart(robot, MovementsRobot.JUMP);
        robotStart(robot, MovementsRobot.JUMP);
        robotStart(robot, MovementsRobot.JUMP);
        robotStart(robot, MovementsRobot.JUMP);
        robot.setRobotEnable(false);
    }

    public static void robotStart(Robot robot, MovementsRobot ruchRobota) {
        try {
            System.out.print(String.format("Batery level before %d%%\t ", robot.getBateryLevel()));
            robot.moveRobot(ruchRobota);

        } catch (DeviceIsNotReadyException e) {
            e.printStackTrace();
        } catch (NoEnoughBatteryPwerToMoveException e) {
            e.printStackTrace();
        }
            System.out.println(String.format("Baterry level after  %d%%", robot.getBateryLevel()));
        }
    }

    /*OUTPUT
Batery level before 100%	 Robot made  STEP_LEFT which cost 10% energy	Baterry level after  90%
Batery level before 90%	 Robot made  MOVE_HAND_LEFT which cost 5% energy	Baterry level after  85%
Batery level before 85%	 Robot made  STEP_RIGHT which cost 10% energy	Baterry level after  75%
Batery level before 75%	 Ex10Robot.DeviceIsNotReadyException: Robot was not enabled
	at Ex10Robot.Robot.moveRobot(Robot.java:25)
	at Ex10Robot.Main.robotStart(Main.java:25)
	at Ex10Robot.Main.main(Main.java:11)
Ex10Robot.DeviceIsNotReadyException: Robot was not enabled
	at Ex10Robot.Robot.moveRobot(Robot.java:25)
	at Ex10Robot.Main.robotStart(Main.java:25)
Baterry level after  75%
	at Ex10Robot.Main.main(Main.java:12)Batery level before 75%
Baterry level after  75%
Batery level before 75%	 Robot made  JUMP which cost 20% energy	Ex10Robot.NoEnoughBatteryPwerToMoveException: Batery lavel is too low
	at Ex10Robot.Robot.moveRobot(Robot.java:23)
	at Ex10Robot.Main.robotStart(Main.java:25)
	at Ex10Robot.Main.main(Main.java:17)
Baterry level after  55%
Batery level before 55%	 Robot made  JUMP which cost 20% energy	Baterry level after  35%
Batery level before 35%	 Robot made  JUMP which cost 20% energy	Baterry level after  15%
Batery level before 15%	 Baterry level after  15%
Batery level before 15%	 Ex10Robot.NoEnoughBatteryPwerToMoveException: Batery lavel is too low
	at Ex10Robot.Robot.moveRobot(Robot.java:23)
	at Ex10Robot.Main.robotStart(Main.java:25)
	at Ex10Robot.Main.main(Main.java:18)
Baterry level after  15%

Process finished with exit code 0

     */