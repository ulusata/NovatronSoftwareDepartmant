public class OOP {
    static void buyFruit(Person person, Fruit fruit, int purchase_amount) {
        double purchase_price = purchase_amount*fruit.price;
        if (fruit.isExpired == false) {
            if (purchase_amount <= fruit.amount && purchase_price <= person.balance) {
                System.out.println(person.name+" buys "+purchase_amount+" "+fruit.name+"s for "+purchase_price);
                person.balance -= purchase_price;
                System.out.println(person.name+"'s new balance is "+person.balance);
            }
            else {
                System.out.println("Insufficient funds or stockpile");
            }
        }
        else {
            System.out.println("This "+fruit.name+" is expired!");
        }
    }
    public static void main(String[] args) throws Exception {
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit();
        Fruit fruit3 = new Fruit();

        Person person1 = new Person();

        person1.name = "John Smith";
        person1.balance = 50;

        fruit1.name = "apple";
        fruit1.price = 2.5;
        fruit1.amount = 100;
        // fruit1.isExpired = true;

        fruit2.name = "banana";
        fruit2.price = 3.5;
        fruit2.amount = 50;

        fruit3.name = "orange";
        fruit3.price = 4;
        fruit3.amount = 200;
        // fruit3.isExpired = true;

        fruit1.describe();
        // fruit(fruit2);
        // fruit(fruit3);

        buyFruit(person1, fruit1, 50);

    }
}