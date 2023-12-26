
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        //int input = Integer.valueOf(scanner.nextLine());
        while(Integer.valueOf(scanner.nextLine()) != 4) {
            System.out.println("Give a number:");
        }
        

    }
}
