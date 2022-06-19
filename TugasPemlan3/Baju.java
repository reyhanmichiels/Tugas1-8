package TugasPemlan3;

class Baju {
    String jenis;
    final int harga;

    Baju (String jenis, int harga){
        this.jenis = jenis;
        this.harga = harga;
    }

    String getJenis(){
        return jenis;
    }

    int getHarga() {
        return harga;
    }

    int hargaJual(int jumlah) {
        if (jumlah <= 100){
            return harga * jumlah;
        }

        else {
            if (harga > 150000){
                return (harga - 15000) * jumlah;
            }
            else{
                return (harga - 5000) * jumlah;
            }
        }
    }
}


