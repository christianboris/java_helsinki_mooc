
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String path = scanner.nextLine();
        
        try (Scanner filescanner = new Scanner(Paths.get(path))) {
            while (filescanner.hasNextLine()) {
                String row = filescanner.nextLine();
                System.out.println(row);
            }
            
        } catch (Exception e) {
            System.out.println("Nee!");
        }

    }
}
