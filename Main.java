public class Main {
    public static void main(String[] args) {

        // Create an object from the Dog class
        Dog myDog = new Dog("Max", "pitbull", 2, true);

        // Call the methods from the Dog class
        myDog.eat();
        myDog.bark();
        myDog.sleep();
        System.out.println();

        // Print attributes of the dog object
        System.out.println("My dog name is " + myDog.getName());
        System.out.println("My dog's breed is " + myDog.getBreed());
        System.out.println("My dog's age is " + myDog.getAge());
        System.out.println("My dog is hungry: " + myDog.getIsHungry());
    }
}