package TugasPemlan7;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        String returnString = "";

        returnString += "Upah/Jam       : Rp " + getUpahPerJam() + "\n";
        returnString += "Total Jam Kerja: " + getTotalJam() + "\n";

        if ((int) getTotalJam() <= 40)
            returnString += "Pendapatan     : RP " + (int) (getUpahPerJam() * getTotalJam()) + "\n";
        else
            returnString += "Pendapatan     : RP " + (int) ((40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5)) + "\n";
        returnString += "--------------------------------------------------\n";

        return super.toString() + returnString;
    }
}
