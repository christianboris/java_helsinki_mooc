
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longname = "";
        int sum = 0;
        int counter =0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String name = input.split(",")[0];
            int year = Integer.valueOf(input.split(",")[1]);
            sum += year;
            counter += 1;
            
            if (name.length() > longname.length()) {
                longname = name;
            }
            
        }
        
        System.out.println("Longest name: " + longname);
        System.out.println("Average of the birth years: " + ((double)sum/counter));


    }
}
