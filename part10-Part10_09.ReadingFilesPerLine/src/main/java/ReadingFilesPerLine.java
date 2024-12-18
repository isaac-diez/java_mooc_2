import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        // Read file and print lines
        read("names.txt").stream()
                .forEach(row -> System.out.println(row));
    }

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return rows;
    }
}



