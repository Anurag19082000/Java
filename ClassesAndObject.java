package Java;

class Dog {
    String breed;
    int age;

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class ClassesAndObject {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();
        myDog.breed = "Labrador";
        myDog.age = 5;
        myDog.bark();
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Age: " + myDog.age);
    }

}
