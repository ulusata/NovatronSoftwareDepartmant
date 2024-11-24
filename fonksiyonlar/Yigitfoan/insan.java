import java.util.Scanner;

public class insan {
    public String Cinsiyet;
    public int Yas;
    public int Boy;

    public void Kayit() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz:");
        Cinsiyet = input.next();

        System.out.println("Yaşınızı giriniz:");
        Yas = input.nextInt();

        System.out.println("Boyunuzu giriniz:");
        Boy = input.nextInt();
    }
}