import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {;
    Scanner scan = new Scanner(System.in);
    int sayi1,sayi2,secim;
    System.out.println("İlk Sayiyi Giriniz : ");
    sayi1 = scan.nextInt();

    System.out.println("İkinci Sayiyi Giriniz : ");
    sayi2 = scan.nextInt();

    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
    System.out.println("1- Toplama");
    System.out.println("2- Çikarma");
    System.out.println("3- Bölme");
    System.out.println("4- Çarpma");
    System.out.println("Seçim : ");
    secim = scan.nextInt();

    if(secim == 1){
        System.out.println("Toplam : " + (sayi1+sayi2));
    } else if(secim == 2) {
        System.out.println("Çikarma : " +(sayi1-sayi2));
    } else if(secim == 3){
        System.out.println("Bölme : " +(sayi1/sayi2));
    } else if (secim == 4){
        System.out.println("Çarpma : " + (sayi1*sayi2));
    }
    




    }
}
