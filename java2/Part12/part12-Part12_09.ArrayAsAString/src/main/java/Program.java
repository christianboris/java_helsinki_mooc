
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                output.append(array[i][j]);
            }
            output.append("\n");
        }
        return output.toString();
    }

}
