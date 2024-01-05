
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random randgen = new Random();
        
        int drawn = 0;
        
        while (drawn < 7){
            int draw = randgen.nextInt(40) + 1;
            if (!this.containsNumber(draw)) {
                this.numbers.add(draw);
                drawn ++;
            }
        }
        
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

