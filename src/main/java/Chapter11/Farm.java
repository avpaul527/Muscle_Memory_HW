package Chapter11;

public class Farm {


    public static void main(String[] args){
        Animal pig = new Pig();
        pig.makeSound();

        Duck ducky = new Duck();
        ducky.makeSound();

        Pig piggy = new Pig();
        piggy.makeSound();

        piggy.eat();
    }

}
