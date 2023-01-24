import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("JavaClassMod1-main\\Module 2 - Object Oriented Programming\\16. Higher Order Functions\\Workbooks\\Workbook 13.7\\starter\\emails.txt");
        Files.lines(path).filter(line -> !line.startsWith("Spam:")).forEach(line -> System.out.println(line));
    }
}
