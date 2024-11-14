import java.util.Scanner;

public class Odev13HarunEsadErcan {
    public int Faktoriyel(int sayi){
        int faktor =1;
        for(int i = 1; sayi>=i;i++){
            faktor=faktor*i;
        }

        return faktor;
    }
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(Faktoriyel(sayi));
    }
}
