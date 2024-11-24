public class Fruit {
    String name;
    double price;
    boolean isExpired = false;
    int amount;

    public void describe() {
        if (this.isExpired == true) {
            System.out.println("This "+this.name+" is expired!");
            return;
        }
        System.out.println("This is a "+this.name);
        System.out.println("This "+this.name+" costs "+this.price+" dollars");
    }
}
