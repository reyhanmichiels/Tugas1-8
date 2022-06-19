package TugasPemlan7;

public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(){

    }

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString(){
        String returnString = "";
        returnString += "No. KTP        : " + getNoKTP() + "\n";
        return returnString;
    }

    public double gaji(){
        return 0.0;
    }
}


