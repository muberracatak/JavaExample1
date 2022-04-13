package Giris;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,islem;
        System.out.println("1. sayı :");
        Scanner input=new Scanner(System.in);
        sayi1 = input.nextInt();
        System.out.println("2. sayı :");
        sayi2 = input.nextInt();
        System.out.println("toplama : 1, Çıkarma : 2, Bölme : 3, Çarpma:4");
        System.out.println("Yapilacak islem :");
        islem = input.nextInt();

        switch (islem)
        {
            case 1:
                System.out.println(sayi1+sayi2);
            break;
            case 2:    System.out.println(sayi1-sayi2);
break;
            case 3:    System.out.println(sayi1/sayi2);
            break;
            case 4:   System.out.println(sayi1*sayi2);
            break;
        }

    }
}
