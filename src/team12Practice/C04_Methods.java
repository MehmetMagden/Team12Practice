package team12Practice;

import java.util.Locale;

public class C04_Methods {

    public static void main(String[] args) {

        // mehmet magden >>>> Mehmet MAGDEN


        String programUretti=isimDuzelteProgrami("meHmEt","maGdEn");

        System.out.println(programUretti);
    }

    public static String isimDuzelteProgrami(String isim, String soyIsim){

        String basHarf = isim.substring(0,1).toUpperCase();
        String isimGerisi =isim.substring(1).toLowerCase();
        String ikinciIsim = soyIsim.toUpperCase();


        String sonuc= basHarf+isimGerisi+" "+ikinciIsim;

        return  sonuc;

    }

}
