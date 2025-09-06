interface K {
   public void a();
}
interface J{
   public void a();
}

class L implements K,J {
    public void a() {
        System.out.println("C class run method");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        L obj = new L();
        obj.a();

    }
}
