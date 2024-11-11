import java.util.Scanner;

public class Terssayi {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        
        int terssayi = 0;
        
        while (sayi > 0) {
            int basamak = sayi % 10;
            terssayi = terssayi * 10 + basamak;
            sayi = sayi / 10;
        }
        
        System.out.println("Girilen sayinin tersi: " + terssayi);
        
        scanner.close();
    }
}