package jumpStatement;

class TestReturn {

    static int m1() {
        try {
            System.out.println("Try block");
            return 10;
        }
        finally {
            System.out.println("Finally block");
        }
    }


}
public class ReturnStatement {
    public static void main(String[] args) {
        System.out.println(TestReturn.m1());

    }
}
