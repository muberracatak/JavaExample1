package Giris;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14,elma =3.67,domates= 1.11,muz=0.95,patlican=5.00;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        armutKg=input.nextDouble();
        System.out.println("elma Kaç Kilo ? :");
        elmaKg = input.nextDouble();
        System.out.println("domates Kaç Kilo ? :");
        domatesKg = input.nextDouble();
        System.out.println("muz Kaç Kilo ? :");
        muzKg = input.nextDouble();
        System.out.println("patlican Kaç Kilo ? :");
        patlicanKg = input.nextDouble();
        double toplam = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("Toplam Tutar : "+ toplam);


    }
}
