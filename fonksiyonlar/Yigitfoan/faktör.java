import java.util.Scanner;

public class faktör {
   
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyelini Hsaplamak istediğiniz Sayiyi Giriniz: ");
        int sayi = input.nextInt();
        input.close();

        System.out.println("Faktöriyeli"+sayi);
    }
    static int faktoriyel(int sayi){
    
        int faktör =1;
        for(int i = 1; sayi>=i;i++){
            faktör=faktör*i;
        }

        return faktör;
    }
    
}