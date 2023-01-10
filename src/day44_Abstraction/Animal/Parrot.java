package day44_Abstraction.Animal;

public class Parrot extends Animal implements Flyable,Playable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public void fly() {

        System.out.println(getName()+" can fly 20km/h");
    }


    @Override
    public void play() {

    }
}
