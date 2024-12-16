class UcakBileti {
    private int km;
    private int yas;
    private String BiletTipi;

    public UcakBileti(int km, int yas, String BiletTipi){
        this.BiletTipi=BiletTipi;
        this.km=km;
        this.yas=yas;
    }
    public float Fiyat(){
        float toplam = 0;
        toplam = km/10;
        if (yas<12){
            toplam=toplam - (toplam/2);
        }
        else if(yas<=24){
            toplam = toplam - (toplam/10); 
        }
        else if (yas>=65){
            toplam = toplam - (toplam/10*3);
        }
        if (BiletTipi.equals("donus")){
            toplam = toplam - (toplam/10*2);
        }
        return toplam;
    }
}
