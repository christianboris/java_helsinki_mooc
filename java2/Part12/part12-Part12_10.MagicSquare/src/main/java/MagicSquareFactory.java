
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        
        int newRow = 0;
        int newCol = size/2;
        square.placeValue(newCol , newRow, 1);
        int oldRow = newRow;
        int oldCol = newCol;

        
        for (int value = 2; value <= size * size; value++){
            newRow --;
            newCol ++;
            
            if (newRow < 0) {
                newRow = size - 1;
            }

            if (newCol >= size) {
                newCol = 0;
            }
            
            if (square.readValue(newCol , newRow) != 0){
                newRow = oldRow + 1;
                newCol = oldCol;
            }
            
            square.placeValue(newCol , newRow, value);
            oldRow = newRow;
            oldCol = newCol;
        }
        
        
        return square;
    }

}
