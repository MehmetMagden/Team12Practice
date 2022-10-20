package team12Practice;

public class C02_CreatingMethods {


    // a ile B yi toplayan bir method yapınız

    public static void main(String[] args) {

        toplama(12,5);

        int islemSonucu = cikarma(12,5);

        System.out.println("islemSonucu = " + islemSonucu);
    }

    public static void toplama(int a, int b){

        System.out.println(a+b);


    }

    public static int cikarma(int a,int b){

        int sonuc = a-b;

        return sonuc;
    }


}
