import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
/**
* Illustrates how to create textfile in Java program
* @author Prof. A. Hernandez
*/
public class WritingToTextfile
{
    public static void main(String[] args)
    {
        String outputFilename = "output.csv";
        
        PrintWriter output = null;
        //open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        } catch (IOException ex)
        {
            System.exit(1);
        }
        Random rnd = new Random();
        int n = 100;
        for (int i = 0; i < n; i++)
        {
            output.println(i + "," + rnd.nextInt(10) + "," + rnd.nextInt(100) + ","
+ rnd.nextInt(1000));
        }
        //close output stream
        output.close();
    }
}
