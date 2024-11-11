
import java.util.Scanner;

public class faktorhesap {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Sayiyi giriniz:");
        int n= scanner.nextInt();
        
        for(int i= 0; i<= n; i++) {
            System.out.println(i + "! = " + FaktoriyelHesapla(i));  
        }
         
        }
    private static int FaktoriyelHesapla(int n) {
        int faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;


  }
}
