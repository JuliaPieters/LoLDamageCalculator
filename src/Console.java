import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    public void writeLine(String line) {
        System.out.println(line);
    }

    public String readLine() {
        try {
            return (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException var2) {
            return "Gibberish input detected";
        }
    }

    public void clearConsole() {
        for (int i = 0; i < 25; i++) {
            System.out.println(" ");
        }
    }
}