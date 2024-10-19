import java.io.*;

public class FileCount {
    public static void main(String[] args) {
        String filePath = "input.txt";
        int wordCount = 0, charCount = 0, lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of Words: " + wordCount);
        System.out.println("Number of Characters: " + charCount);
        System.out.println("Number of Lines: " + lineCount);
    }
}
