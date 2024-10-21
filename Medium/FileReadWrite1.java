import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt");
             FileReader reader = new FileReader("input.txt")) {

            writer.write("This is some data being written to the file.");
            writer.flush();

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
