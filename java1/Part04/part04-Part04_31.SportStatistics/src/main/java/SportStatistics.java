
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String path = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner filescanner = new Scanner(Paths.get(path))) {
            while(filescanner.hasNextLine()){
                String line = filescanner.nextLine();
                
                if (line.isEmpty()){
                    continue;
                }
                
                String[] data = line.split(",");
                
                if (data[0].equals(team)) {
                    games += 1;
                    if (Integer.valueOf(data[2]) > Integer.valueOf(data[3])) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                        
                    
                } else if (data[1].equals(team)) {
                    games += 1;
                    if (Integer.valueOf(data[3]) > Integer.valueOf(data[2])) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                    
                }
                
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
