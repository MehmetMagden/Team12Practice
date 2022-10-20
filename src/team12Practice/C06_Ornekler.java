package team12Practice;

import java.util.Scanner;

public class C06_Ornekler {

    //kullanıcıdan main method içinde bir sayı alıp, onun pozitif tam sayı bölenlerinin sayısını dönen bir method oluşturun


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();
        System.out.println("pozitif bolen sayisi = "+pozitifTamBolenSayisi(sayi));
    }

    public static int pozitifTamBolenSayisi(int sayi) {
        int pozitifTamBolenSayisi = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                pozitifTamBolenSayisi = pozitifTamBolenSayisi + 1;
            }
        }
        return pozitifTamBolenSayisi;
    }
}
