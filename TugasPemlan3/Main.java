package TugasPemlan3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Baju bajuA = new Baju("A", 100000);
        Baju bajuB = new Baju("B", 125000);
        Baju bajuC = new Baju("C", 175000);

        System.out.println("Selamat datang di Erigo Store Malang \n");
        System.out.println("Daftar baju yang kami punya :");
        System.out.println("Baju " + bajuA.getJenis() + " dengan harga = " + bajuA.getHarga());
        System.out.println("Baju " + bajuB.getJenis() + " dengan harga = " + bajuB.getHarga());
        System.out.println("Baju " + bajuC.getJenis() + " dengan harga = " + bajuC.getHarga() + "\n");

        System.out.print("Masukkan jenis baju yang diinginkan = ");
        String jenis = scan.next();



        if (jenis.equalsIgnoreCase("a")){
            System.out.print("Masukkan jumlah yang diinginkan = ");
            int jumlah = scan.nextInt();
            System.out.println();

            System.out.println("Jenis baju yang anda beli = " + bajuA.getJenis());
            System.out.println("Dengan harga satuan = " + bajuA.getHarga());
            System.out.println("Jumlah baju yang anda beli = " + jumlah);

            if (jumlah > 100){
                System.out.println("Anda mendapat potongan karena pembelian lebih dari 100 pcs");
                System.out.println("Harga per pcs menjadi = " + (bajuA.getHarga() - 5000));
                System.out.println("Total harga pembelian = " + bajuA.hargaJual(jumlah));
            }
            else
                System.out.println("Total harga pembelian = " + bajuA.hargaJual(jumlah));
        }

        else if (jenis.equalsIgnoreCase("b")){
            System.out.print("Masukkan jumlah yang diinginkan = ");
            int jumlah = scan.nextInt();
            System.out.println();

            System.out.println("Jenis baju yang anda beli = " + bajuB.getJenis());
            System.out.println("Dengan harga satuan = " + bajuB.getHarga());
            System.out.println("Jumlah baju yang anda beli = " + jumlah);

            if (jumlah > 100){
                System.out.println("Anda mendapat potongan karena pembelian lebih dari 100 pcs");
                System.out.println("Harga per pcs menjadi = " + (bajuB.getHarga() - 5000));
                System.out.println("Total harga pembelian = " + bajuB.hargaJual(jumlah));
            }
            else
                System.out.println("Total harga pembelian = " + bajuB.hargaJual(jumlah));
        }

        else if (jenis.equalsIgnoreCase("c")){
            System.out.print("Masukkan jumlah yang diinginkan = ");
            int jumlah = scan.nextInt();
            System.out.println();

            System.out.println("Jenis baju yang anda beli = " + bajuC.getJenis());
            System.out.println("Dengan harga satuan = " + bajuC.getHarga());
            System.out.println("Jumlah baju yang anda beli = " + jumlah);

            if (jumlah > 100){
                System.out.println("Anda mendapat potongan karena pembelian lebih dari 100 pcs");
                System.out.println("Harga per pcs menjadi = " + (bajuC.getHarga() - 15000));
                System.out.println("Total harga pembelian = " + bajuC.hargaJual(jumlah));
            }
            else
                System.out.println("Total harga pembelian = " + bajuC.hargaJual(jumlah));
        }

    }
}
