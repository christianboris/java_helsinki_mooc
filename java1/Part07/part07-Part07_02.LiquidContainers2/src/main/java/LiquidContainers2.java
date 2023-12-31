
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container one = new Container();
        Container two = new Container();
        
        while (true) {
            
            System.out.println("First: " + one);
            System.out.println("Second: " + two);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String command = input.split(" ")[0];
            int value = Integer.valueOf(input.split(" ")[1]);
            if (command.equals("add")) {
                one.add(value);
            } else if (command.equals("move")) {
                if (value > one.contains()) {
                    value = one.contains();
                }
                one.remove(value);
                two.add(value);
            } else if (command.equals("remove")) {
                two.remove(value);
            }

            
        }

    }

}
