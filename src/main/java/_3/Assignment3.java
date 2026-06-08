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

    private record LineStart(int row, int col){};

    static void main() {
    }


    private static LineStart findLineStart(int[][] matrix) throws NoLineStartFoundException {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1)
                    return new LineStart(row, col);
            }
        }
        throw new NoLineStartFoundException("no line start found");
    }
}
