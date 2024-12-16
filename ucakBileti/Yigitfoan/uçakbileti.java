import java.util.Scanner;
public class uçakbileti {
public static void main(String[]args){
    Scanner uçak =new Scanner(System.in);
double ücret, yasindirim,bilet;
    int km,yaş,bilettipi;
System.out.println("Yolcu yaşini giriniz:");
yaş =uçak.nextInt();
System.out.println("Kaç Km gideceğinizi giriniz:");
km =uçak.nextInt();
System.out.println("Tek gidişi için-1 , Gidiş dönüş icin-2 giriniz:");
bilettipi =uçak.nextInt();

if(km>0 && yaş>0 && (bilettipi==1 || bilettipi==2)){
    ücret= (km*0.1);
    if(yaş<12){
        yasindirim= ücret*(1/2);
        ücret= ücret-yasindirim;
        
    }
    else if(yaş>12 && yaş<24){
    yasindirim= ücret*(1/10);
    ücret= ücret-yasindirim;
    
    }
    else if(yaş>65){
    yasindirim= ücret*(3/10);
    ücret= ücret-yasindirim;
    
    }
    else{
       yasindirim= 0;
       
    }
if(bilettipi==2){
   bilet= ücret*(2/10);
   ücret= (ücret-bilet)*2;
   
}
System.out.println("Tutar:"+ücret);
}


else{
    System.out.println("Yanlış bir değer giriniz");
}






}







}