package TugasPemlan7;

public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public String toString() {
        String returnString = "";

        returnString += "Upah           : " + getUpah() + "\n";
        returnString += "Pendapatan     : Rp " + (int)getUpah() + "\n";
        returnString += "--------------------------------------------------\n";
        return super.toString() + returnString;
    }
}
