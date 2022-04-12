package Giris;
import java.util.Scanner;
public class DaireAlanCevreHesabi {
    public static void main(String[] args) {
        double pi = 3.14;
        int yaricap;
        Scanner input = new Scanner(System.in);
        System.out.println("Yaricap degerini giriniz : ");
        yaricap = input.nextInt();
        double alan = pi*yaricap*yaricap;
        double cevre = 2*pi*yaricap;
        double daireDilimAlani = (pi*(yaricap*yaricap)*90)/360;
        System.out.println(daireDilimAlani);
    }
}
