
public class Main {
    String name;
    int roll_no;
    public void printData(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.roll_no = 14;
        main .name = "Himanshu";
        System.out.println(main.name);
        System.out.println(main.roll_no);
        main.printData();
        main.name = "Manish";
        main.roll_no = 15;
        main.printData();
        }
    }