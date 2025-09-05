class employee{
    void salary(){
        System.out.println("salary = 700000 ");
    }
}

class hr extends employee{
    void bonus(){
        System.out.println("bonus = 20000");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.salary();
        System.out.println();
        obj.bonus();
    }
}
