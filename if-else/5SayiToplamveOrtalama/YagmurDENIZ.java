import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("A sayisini giriniz:");
        a=input.nextInt();
        System.out.println("B sayisini giriniz :");
        b=input.nextInt();
        System.out.println("C sayisini giriniz :");
        c=input.nextInt();
        System.out.println("D sayisini giriniz :");
        d=input.nextInt();
        System.out.println("E sayisini giriniz :");
        e=input.nextInt();
        System.out.println("Tüm sayilarin toplami : "+(a+b+c+d+e));
        System.out.println("Ortalamasi  :"+((a+b+c+d+e)/5));

    }
}
