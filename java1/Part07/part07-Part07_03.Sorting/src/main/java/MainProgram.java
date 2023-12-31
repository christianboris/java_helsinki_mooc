
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        if (array.length == 0) {
            return -1;
        }
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
    if (array.length == 0) {
            return -1;
        }
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    if (table.length == 0) {
            return -1;
        }
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    
    public static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        array[index1] = array[index2];
        array[index2] = value1;
    }
    
    public static void sort(int[] array) {
        
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            if (smallest > i) {
                swap(array, i, smallest);
                System.out.println(array);
            }
        }

    }
    
    
}
