import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String isim;
        int km, yas, ciftyonInt;
        boolean ciftyon = false;

        System.out.println("İsminizi giriniz: ");
        isim = input.next();

        System.out.println("Uçağınızın km cinsinden gideceği yolu giriniz: ");
        km = input.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Tek Yön istiyorsanız 1, Çift Yön istiyorsanız 2 yazınız: ");
        ciftyonInt = input.nextInt();
        input.close();

        switch (ciftyonInt) {
            case 1 ->{
                ciftyon = false;
            }
            case 2 ->{
                ciftyon = true;
            }
            default -> {System.out.println("Lütfen geçerli değerler giriniz.");
            System.exit(0);}
        }

        UcakBileti bilet = new UcakBileti(km, yas, ciftyon);
        
        System.out.printf("Merhaba, %s. Uçak biletinizin fiyatı: %.2f", isim, bilet.fiyat);
    }
}
