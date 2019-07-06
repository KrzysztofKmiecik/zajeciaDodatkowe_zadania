package Zad10Robot;

public class Robot {

    private int poziomBaterii;// ( wartość od 0 do 100)
    private String nazwaRobota;
    private boolean wlaczony;
    private RuchRobota ruchRobota;

    public Robot(final String nazwaRobota, final int poziomBaterii) {
        this.poziomBaterii = poziomBaterii;
        this.nazwaRobota = nazwaRobota;

    }

    public void poruszRobotem(RuchRobota ruchRobota) throws NoEnoughBatteryPwerToMoveException, DeviceIsNotReadyException {

        if (this.isWlaczony()) {
            if (this.poziomBaterii > ruchRobota.getKosztBateri()) {
                this.poziomBaterii -= ruchRobota.getKosztBateri();
                System.out.print(String.format("Robot wykonał ruch %s ktory wymagał %d%% energii\t", ruchRobota, ruchRobota.getKosztBateri()));
            } else
                throw new NoEnoughBatteryPwerToMoveException("Za mało energi aby wykonać ruch");
        } else {
            throw new DeviceIsNotReadyException("Robot nie jest włączony");
        }
    }

    public int getPoziomBaterii() {
        return poziomBaterii;
    }

    public void setPoziomBaterii(final int poziomBaterii) {
        this.poziomBaterii = poziomBaterii;
    }

    public String getNazwaRobota() {
        return nazwaRobota;
    }

    public void setNazwaRobota(final String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
    }

    public boolean isWlaczony() {
        return wlaczony;
    }

    public void setWlaczony(final boolean wlaczony) {
        this.wlaczony = wlaczony;
    }
}
