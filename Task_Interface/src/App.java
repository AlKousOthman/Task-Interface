import Interfaces.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        dog1.eat();
        dog1.sleep();
        dog1.makeSound();

        cat1.eat();
        cat1.sleep();
        cat1.makeSound();
    }
}
