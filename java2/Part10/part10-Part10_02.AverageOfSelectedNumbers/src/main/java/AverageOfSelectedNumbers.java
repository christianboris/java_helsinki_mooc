
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        // toteuta ohjelmasi tänne
        
        while(true){
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                break;
            }
            
            list.add(input);
            
        }
        
        double averagePos = list.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
        
        double averageNeg = list.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p");
        String input = scanner.nextLine();
        
        /* crazy stuff
        if (input.equals("n") || input.equals("p")) {
            System.out.println("Average of the numbers: " + list.stream().mapToDouble(s -> Double.valueOf(s)).filter((double s) -> {
                if (input.equals("n") && s <0) {
                    return true;
                } else if (input.equals("p") && s >0){
                    return true;
                }
                return false;
            })
                    .average().getAsDouble());
        }
        */

        if (input.equals("n")){
            System.out.println("Average of the negative numbers: " + averageNeg);
        } else if (input.equals("p")){
            System.out.println("Average of the positive numbers: " + averagePos);
        }


    }
}
