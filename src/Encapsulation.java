class Student4{
   private int roll_no;
  private String name;
   private int age;


   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }

   public int getRoll_no(){
       return roll_no;
   }

   public void setRoll_no(int roll_no){
       this.roll_no = roll_no;
   }
   public void setName(String name){
       this.name = name;
   }
   public void setAge(int age){
       this.age = age;
   }


}


public class Encapsulation {
    public static void main(String[] args) {
        Student4 obj = new Student4();
        obj.setName("Himanshu");
        obj.setAge(23);
        obj.setRoll_no(12);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRoll_no());


    }
}
