package TugasPemlan1;
import java.util.*;

public class selde {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int angka = scan.nextInt();

        cekSelde(angka);
        }


    static void cekSelde (int angka) {
        String newAngka = angka + "";

        if (newAngka.length() % 2 == 0) {
            int counter = 0;
            for (int i = 0, j = newAngka.length() - 1; i - j != 1; i++, j--) {
                if (newAngka.charAt(i) != newAngka.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(angka + " adalah selde.");
            } else
                System.out.println(angka + " bukan selde.");

        } else {
            int counter = 0;
            for (int i = 0, j = newAngka.length() - 1; i - j != 2; i++, j--) {
                if (newAngka.charAt(i) != newAngka.charAt(j)) {
                    counter++;
                }
            }

            if (counter == 0) {
                System.out.println(angka + " adalah selde.");
            } else
                System.out.println(angka + " bukan selde.");
        }
    }
}
