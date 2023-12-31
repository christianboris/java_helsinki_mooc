
import java.util.Scanner;

public class LiquidContainers {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int one = 0;
        int two = 0;
        int max = 100;


        while (true) {
            System.out.println("First: " + one + "/" + max);
            System.out.println("Second: " + two + "/" + max);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String command = input.split(" ")[0];
            int value = Integer.valueOf(input.split(" ")[1]);
            if (command.equals("add")) {
                if (value < 0) {
                    continue;
                }
                one += value;
                if (one > max) {
                    one = max;
                }
            } else if (command.equals("move")) {
                if (value > one) {
                    value = one;
                }
                one -= value;
                two += value;
                if (two > max) {
                    two = max;
                }
                
                
            } else if (command.equals("remove")) {
                two -= value;
                if (two < 0){
                    two = 0;
                }
                
            }

            
        }

    }

}
