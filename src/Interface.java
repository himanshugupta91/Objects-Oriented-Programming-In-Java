interface Car{
    public void start();
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("ElectricCar starts");
    }
}

class DieselCar implements Car{
    public void start(){
        System.out.println("DieselCar starts");
    }
}


public class Interface {
    public static void main(String[] args) {
    Car tesla = new ElectricCar();
    Car XUV700 = new DieselCar();
    tesla.start();
    XUV700.start();
    }
}