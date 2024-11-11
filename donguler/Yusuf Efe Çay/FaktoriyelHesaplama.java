
import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long faktoriyel = 1;

        System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 0) {
            System.out.println("Lütfen geçerli bir sayı giriniz.");
        }else if (sayi == 0) {
            System.out.println("Girdiğiniz sayının faktöriyeli: 0");
        } else {
            for (int i = sayi; i>0; i--) {
                faktoriyel = i * faktoriyel;
            }
            System.out.println("Girdiğiniz sayının faktöriyeli: "+faktoriyel);
        }
        //Kod 26 ve ondan yüksek sayıların faktöriyelini istemeye başladığımız an bozuluyor?? 
        
        
    }
}