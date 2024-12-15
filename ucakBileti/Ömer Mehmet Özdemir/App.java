import java.util.Scanner;

class UcakBileti {
    public double km;
    public int age;
    public byte type;
    public double fiyat;

    public UcakBileti(double km, int age, byte type) {
        if (age < 0) {
            System.out.println("Lütfen yaşınızı doğru giriniz.");
            System.exit(0);
        }
        if (type != 1 && type != 2) {
            System.out.println("Lütfen bilet türünü doğru giriniz.");
            System.exit(0);
        }
        this.age = age;
        this.type = type;
        this.km = km;

        if (type == 2) {
            this.km *= 2;
        }
    }

    // bu method constructorun içine entegre edilebilir, sadece düzenli olsun diye farklı bir metod kullandım.
    public void FiyatHesapla() { 
        this.fiyat = this.km/10;

        if (age <= 12) {
            this.fiyat /= 2;
        }
        else if (age <= 24) {
            this.fiyat = this.fiyat*9/10;
        }
        else if (age >= 65) {
            this.fiyat = this.fiyat*7/10;
        }

        if (type == 2) {
            this.fiyat = this.fiyat*8/10;
        }
    }

    public void BilgiYaz() {
        System.out.println("Kilometre: " + this.km);
        System.out.println("Yaş: " + this.age);
        System.out.print("Bilet türü: ");
        if (type == 1) {
            System.out.println("Tek Yön");
        }
        else if (type == 2) {
            System.out.println("Gidiş Dönüş");
        }
        System.out.println("Fiyat: " + this.fiyat + "$");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Yolculuğunu kaç kilometredir?");
        double km = sc.nextDouble();
        System.out.println("Kaç yaşındasınız?");
        int age = sc.nextInt();
        System.out.println("Bilet türünüz nedir?");
        System.out.println("Tek yön için '1' giriniz");
        System.out.println("Gidiş dönüş için '2' giriniz");
        byte type = sc.nextByte();
        sc.close();

        UcakBileti bilet = new UcakBileti(km, age, type);
        bilet.FiyatHesapla();
        bilet.BilgiYaz();
    }
}