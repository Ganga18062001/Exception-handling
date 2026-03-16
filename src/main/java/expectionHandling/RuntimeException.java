package expectionHandling;


class A{


     A() {
         System.out.println("1");
       try{
           System.out.println("2");
           System.out.println("3");
           System.out.println("4");
           int x = 100,y=0,z;
           z = x/y;
           System.out.println("5");
           System.out.println(z);
           System.out.println("6");
           System.out.println("7");
       } catch (Exception e) {
           System.out.println("8");
           System.out.println("9");
//           e.printStackTrace();

           System.out.println(e.getMessage());
//           System.out.println(e);
//           e.printStackTrace();
           //System.out.println(e);
           System.out.println("10");
       }

         System.out.println("11");


    }
}
public class RuntimeException {
    public static void main(String[] args) {
        A a = new A();
//        String s = null;
//        System.out.println(s.length());

    }
}
