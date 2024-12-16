import java.util.Scanner;
public class UçakBiletiEymen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int km,yas,Bilettipi;
         double normal,yasindirimi,bilettipindirimi;
         
         System.out.println("Yasınızı gırınız");
          yas = input.nextInt();
          System.out.println("Gitmek istediğiniz km yi Giriniz");
          km = input.nextInt();
          System.out.println("\nBilet tipini seçiniz(1=tek gidis,2=gidis ve dönüs):");
          Bilettipi = input.nextInt();
          normal = km*0.10;
          if(yas<12){
            yasindirimi = normal*0.5;
          }
          else if(yas>12&&yas<24){
            yasindirimi = normal*0.10;
          }
       else if(yas>60){
        yasindirimi=normal*0.30;
       }
       if(Bilettipi==2){
        bilettipindirimi= normal*0.20;
        normal=(normal-bilettipindirimi)*2;
       }
        System.out.println("toplam sonuc:"+normal);


    }
    
}
    