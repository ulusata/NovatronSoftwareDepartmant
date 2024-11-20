import java.util.Scanner;

public class faktör {
   
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyelini Hesaplamak istediğiniz Sayiyi Giriniz: ");
        int sayi = input.nextInt();
        input.close();

        System.out.println(Faktöriyel(sayi));
    }
    
      static int Faktöriyel(int sayi){
        int faktor =1;
        for(int i = 1; sayi>=i;i++){
            faktor=faktor*i;
        }

        return faktor;
    }


    }
    
