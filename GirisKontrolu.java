package Giris;
import java.util.Scanner;
public class GirisKontrolu {
    public static void main(String[] args) {
        String ad,sifre;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adiniz : ");
        ad = input.nextLine();
        System.out.println("Sifreniz : ");
        sifre = input.nextLine();

       /* if(ad.equals("patika") && (sifre.equals("patika123")))
        {
            System.out.println("basariyla giris yaptiniz...");
        }
        else {
            System.out.println("Sifre veya kullanici adi hatali ...");
        }*/

        if(!sifre.equals("patika123"))
        {
            System.out.println("Sifre yanlis. Sifreyi sifirlamak istiyor musunuz ?");
            String cevap = input.nextLine();
            if(cevap.equals("Evet"))
            {
                System.out.println("Sifre giriniz : ");
                String yeniSifre = input.nextLine();
                if(sifre.equals(yeniSifre))
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }

    }
}
