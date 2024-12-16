import java.util.Scanner;

public class HarunEsadErcanUcakBileti {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz: ");
        int Kullanici_yas = input.nextInt();
        System.out.println("KM Giriniz: ");
        int Kullanici_km = input.nextInt();
        System.out.println("Bilet Türü Giriniz: ");
        String Kullanici_BiletTuru= input.next();

        UcakBileti Bilet = new UcakBileti(Kullanici_km, Kullanici_yas, Kullanici_BiletTuru);
        System.out.println(Bilet.Fiyat());
    }
}
