
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<DataPoint> data = new ArrayList<DataPoint>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(lines -> lines.split(","))
                    .map(lines -> new DataPoint(lines[3].trim(), Integer.valueOf(lines[4].trim()), lines[2].trim().split(" ")[0], Double.valueOf(lines[5].trim())))
                    .forEach(DataPoint -> data.add(DataPoint));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        data.stream()
                .sorted()
                .forEach(item -> System.out.println(item));

    }
}
