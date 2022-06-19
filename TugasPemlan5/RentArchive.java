package TugasPemlan5;

import java.util.ArrayList;

public class RentArchive {
    private ArrayList<CarRent> rentData = new ArrayList<>();

    void Rent (CarRider rider, Car car, int rentDur){
        if (car.isStatus()){
            System.out.println("Mobil berhasil disewa");
            rentData.add(new CarRent(rider, car, rentDur));
            car.setStatus(false);
        }

        else{
            System.out.println("Maaf, mobil sudah disewa");
        }
    }

    void info(){
        System.out.println("========================================");
        System.out.println("LIST MOBIL DISEWA");
        System.out.println("========================================");
        for (int i = 0; i < rentData.size(); i++) {
            System.out.println("NAMA PEMINJAM   : " + rentData.get(i).getRider().getName());
            System.out.println("TIPE MOBIL      : " + rentData.get(i).getCar().getCarType());
            System.out.println("MERK MOBIL      : " + rentData.get(i).getCar().getMerk());
            System.out.println("NO POLISI       : " + rentData.get(i).getCar().getPolNum());
            System.out.println("lAMA RENTAL     : " + rentData.get(i).getRentDur());
            System.out.println("----------------------------------------");

        }
    }
}
