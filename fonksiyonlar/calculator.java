
    import java.util.Scanner;
    public class calculator{
    static double calculator(double sayi, double sayi2, char islem){
        double donus;
        switch (islem) {
            case '+' -> {
                donus = sayi+sayi2;
                return donus;
            }
            case '-' -> {
                donus = sayi-sayi2;
                return donus;
            }
            case '*' -> {
                donus = sayi * sayi2;
                return donus;
            }
            case '/' -> {
                donus = sayi / sayi2;
                return donus;
            }
            default -> {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi, sayi2, sonuc;
        String islem;
            System.out.println("İlk sayıyı giriniz: ");
            sayi = input.nextInt();
            System.out.println("İkinci sayıyı giriniz: ");
            sayi2 = input.nextInt();
            System.out.println("Yapmak istediğiniz işlemi giriniz (+,-,*,/): ");
        islem = input.next();
    sonuc = calculator(sayi, sayi2, islem.charAt(0));
                if (sonuc == 0) {
                    System.out.println("Lütfen geçerli bir işlem giriniz.");
                    } else {
                    System.out.println("İşleminizin sonucu :"+sonuc);
                    }
            input.close();
    }
}

