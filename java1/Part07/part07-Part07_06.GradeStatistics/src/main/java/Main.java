
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int total = 0;
        int total_passing = 0;
        int counter_passing = 0;
        
        int[] distribution = {0, 0, 0, 0, 0, 0};
        
        while (true) {
            System.out.println("Enter points totals, -1 stops:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input < 0 || input > 100) {
                continue;
            }
            
            total += input;
            counter += 1;
            
            if (input >= 50) {
                total_passing += input;
                counter_passing += 1;
            }
            
            if (input < 50) {
                distribution[0] += 1;
            } else if (input < 60) {
                distribution[1] += 1;
            } else if (input < 70) {
                distribution[2] += 1;
            } else if (input < 80) {
                distribution[3] += 1;
            } else if (input < 90) {
                distribution[4] += 1;
            } else {
                distribution[5] += 1;
            }
            
            
            
            
            
            
        }
        
        if (counter == 0){
            System.out.println("Point average (all): -");
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: -");

        } else {
            System.out.println("Point average (all): " + (double)(total / counter));
            
            if (total_passing == 0) {
                System.out.println("Point average (passing): -");
                System.out.println("Pass percentage: -");
            } else {
                System.out.println("Point average (passing): "+ (double)(total_passing / counter_passing));
                System.out.println("Pass percentage: " + (((double)counter_passing / counter)*100));
                
            }
        }
        System.out.print("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println("");
            System.out.print(i + ": ");
            print(distribution[i]);
        }
        
        
        
    }
    
    public static void print(int counter){
        for (int i = 1; i <= counter; i++) {
            System.out.print("*");
        }
        
        
    }
}
