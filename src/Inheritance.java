class vehicle{
    double price;
    double mileage;
    String color;
    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}

class car extends vehicle{
    String fType;
    boolean sunRoof;
    String Brand;

}


public class Inheritance {
    public static void main(String[] args) {
        car car1=new car();
        car1.Brand = "tata";
        car1.color = "blue";
        car1.mileage=1200;
        car1.price =50000000;
        car1.sunRoof=true;
        car1.fType="Diesel";

        car1.display();
        System.out.println(car1.sunRoof);

    }
}
