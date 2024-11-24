public class app {
    public static void main(String[] args) {
        insan insan1 = new insan();

        insan1.Kayit();

        System.out.println("Cinsiyetiniz: " + insan1.Cinsiyet);
        System.out.println("Boyunuz: " + insan1.Boy);
        System.out.println("Yaşiniz: " + insan1.Yas);
    }
}