import java.util.Scanner;

public class SayiyiTersineCevirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tersine çevirmek istediğiniz sayıyı giriniz: ");
        Integer sayi = input.nextInt();

        String sayiString = sayi.toString();

        for (int i = sayiString.length()-1; i >= 0;i--) {
            System.out.print(sayiString.charAt(i));
        }
        
    }
}