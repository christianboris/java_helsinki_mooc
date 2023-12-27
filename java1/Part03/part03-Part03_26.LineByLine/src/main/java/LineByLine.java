
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
        
            if (! (input.equals(""))) {
                String [] splitted = input.split(" ");
                for (String item : splitted) {
                    System.out.println(item);
                }
            } else {
                break;
            }
        
        }



    }
}
