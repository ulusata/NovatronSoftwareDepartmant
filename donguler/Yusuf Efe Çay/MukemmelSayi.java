
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Mükemmel sayı olup olmadığını kontrol etmek için bir sayı giriniz:");
        int sayi = input.nextInt();


        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir.");
        }
    }
}
