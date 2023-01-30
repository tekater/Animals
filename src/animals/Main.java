package animals;

public class Main {
    public static void main(String[] args) {
        // Методы перезаписи
        Animal animal = new Animal();
        //System.out.println("Animal: " + "\n" + animal.say() + "\n");
        Cat cat = new Cat();
        System.out.println("Cat: " + "\n" + cat.say() + "\n");
        Dog dog = new Dog();
        System.out.println("Dog: " + "\n" + dog.say() + "\n");
        Duck duck = new Duck();
        System.out.println("Duck: " + "\n" + duck.say() + "\n");
    }
}