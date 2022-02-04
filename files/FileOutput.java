package files;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args) {

        try{
            PrintWriter pw = new PrintWriter("output_greet.txt");

            pw.println("Hello there!");
            pw.println("My name is Abhijith");

            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Couldn't write to the file!");
        }
    }
}