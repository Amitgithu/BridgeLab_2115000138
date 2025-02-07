interface Worker {
    void performDuties(); 
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Cooking the food.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Serving the food.");
    }
}

public class RestaurantManagement{
    public static void main(String []args){
        Chef chef = new Chef("Mohit", 101);
        chef.displayDetails();
        chef.performDuties();

        Waiter waiter = new Waiter("Vishal", 105);
        waiter.displayDetails();
        waiter.performDuties();
    }
}