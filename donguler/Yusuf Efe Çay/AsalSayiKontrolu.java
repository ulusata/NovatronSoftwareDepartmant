import java.util.*;

public class AsalSayiKontrolu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean asalDegil = false;

        System.out.println("Asal sayı olup olmadığını kontrol etmek için bir sayı giriniz: ");
        int sayi = input.nextInt();
        int sayiKok = Math.abs(sayi);

        for (int i = 2; i < sayiKok; i++) {
            if (sayi % i == 0) {
                asalDegil = true;
            }
        }   //https://en.wikipedia.org/wiki/Primality_test
        
        if (asalDegil) {
            System.out.println("Girdiğiniz sayı asal değildir.");
        } else {
            System.out.println("Girdiğiniz sayı asaldır.");
        }

    }
}
