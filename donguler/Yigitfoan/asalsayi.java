import java.util.Scanner;



public class asalsayi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Asal sayi olup olmadigini test etmek istediginiz sayiyi giriniz:");
    int sayi= scanner.nextInt();
    int sayac= 0;
    int bolen=2;

    if (sayi <= 1) {  
        System.out.println("Girilen sayi asal değil");
        return;}

        while (bolen < sayi){
     
    if(sayi % bolen ==0){
        sayac++;
        break;
    }
    bolen++;
    if ( bolen == sayi){
        break;
    }
}


    
    if (sayac==0){
        System.out.println("Girilen sayi asaldir");
    }
    else{
        System.out.println("Girilen sayi asal değildir");

    }
}
}







