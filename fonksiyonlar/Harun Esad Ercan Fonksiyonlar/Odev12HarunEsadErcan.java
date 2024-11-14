import java.util.Scanner;

public class Odev12HarunEsadErcan {
    public int Hesaplama(String Operator, int sayi1, int sayi2){
        int donus= 0;
        if(Operator.equals("+")){
            donus=sayi1+sayi2;
        }
        else if(Operator.equals("-")){
            donus = sayi1-sayi2;
        }
        else if(Operator.equals("/")){
            donus = sayi1/sayi2;
        }
        else if(Operator.equals("*")){
            donus = sayi1*sayi2;
        }
        else{
            System.out.println("Doğru bir operatör giriniz!!");
        }
        return donus;
    }
    public void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");
        int sayi1= input.nextInt();

        System.out.println("İkinci Sayıyı Giriniz: ");
        int sayi2= input.nextInt();

        System.out.println("+, -, /, * operatörleri arasından birisini seçip giriniz: ");
        String Operator=input.next();

        input.close();

        System.out.println(Hesaplama(Operator, sayi1, sayi2));
        System.out.println(Operator);

    }
}
