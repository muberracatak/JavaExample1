package Giris;
import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double herKm = 2.20;
        int km;
        int min = 10;
        System.out.println("Toplam gidilen km i giriniz : ");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();

        double sonuc = (km * herKm) + min;
        double odenecekTutar =( (sonuc< 20) ? 20 : sonuc);
        System.out.println(odenecekTutar);
    }
}
