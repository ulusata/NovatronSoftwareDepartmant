import java.util.Scanner;


public class faktöriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayı");
        int a = input.nextInt();
        int sonuc = 1;

        for(int i=1; i<=a; i++)
        sonuc=sonuc* i;
        System.out.println("sonuc" + sonuc);
    }
}
