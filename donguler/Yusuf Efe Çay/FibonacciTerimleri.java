import java.util.*;

public class FibonacciTerimleri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);

        System.out.println("Sıfırdan başlayarak kaç tane Fibonacci sayısı üretilmesini istersiniz: ");
        int terimSayisi = input.nextInt();

        if (terimSayisi <= 0) {
            System.out.println("Lütfen geçerli bir sayı giriniz.");
        } else if (terimSayisi == 1) {
            System.out.println("["+fibonacci.get(0)+"]");
        } else if (terimSayisi == 2){
            System.out.println(fibonacci);
        } else {
            for (int i = 2; i < terimSayisi; i++) {
                fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
            }
            System.out.println(fibonacci);
        }
    }
}