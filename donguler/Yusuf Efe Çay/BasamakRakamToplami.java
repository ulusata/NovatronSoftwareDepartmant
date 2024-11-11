import java.util.Scanner;

public class BasamakRakamToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sayiMutlak, toplam;
        toplam = 0;

        System.out.println("Basamaklarındaki rakamları toplamak için bir sayı giriniz: ");
        sayi = input.nextInt();
        sayiMutlak = Math.abs(sayi);

        while (sayiMutlak>0) { 
            toplam += sayiMutlak % 10;
            sayiMutlak = sayiMutlak / 10;
        }

        System.out.println("Girdiğiniz sayının basamak değerlerinin toplamı: "+toplam);
    }
}
