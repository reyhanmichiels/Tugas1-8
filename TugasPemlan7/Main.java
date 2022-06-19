package TugasPemlan7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> peg = new ArrayList<>();

        peg.add(new PegawaiTetap("Bayu", "3172002600446668", 2000000));
        peg.add(new PegawaiHarian("Edo", "3188659276480007", 8500, 40));
        peg.add(new Sales("Tika", "3168470038197589", 50, 50000));
        peg.add(new PegawaiTetap("Joko", "3167895583057688", 2500000));
        peg.add(new PegawaiHarian("Ucup", "3178990367890067", 9000, 45));
        peg.add(new Sales("Chika", "3176895467980900", 34, 65000));
        peg.add(new PegawaiTetap("Syala", "3176546589097688", 1800000));
        peg.add(new PegawaiHarian("Samsul", "3184736481437399", 4000, 36));
        peg.add(new Sales("Udin", "3176483648260989", 60, 45000));

        System.out.println("==================================================");
        for (Pegawai pegawai : peg) {
            System.out.print(print(pegawai));
        }
    }

    public static String print(Pegawai x){
        if (x instanceof PegawaiHarian){
            return "Pegawai Harian : " + x.getNama() + "\n" + x.toString();
        }

        else if (x instanceof  PegawaiTetap){
            return "Pegawai Tetap  : " + x.getNama() + "\n" + x.toString();
        }

        else if (x instanceof Sales){
            return "Sales          : " + x.getNama() + "\n" + x.toString();
        }

        else
            return  " ";
    }
}
