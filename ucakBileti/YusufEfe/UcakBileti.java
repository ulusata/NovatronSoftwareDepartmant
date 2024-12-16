public class UcakBileti {
    double fiyat = 0;
    
    UcakBileti(double km, int yas, boolean ciftyon){
        if (km <= 0 || yas <= 0){
            System.out.println("Lütfen geçerli değerler giriniz.");
            System.exit(0);
        }
        this.fiyat = km * 1/10;

        if(yas > 65){
            this.fiyat *= 0.7;
        }else if(yas >= 12 && yas <= 24){
            this.fiyat *= 0.9;
        }else if (yas < 12){
            this.fiyat *= 0.5;
        }

        if(ciftyon){
            this.fiyat *= 0.8;
        }
    }
}
