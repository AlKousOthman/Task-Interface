import Interfaces.Animal;

class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating ");
    }


    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public void makeSound(){
        System.out.println("Dog is barking");
    }
}
