import java.util.Scanner;
public class App {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   
  int a,b,c;
  System.out.println("A sayisini giriniz :");
  a = input.nextInt();
  System.out.println("B sayisini giriniz :");
  b=input.nextInt();
  System.out.println("C sayisini giriniz :");
  c=input.nextInt();
  if(c>b){ 
    if(b>a){ 
        System.out.println(c);
    }
   
}
    if(b>a){
        if(a>c){
            System.out.println(b);
        }
        
    }
    if(a>b){
        if(b>c)
        System.out.println(a);
    } 

}
    

}
