public class Dog {
    // Attributes
    private String name;
    private String breed;
    private int age;
    private boolean isHungry;

    // Constructor
    public Dog(String name, String breed, int age, boolean isHungry) {
        // setters
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isHungry = isHungry;
    }

    // Methods
    public void bark() {
        System.out.println(name + " is barking");
    }
    public void eat() {
        if (isHungry) {
            System.out.println(name + " is eating");
            isHungry = false;
        }
        else {
            System.out.println(name + " is not hungry anymore");
        }
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    // Setters and Getters

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public boolean getIsHungry(){
        return isHungry;
    }


}

