package Chapter10;

public class Apple extends Fruit {

    public Apple(){
        setCalories(75);
    }

    public void removeSeeds(){
        System.out.println("Apple seeds removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }
}