package Giris;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double boy , kilo,sonuc;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        Scanner input = new Scanner(System.in);

        boy =input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :  ");
        kilo = input.nextDouble();

        sonuc = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : ");
        System.out.println(sonuc);


    }

}
