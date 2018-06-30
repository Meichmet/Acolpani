import java.sql.SQLOutput;

public class Animal {

    private static int numberOfAnimals;

    private String name;
    private int age;
    private int health = 100;

    public Animal(String name){
        numberOfAnimals++;
        this.name = name;
    }

    public void move(){
        this.health--;
        System.out.println(this.health);
    }
}
