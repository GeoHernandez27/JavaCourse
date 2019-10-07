package chapter9;

public class TasteTester {

    public static void main(String[] args){

        Cake cake = new Cake("Chocolate");
        cake.setPrice(29.99);
        System.out.println("Cake Flavor: " + cake.getFlavor());
        System.out.println("Cake Price " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(30.99);
        System.out.println("Birthday Cake Flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday Cake Price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Almond");
        System.out.println("Wedding Cake Flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding Cake Price: " + weddingCake.getPrice());
    }
}
