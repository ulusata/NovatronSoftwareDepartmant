import java.util.Scanner;

public class Faktoriyel {
    static long factorial(long x) {
        return (x == 1) ? 1 : x * factorial(x-1);
    }
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        long num = sc.nextLong();
        sc.close();

        long factorial = factorial(num);
        System.out.println(factorial);
    }
}
