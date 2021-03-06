import java.io.*;
import java.nio.charset.StandardCharsets;

public class Zadanie1 {
    public static void main(String[] args) {

        File file = new File("lab-01/src/file.txt");
        int length = (int) file.length();

        try (
                FileInputStream stream = new FileInputStream(file);
                InputStreamReader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
        ) {
            char[] data = new char[length];
            int readBytes = reader.read(data, 0, length);

            if (readBytes !=  length) {
                throw new IOException(("File reading error (expected" + length + " bytes)."));
            }
            String text = new String(data);
            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
