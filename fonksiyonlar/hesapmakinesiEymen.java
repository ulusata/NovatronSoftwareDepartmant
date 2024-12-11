import java.util.Scanner;
public class hesapmakinesiEymen {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayı giriniz");
        int sayı1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayı2 = input.nextInt();
        System.out.println("Bir işlem seçiniz");
        String işlem = input.next();
         
        if(işlem.equals("+")){
            System.out.println("sonuc:"+(sayı1+sayı2));
        }
        else if(işlem.equals("-")){
            System.out.println("sonuc:"+(sayı1-sayı2));
        }
        else if(işlem.equals("*")){
            System.out.println("sonuc:"+(sayı1*sayı2));
        }
            else if (işlem.equals("/")){
                System.out.println("sonuc"+(sayı1/sayı2));
             }
        else{
            System.out.println("doğru operatr gir");
        }
    }
    
}
