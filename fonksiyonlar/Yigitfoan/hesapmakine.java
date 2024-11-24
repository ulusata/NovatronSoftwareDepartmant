import java.util.Scanner;

public class hesapmakine {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Birinci sayiyi girin: ");
  double sayi1 = scanner.nextDouble();
  System.out.println("İkinci sayiyi girin: ");
  double sayi2 = scanner.nextDouble(); 
  System.out.println("(+, -, *, /) işlem operetörlerinden birini seçin: ");
  String islem = scanner.next();  

 if (islem.equals("+")) {
  System.out.println("Sonuç: " + (sayi1 + sayi2));
  } 
 else if (islem.equals("-")) {
System.out.println("Sonuç: " + (sayi1 - sayi2));
 } 
 else if (islem.equals("*")) {
 System.out.println("Sonuç: " + (sayi1 * sayi2));
 } 
 else if (islem.equals("/")) {
 System.out.println("Sonuç: " + (sayi1 / sayi2));
 } 
 else {
 System.out.println("Doğru bir opertör giriniz.");
 }
  scanner.close();
    }
}