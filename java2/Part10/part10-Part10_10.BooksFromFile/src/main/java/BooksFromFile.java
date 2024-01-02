
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<Book>();
        try {
            Files.lines(Paths.get(file))
                    .map(item -> item.split(","))
                    .map(elements -> new Book(elements[0], Integer.valueOf(elements[1]), Integer.valueOf(elements[2]), elements[3]))
                    .forEach(book -> books.add(book));
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return books;
    }

}
