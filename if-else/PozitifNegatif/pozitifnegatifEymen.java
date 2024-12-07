import java.util.Scanner;
public class pozitifnegatifEymen {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a;
        System.out.println("bir sayı giriniz");
        a = input.nextInt();
        if(a>=0){
            System.out.println("girdiğiniz sayı pozitif");

        }
        else{
            System.out.println("girdiğiniz sayı negatif");
        }

        
    }
    
}
