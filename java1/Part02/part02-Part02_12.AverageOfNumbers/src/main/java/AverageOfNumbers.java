
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int total = 0;
        
        while (true) {
            System.out.println("Give a number:");
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                System.out.println("Average of the numbers: " + ((double)total / count));
                break;
            }
            
            count += 1;
            total += input;
        }

    }
}
