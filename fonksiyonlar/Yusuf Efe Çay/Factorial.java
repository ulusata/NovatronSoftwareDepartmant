import java.util.Scanner;

public class Factorial{

    static int factorial(int sayi){
        int toplam = 1;
        for (int i = sayi; i > 0; i--) {
            toplam *= i;
        }
        return toplam;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyelini almak istediğiniz sayıyı giriniz: ");
        int sayi = input.nextInt();
        input.close();
        System.out.printf("Girdiğiniz sayının faktöriyeli: %d, %d",factorial(sayi),65);
    
    }
}