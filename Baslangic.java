
package Giris;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int mat,fzk,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz :");
        mat = inp.nextInt();
        System.out.println("Fizik notunuzu giriniz :");
        fzk = inp.nextInt();
        System.out.println("Kimya notunuzu giriniz :");
        kimya = inp.nextInt();
        System.out.println("Turkce notunuzu giriniz :");
        turkce = inp.nextInt();
        System.out.println("Tarih notunuzu giriniz :");
        tarih = inp.nextInt();
        System.out.println("Muzik notunuzu giriniz :");
        muzik = inp.nextInt();

        double sonuc = (mat+fzk+kimya+tarih+muzik);
        System.out.println(sonuc);
        double ort = sonuc / 5.0;
        System.out.println(ort);


        String cevap = ort>60 ? "Sınıfı geçti" : "Sınıfta kaldi" ;
        System.out.println(cevap);
    }
}
