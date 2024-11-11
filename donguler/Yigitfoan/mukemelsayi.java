import java.util.Scanner;
public class mukemelsayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.print("Sayiyi giriniz:");
     int sayi = scanner.nextInt();
     int toplam = 0;

    for(int i=1; i<= sayi/2; i++){
     if(sayi % i ==0){
        toplam+= i;
     }
     
    }

    if(toplam==sayi){
        System.out.println("Girdiğiniz sayi mükemmeldir");

    }else{
        System.out.println("Girdiğiniz sayi mükemmel değildir");
    }

    scanner.close();


    }




    
}
