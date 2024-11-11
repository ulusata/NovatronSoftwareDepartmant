import java.util.Scanner;  

public class sayitoplam {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Terim sayisini giriniz: ");  
        int terimSayisi = scanner.nextInt();  
        
        if (terimSayisi <= 0) {  
            System.out.println("Lütfen pozitif bir tamsayi giriniz.");  
        } else {  
            
            System.out.print("Fibonacci Serisi: ");  
            for (int i = 0; i < terimSayisi; i++) {  
                System.out.print(fibonacci(i) + " "); 
            }  
            if (terimSayisi > 0) {  
                int fibonacciDegeri = fibonacci(terimSayisi - 1);  
                System.out.println(terimSayisi + "Sayinin Fibonacci değeri: " + fibonacciDegeri);  
            }  


        }  



        
        scanner.close();  
    }  
    
    public static int fibonacci(int n) {  
        if (n == 0) {  
            return 0;  
        } else if (n == 1) {  
            return 1;  
        } else {  
            return fibonacci(n - 1) + fibonacci(n - 2);  
        }  
    }  
}  