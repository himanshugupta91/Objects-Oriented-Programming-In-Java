class Q{
    public void print(){
        System.out.println("class Q methode");
    }
}

class W extends Q{
    public void printW(){
        System.out.println("class W methode");
    }
}

class E extends Q{
    public void printE(){
        System.out.println("class E methode");
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        W obj = new W();
        E obj2 = new E();
        obj.print();
        obj.print();

    }
}
