class Himanshu{
  String name;
    protected int age;
    private int roll_no;

Himanshu(String name,int age,int roll_no){
    this.name=name;
    this.age=age;
    this.roll_no=roll_no;
}


    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}


public class AccessModifiers {
    public static void main(String[] args) {
        Himanshu himanshu1 = new Himanshu("Rahul",20,23);
        System.out.println("Himanshu1's name is "+himanshu1.name);
        himanshu1.print();


    }
}
