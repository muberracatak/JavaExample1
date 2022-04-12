package Giris;


import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3;
        Scanner input = new Scanner(System.in);
        System.out.println("1. kenar uzunlugu giriniz : ");
        kenar1 = input.nextInt();
        System.out.println("2. kenar uzunlugu giriniz : ");
        kenar2=input.nextInt();
        System.out.println("3. kenar uzunlugu giriniz : ");
        kenar3=input.nextInt();

        int u = (kenar1+kenar2+kenar3) /2;
        int cevre = 2*u;

        int alanKare = u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        double sonuc= Math.sqrt(alanKare);
        System.out.println("Ucgenin alani : ");
        System.out.println(sonuc);
    }

}
