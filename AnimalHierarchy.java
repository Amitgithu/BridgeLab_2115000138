abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public abstract void makeSound();

}

class Dog extends Animal{

    public Dog(String dogName, int dogAge){
        super(dogName, dogAge);
    }

    @Override
    public void makeSound(){
        System.out.println("Dog Makes Sound : Wohh Wohh...");
    }
}

class Cat extends Animal{

    public Cat(String catName, int catAge){
        super(catName, catAge);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat Makes Sound : Meww Meww...");
    }
}

class Bird extends Animal{

    public Bird(String birdName, int birdAge){
        super(birdName, birdAge);
    }

    @Override
    public void makeSound(){
        System.out.println("Birds Makes Sound : Chirp Chirp....");
    }
}

public class AnimalHierarchy{
    public static void main(String []args){
        Animal animal1 = new Bird("Peacock", 5);
        System.out.println("Animal Name : " + animal1.getName());
        System.out.println("Animal Age : " + animal1.getAge());
        animal1.makeSound();
        System.out.println("********************************");

        Animal animal2 = new Cat("Whiskers", 8);
        System.out.println("Animal Name : " + animal2.getName());
        System.out.println("Animal Age : " + animal2.getAge());
        animal2.makeSound();
        System.out.println("********************************");


        Animal animal3 = new Dog("Bull Dog", 15);
        System.out.println("Animal Name : " + animal3.getName());
        System.out.println("Animal Age : " + animal3.getAge());
        animal3.makeSound();
        System.out.println("********************************");


    }
}