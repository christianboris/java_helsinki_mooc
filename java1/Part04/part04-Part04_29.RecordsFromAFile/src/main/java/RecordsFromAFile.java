
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String path = scanner.nextLine();
        
        try (Scanner filescanner = new Scanner(Paths.get(path))) {
            while(filescanner.hasNextLine()) {
                String line = filescanner.nextLine();
                
                if (line.isEmpty()){
                    continue;
                }
                
                System.out.println(line.split(",")[0] + ", age: " + line.split(",")[1] + " years");
                
               
            }
        } catch (Exception e) {
                System.out.println("Error");
                }

    }
}
