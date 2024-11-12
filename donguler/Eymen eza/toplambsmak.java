import java.util.Scanner;  

public class toplambsmak {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("sayı:");
        int sayi = scanner.nextInt();  
        
        int toplam = 0;  
        
        sayi = Math.abs(sayi);  
        
        while (sayi > 0) {  
            sayi = Math.abs(sayi);  
            toplam += sayi%10;  
            
            sayi = sayi / 10; 
          
        }  
        

        System.out.println("Girilen sayinin basamaklarinin toplami: " + toplam);  
        
    }  
}
    

