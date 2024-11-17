import java.util.Scanner;

public static void main(String[] args) {

    Scanner utku = new Scanner(System.in);
    System.out.println("bir sayı giriniz:");
    int sayi = utku.nextInt();

    int result = faktoriyelhesap(sayi);


    System.out.println(result);

}

static int faktoriyelhesap(int sayi) {
    int sonuc = 1;
    for (int no = 1; no <= sayi; no++) {
        sonuc *= no;

    }
    return sonuc;
}


