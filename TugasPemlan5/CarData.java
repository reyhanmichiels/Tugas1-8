package TugasPemlan5;

import java.util.ArrayList;

public class CarData {
    private ArrayList<Car> carList = new ArrayList<>();

    public ArrayList<Car> getCarList() {
        return carList;
    }

    void addCar (String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk, true));
    }

    void listOfCar (){
        System.out.println("========================================");
        System.out.println("LIST MOBIL");
        System.out.println("========================================");
        for (int i = 0; i < carList.size() ; i++) {
            System.out.println("TIPE MOBIL : " + carList.get(i).getCarType());
            System.out.println("NO. POLISI : " + carList.get(i).getPolNum());
            System.out.println("MERK MOBIL : " + carList.get(i).getMerk());
            System.out.println("----------------------------------------");
        }
    }

}
