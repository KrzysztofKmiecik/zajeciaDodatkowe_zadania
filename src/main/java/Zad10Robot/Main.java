package Zad10Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("iRobot", 100);
        robot.setWlaczony(true);
        robotStart(robot, RuchRobota.KROK_LEWA);
        robotStart(robot, RuchRobota.RUCH_REKA_LEWA);
        robotStart(robot, RuchRobota.KROK_PRAWA);
        robot.setWlaczony(false);
        robotStart(robot, RuchRobota.KROK_PRAWA);
        robotStart(robot, RuchRobota.SKOK);
        robot.setWlaczony(true);
        robotStart(robot, RuchRobota.SKOK);
        robotStart(robot, RuchRobota.SKOK);
        robotStart(robot, RuchRobota.SKOK);
        robotStart(robot, RuchRobota.SKOK);
        robotStart(robot, RuchRobota.SKOK);
        robot.setWlaczony(false);
    }

    public static void robotStart(Robot robot, RuchRobota ruchRobota) {
        try {
            System.out.print(String.format("Poziom baterii przed %d%%\t ", robot.getPoziomBaterii()));
            robot.poruszRobotem(ruchRobota);

        } catch (DeviceIsNotReadyException e) {
            e.printStackTrace();
        } catch (NoEnoughBatteryPwerToMoveException e) {
            e.printStackTrace();
        }
            System.out.println(String.format("Poziom baterii po %d%%", robot.getPoziomBaterii()));
        }
    }
