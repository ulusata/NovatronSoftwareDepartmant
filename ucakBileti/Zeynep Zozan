import java.util.Scanner;

public class FiyatOgrenme{
    public static void main(String[] args){

        
        double toplamÜcret;
       

        Scanner input = new Scanner(System.in);

        System.out.println("Bilet tipinizi giriniz(tekYön/gidiş-dönüş):");
        String biletTürü = input.nextLine();
        System.out.println("Yasinizi giriniz:");
        int yas = input.nextInt();
        System.out.println("Yolunuzun uzunluğunu km cinsinden belirtiniz:");
        int km = input.nextInt();

        input.close();

        toplamÜcret = km / 10;

        if(yas <=12){
            toplamÜcret = toplamÜcret /2;
        } else if(yas>12 && yas<=24){
            toplamÜcret = toplamÜcret *9 / 10;
        } else if(yas>=65){
            toplamÜcret = toplamÜcret *7 /10;
        }

        if(biletTürü == "gidiş-dönüş"){
            toplamÜcret = toplamÜcret *8 /10;
        }
            System.out.println("Bilet Ücretiniz:" + toplamÜcret);



    }





}






