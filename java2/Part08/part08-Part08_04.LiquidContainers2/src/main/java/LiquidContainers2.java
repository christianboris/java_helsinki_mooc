
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container one = new Container("First");
        Container two = new Container("Second");
        
        
        one.printContent();
        two.printContent();


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            }
            String command = input.split(" ")[0];
            int value = Integer.valueOf(input.split(" ")[1]);
            
            if (value < 0) {
                value = 0;
            }
            
            if (command.equals("add")) {
                one.add(value);
            } else if (command.equals("move")) {
                if(value > one.contains()) {
                    value = one.contains();
                }
                one.remove(value);
                two.add(value);
            } else if (command.equals("remove")) {
                two.remove(value);
            }
            
            one.printContent();
            two.printContent();
            

        }
    }

}
