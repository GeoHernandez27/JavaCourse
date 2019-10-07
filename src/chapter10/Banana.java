package chapter10;

public class Banana extends Fruit {

    public Banana(){
        setCalories(120);
    }

    public void peelBanana(){
        System.out.println("Banana has been peeled!");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is ok, I guess.");
    }
}
