class A{
    void method1(){
        System.out.println("A");
    }
}

class B extends A{
    void method2(){
        System.out.println("B");
    }
}

class C extends B{
    void method3(){
        System.out.println("C");
    }

}


public class multilevelinheritence {
    public static void main(String[] args) {
        C c1 = new C();
        c1.method3();
        c1.method2();
        c1.method1();
    }
}
