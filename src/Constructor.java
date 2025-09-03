class Students{
    int id;
    int age;
    Students(int id, int age){
        this.id = id;
        this.age=age;
        System.out.println("Hello World");
    }
}

public class Constructor {
    public static void main(String[] args) {
    Students students=new Students(1,29);
    }
}
