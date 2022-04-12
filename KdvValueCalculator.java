package Giris;
import java.util.Scanner;

public class KdvValueCalculator {
    public static void main(String[] args) {
        double fiyat ;
        System.out.println("Fiyat değerini giriniz : ");
        Scanner inp = new Scanner(System.in);
         fiyat = inp.nextDouble();
        double sonuc =  ( fiyat * 18 ) / 100;
        double sonuc2 =  ( fiyat * 8 ) / 100;

        double kontrol = ((fiyat>0) || (fiyat<1000) ? sonuc + fiyat : sonuc2+ fiyat);
        System.out.println(kontrol);
    }
}
