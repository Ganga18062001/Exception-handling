package jumpStatement;

class A{
    A(){
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Try block : " + i);
                continue;
//                break;

            } catch (Exception exception) {
                System.out.println(exception);
            } finally {
                System.out.println("finally block");
            }
        }
            System.out.println("After loop");

    }
}
public class BreakStatement {
    public static void main(String[] args) {
//        A a = new A();
//        int[] arr = new int[10000000000];
//        System.out.println(arr);

    }
}
