package _3;

public class Assignment3 {
    private static final int[][] matrix = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
    };

    private record LineStart(int row, int col) {
    }

    public static void main(String[] args) {
        try {
            LineStart lineStart = findLineStart(matrix);
            int lineLength = findLineLength(matrix, lineStart);
            System.out.println("line length: " + lineLength);
        } catch (NoLineStartFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    static LineStart findLineStart(int[][] matrix) throws NoLineStartFoundException {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1)
                    return new LineStart(row, col);
            }
        }
        throw new NoLineStartFoundException("no line start found");
    }


    static int findLineLength(int[][] matrix, LineStart lineStart) {
        int lineLength = 1;
        int[][] directionOffsets = {
                {0, 1}, // right
                {1, 1}, // lower right
                {1, 0}, // down
                {1, -1} // lower left
        };
        for (int[] offset : directionOffsets) {
            int rowOffset = offset[0];
            int colOffset = offset[1];

            int rowIndexToCheck = lineStart.row() + rowOffset;
            int colIndexToCheck = lineStart.col() + colOffset;


            while (rowIndexToCheck < matrix.length // check within row count
                    && colIndexToCheck >= 0 // check within column boundary (left)
                    && colIndexToCheck < matrix[0].length // check within column boundary (right)
                    && matrix[rowIndexToCheck][colIndexToCheck] == 1) // '1' found
            {
                lineLength++;
//                continue to search in the found direction
                rowIndexToCheck += rowOffset;
                colIndexToCheck += colOffset;
            }
        }
        return lineLength;
    }
}