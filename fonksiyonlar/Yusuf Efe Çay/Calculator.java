import java.util.Scanner;

public class Calculator{
    static double calculator(double sayi1, double sayi2, char islem){
        double donus;
        switch (islem) {
            case '+' -> {
                donus = sayi1+sayi2;
                return donus;
            }
            case '-' -> {
                donus = sayi1-sayi2;
                return donus;
            }
            case '*' -> {
                donus = sayi1 * sayi2;
                return donus;
            }
            case '/' -> {
                donus = sayi1 / sayi2;
                return donus;
            }

            default -> {
                return 0;
            }

        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1,sayi2, sonuc;
        String islem;

        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi giriniz (+,-,*,/): ");
        islem = input.next();


        sonuc = calculator(sayi1,sayi2,islem.charAt(0));

        if (sonuc == 0) {
            System.out.println("Lütfen geçerli bir işlem giriniz.");
        } else {
            System.out.println("İşleminizin sonucu :"+sonuc);
        }
        input.close();
    }
}