import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CourseFileReader {
    public List<String> readFile(String filepath) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Path.of(filepath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Error reading file with Files.readAllLines: " + e.getMessage());
        }
        return lines;
    }
}