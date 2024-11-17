import java.util.Scanner;

public static void main(String[] args) {
    Scanner utku = new Scanner(System.in);

    System.out.println("bir sayı girin");
    int sayi = utku.nextInt();

    System.out.println("ikinci sayıyı girin");
    int sayi2 = utku.nextInt();
    System.out.println("yapmak istediğiniz işlemi giriniz (+ , - , * , /)");
    char islem = utku.next().charAt(0);

    double result = Calculator.calculate(sayi, sayi2, islem);
    System.out.println("Sonuç:" + result);
}

public class Calculator {

    static double calculate(double n1, double n2, char op) {
        switch (op) {
            case '+':
                return (n1 + n2);

            case '-':
                return (n1 - n2);

            case '*':
                return (n1 * n2);

            case '/':
                return (n1 / n2);

            default:
                return (0);

        }

    }

}
