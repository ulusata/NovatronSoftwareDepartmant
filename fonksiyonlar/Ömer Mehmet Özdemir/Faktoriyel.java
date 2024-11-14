import java.util.Scanner;

public class Faktoriyel {
    static long factorial(long x) {
        long result = 1;
        for (; x > 1; x--) {
            result *= x;
        }
        return result;
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
