package expectionHandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExpection {
    public static void main(String[] args) {
        try{
            FileInputStream fl = new FileInputStream("d:files");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
