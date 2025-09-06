class Animal{
    String color = "white";
    void eat(){
        System.out.println("I am eating");
    }

    Animal(){
        System.out.println("animal is created");
    }
}

class Fish extends Animal{
    String color = "black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    void eat(){
        System.out.println("I am eating bread");
    }
    void bark(){
        System.out.println("I am barking");
    }
    void work(){
        super.eat();
        bark();
    }

    Fish(){
        super();
        System.out.println("Fish is created");
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        Fish f = new Fish();

    }
}
