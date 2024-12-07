import java.util.Scanner;
public class Eymen5sayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Bir sayı giriniz");
        a = input.nextInt();
        System.out.println("ikinci sayı giriniz");
        b = input.nextInt();
        System.out.println("üçüncü sayıyı giriniz");
        c = input.nextInt();
        System.out.println("Dördüncü sayıyı giriniz");
        d = input.nextInt();
        System.out.println("Beşinci sayıyı giriniz");
        e = input.nextInt();
        int toplam= a+b+c+d+e;
        System.out.println(toplam/5);
       
    }
    
}
