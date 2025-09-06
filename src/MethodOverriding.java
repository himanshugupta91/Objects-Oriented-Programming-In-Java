class Bank{
    public void RateofInterest(){
        System.out.println("Rate of Interest is 5%");
    }
}

class SBI extends Bank{
    @Override
    public void RateofInterest(){
        System.out.println("Rate of Interest is 10%");
    }
}

class  ICICI extends Bank{
    @Override
    public void RateofInterest(){
        System.out.println("Rate of Interest is 20%");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.RateofInterest();
        ICICI c = new ICICI();
        c.RateofInterest();
        Bank b = new Bank();
        b.RateofInterest();

    }
}
