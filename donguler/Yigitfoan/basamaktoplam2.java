import java.util.Scanner;  

public class basamaktoplam2 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Bir sayi giriniz:");
        int sayi = scanner.nextInt();  
        
        int toplamlari = 0;  
        
        sayi = Math.abs(sayi);  
        
        while (sayi > 0) {  
            sayi = Math.abs(sayi);  
            toplamlari += sayi%10;  
            
            sayi = sayi / 10; 
          
        }  
        

        System.out.println("Girilen sayinin basamaklarinin toplami: " + toplamlari);  
        
    }  
}