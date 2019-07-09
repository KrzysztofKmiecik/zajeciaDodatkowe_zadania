package Ex10Robot;

public enum MovementsRobot {
    STEP_LEFT(10),
    STEP_RIGHT(10),
    MOVE_HAND_LEFT(5),
    MOVE_HAND_RIGHT(5),
    JUMP(20);

    private int batteryCost;


    MovementsRobot(final int batteryCost) {
        this.batteryCost = batteryCost;
    }

    public int getBateryCost() {
        return batteryCost;
    }
}
