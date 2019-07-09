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
            System.out.print(String.format("Poziom baterii przed %d%%\t ", robot.getBateryLevel()));
            robot.moveRobot(ruchRobota);

        } catch (DeviceIsNotReadyException e) {
            e.printStackTrace();
        } catch (NoEnoughBatteryPwerToMoveException e) {
            e.printStackTrace();
        }
            System.out.println(String.format("Poziom baterii po %d%%", robot.getBateryLevel()));
        }
    }

    /*OUTPUT
    Poziom baterii przed 100%	 Robot made  STEP_LEFT which cost 10% energy	Poziom baterii po 90%
Poziom baterii przed 90%	 Robot made  MOVE_HAND_LEFT which cost 5% energy	Poziom baterii po 85%
Poziom baterii przed 85%	 Robot made  STEP_RIGHT which cost 10% energy	Poziom baterii po 75%
Poziom baterii przed 75%	 Ex10Robot.DeviceIsNotReadyException: Robot was not enabled
	at Ex10Robot.Robot.moveRobot(Robot.java:25)
	at Ex10Robot.Main.robotStart(Main.java:25)Poziom baterii po 75%
Poziom baterii przed 75%	 Poziom baterii po 75%
Poziom baterii przed 75%	 Robot made  JUMP which cost 20% energy	Poziom baterii po 55%
Poziom baterii przed 55%	 Robot made  JUMP which cost 20% energy	Poziom baterii po 35%
Poziom baterii przed 35%
	at Ex10Robot.Main.main(Main.java:11)
Robot made  JUMP which cost 20% energy	Ex10Robot.DeviceIsNotReadyException: Robot was not enabled
	at Ex10Robot.Robot.moveRobot(Robot.java:25)
	at Ex10Robot.Main.robotStart(Main.java:25)
	at Ex10Robot.Main.main(Main.java:12)
Poziom baterii po 15%
Poziom baterii przed 15%	 Ex10Robot.NoEnoughBatteryPwerToMoveException: Batery lavel is too low
	at Ex10Robot.Robot.moveRobot(Robot.java:23)
	at Ex10Robot.Main.robotStart(Main.java:25)
	at Ex10Robot.Main.main(Main.java:17)
Poziom baterii po 15%
Poziom baterii przed 15%	 Ex10Robot.NoEnoughBatteryPwerToMoveException: Batery lavel is too low
	at Ex10Robot.Robot.moveRobot(Robot.java:23)
	at Ex10Robot.Main.robotStart(Main.java:25)
	at Ex10Robot.Main.main(Main.java:18)
Poziom baterii po 15%

Process finished with exit code 0

     */