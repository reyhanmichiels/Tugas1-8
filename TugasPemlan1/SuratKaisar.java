package TugasPemlan1;
import java.util.*;

public class SuratKaisar {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String kalimat = scan.nextLine();
        int n = scan.nextInt();

        enskripsi(kalimat, n);
    }

    static void enskripsi(String kalimat, int n){
        char[] cekbesar = new char[26];
        for (int i = 0, j = 65; i < 26; i++, j++){
            cekbesar[i] = (char) j;
        }

        char[] cekkecil = new char[26];
        for (int i = 0, j = 97; i < 26; i++, j++){
            cekkecil[i] = (char) j;
        }

        for (int i = 0; i < kalimat.length(); i++){
            if (kalimat.charAt(i) >= 65 && kalimat.charAt(i) <= 90){
                if (n + (int)kalimat.charAt(i) > 90)
                    System.out.print(cekbesar[-1 + (26-(int)kalimat.charAt(i))]);
                else
                    System.out.print(cekbesar[(int)kalimat.charAt(i)+n]);
            }

            if (kalimat.charAt(i) >= 97 && kalimat.charAt(i) <= 122){
                if (n + (int)kalimat.charAt(i) > 26)
                    System.out.print(cekkecil[-1 + (26-(int)kalimat.charAt(i))]);
                else
                    System.out.print(cekkecil[(int)kalimat.charAt(i)+n]);
            }

            if (kalimat.charAt(i) == ' ')
                System.out.print(' ');
        }
          /*  for (int j = 0; j < 26; j++){
                if (kalimat.charAt(i) == cekbesar[j]){
                    if (n + j > 26)
                        System.out.print(cekbesar[-1 + (26-j)]);

                    else
                        System.out.print(cekbesar[j+n]);
                }
            }

            for (int j = 0; j < 26; j++){
                if (kalimat.charAt(i) == cekkecil[j]){
                    if (n + j > 26)
                        System.out.print(cekkecil[-1 + (26-j)]);

                    else
                        System.out.print(cekkecil[j+n]);
                }
            }
        }*/
    }
}
