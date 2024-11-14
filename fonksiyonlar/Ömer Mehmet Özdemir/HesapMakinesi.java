import java.util.Scanner;

public class HesapMakinesi {
    static double calculate(double n1, double n2, char op, byte precission) {
        double result = 0;
        double decimalRound = Math.pow(10, precission);
        switch(op) {
            case '+':
                result = n1+n2;
                break;
            case '-':
                result = n1-n2;
                break;
            case '*':
                result = n1*n2;
                break;
            case '/':
                result = n1/n2;
                break;
            default:
                System.out.println("Operatör tanınmadı.");
                System.exit(0);
        }
        return (double)Math.round(result*decimalRound)/decimalRound;
    } 

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        double num1 = sc.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = sc.nextDouble();
        System.out.print("Toplama: +\nÇıkarma: -\nÇarpma: *\nBölme: /\nOperatör giriniz: ");
        char op = sc.next().charAt(0);
        System.out.print("Yuvarlanacak ondalık basamağı giriniz (Max: 12): ");
        byte precission = sc.nextByte();
        sc.close();

        double result = calculate(num1, num2, op, precission);
        System.out.println("Cevap = "+result);
    }
}
