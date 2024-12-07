import java.util.Scanner;
public class KarnenotuEymen {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         int a,b,ort2;
         System.out.println("birinci dönem ortalamanızı giriniz");
          a = input.nextInt();
          System.out.println("ikinci dönem ortalamanızı giriniz");
          b = input.nextInt();
          ort2 = (a+b)/2;
          System.out.println("dönem sonu ortalamanız:"+ort2);
          if(ort2>=85&&ort2<=100){
            System.out.println("Takdir aldınız");
          }
          else if(ort2<85&&ort2>=70);{
            System.out.println("teşekkür aldınız");
          }
         else if(ort2<70&&ort2>=50){
            System.out.println("düz geçtiniz");
         }
         else if(ort2<50){
            System.out.println("kaldınız");
         }
    }

    
}
