package Chapter9;

public class TasteTester {
    public static void main(String[] args){
        Cake cake = new Cake("Tiramisu");
        cake.setPrice(20.0);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: $" + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(35.0);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: $" + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Strawberry shortcake");
        weddingCake.setPrice(100.0);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: $" + weddingCake.getPrice());

    }

}
