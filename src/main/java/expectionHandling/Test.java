package expectionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.RuntimeException;

public class Test {
    public static void main(String[] args) {
        System.out.println("File not found expection");
        try {
            FileInputStream file = new FileInputStream("D:abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
    }

}
