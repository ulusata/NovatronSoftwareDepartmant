import java.util.Scanner;
public class AhmetPolat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //bilgilerin alındığı kısım
        System.out.println("Ahmet Hava Yollarına hoşgeldiniz.");
        bilet bilet1 = new bilet();
        System.out.print("Bilet tipi gidiş-dönüş mü?(true/false)");
        bilet1.tip  = input.nextBoolean();
        System.out.print("Lütfen yaşınızı giriniz: ");
        bilet1.yas = input.nextInt();
        System.out.print("Lütfen kilometre türünden uzaklığı giriniz: ");
        bilet1.km = input.nextInt();

        bilet1.ucret = bilet1.km /10;

        //Kullanıcının yaşına göre indirimin yapıldığı yer
        if(bilet1.yas < 12){
            bilet1.ucret = bilet1.ucret / 2;
        }
        else if(bilet1.yas < 24){
            bilet1.ucret = bilet1.ucret * 9 / 10;
        }
        else if(bilet1.ucret > 65){
            bilet1.ucret = bilet1.ucret * 7 / 10;
        }

        //Bilet türüne göre indirimin yapıldığı yer
        if(bilet1.tip == true){
            bilet1.ucret = bilet1.ucret * 4 / 5;
        }

        System.out.println("Ücret: " + bilet1.ucret);
    }
}
class bilet {
    int km;
    int yas;
    boolean tip;
    double ucret;
}