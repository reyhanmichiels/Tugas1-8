package TugasPemlan5;

public class Main {
    public static void main(String[] args) {
        CarData dataCar = new CarData();
        dataCar.addCar("SUV", "B 2020 HNY", "TOYOTA");
        dataCar.addCar("JEEP", "B 2019 YEY", "HONDA");
        dataCar.addCar("SEDAN", "B 2022 KCE", "BMW");
        dataCar.addCar("SEDAN", "B 2018 SDH", "WULING");

        dataCar.listOfCar();
        System.out.println();

        CarRider budi = new CarRider("Budi Pekerti", 35, "082222800808");
        CarRider jaka = new CarRider("Jaka Sembung", 30, "081111080808");
        CarRider maman = new CarRider("Maman Racing", 33, "081221800808");
        CarRider tejo = new CarRider("Tejo Surti", 28, "081331800808");

        RentArchive arsip = new RentArchive();
        arsip.Rent(budi, dataCar.getCarList().get(0), 3);
        arsip.Rent(jaka, dataCar.getCarList().get(2), 5);
        arsip.Rent(tejo, dataCar.getCarList().get(0), 2);
        arsip.Rent(tejo, dataCar.getCarList().get(3), 2);
        arsip.Rent(maman, dataCar.getCarList().get(3), 9);
        arsip.Rent(maman, dataCar.getCarList().get(1), 9);
        System.out.println();

        arsip.info();


    }
}
