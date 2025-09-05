class parentClass{
    void display(){
        System.out.println("parent class method");
    }
}

class childClass extends parentClass{
    void show(){
        System.out.println("child class method");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        childClass childClass=new childClass();
        childClass.display();
        childClass.show();
    }
}
