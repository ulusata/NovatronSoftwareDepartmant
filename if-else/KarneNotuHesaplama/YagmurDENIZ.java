import java.util.Scanner;
public class Sayma {
    public static void main(String[] args) {
       int sinav1 , sinav2 , performans1 , performans2 ;
       double ortalama1;
        Scanner input = new Scanner(System.in);
        System.out.println("1.sinav notunuzu giriniz :");
        sinav1 =input.nextInt();
        System.out.println("2.sinav notunu giriniz :");
       sinav2 =input.nextInt();
       System.out.println("1.performans notunu giriniz :");
       performans1 =input.nextInt();
       System.out.println("2.sinav notunu giriniz :");
       performans2 =input.nextInt();
       ortalama1=(((sinav1+sinav2)+(performans1+performans2))/4);
       System.out.println(ortalama1);
       if(ortalama1>=85){
        System.out.println("Takdir");
       }
      if(ortalama1>=70){
        System.out.println("Tesekkür");
      }
      if(ortalama1>=50){
            System.out.println("Geçtiniz.");
        }
    if(ortalama1<=50){
          System.out.println("Kaldiniz.");
        }
      
    }
}
