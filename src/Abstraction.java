abstract class Car5{
   abstract public void fuelType();

   public void color(){
       System.out.println("Black color");
   }
}

class TATA extends Car5{
    public void fuelType(){
        System.out.println("Diesel");
    }
}

public class Abstraction {
    public static void main(String[] args) {
    TATA obj = new TATA();
    obj.fuelType();
    obj.color();
    }
}
