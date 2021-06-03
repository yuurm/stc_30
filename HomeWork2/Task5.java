public class Task5 {

        public static void main(String[] args) {
            int row = 3, column = 3;
            int[][] a = new int[row][column];
            int minRow = 0, maxRow = row - 1, minCol = 0, maxCol = column - 1;
            int count = 1;
            int max = row * column;


            while (count < max+1) {
                for (int i = minCol; i <= maxCol; i++) {
                    a [minRow][i] = count;
                    count++;
                }
                minRow = minRow + 1;
                for (int i = minRow; i <= maxRow; i++) {
                    a [i][maxCol] = count;
                    count++;
                }
                maxCol = maxCol - 1;
                for (int i = maxCol; i >= minCol; i--) {
                    a [maxRow][i] = count;
                    count++;
                }
                maxRow = maxRow - 1;
                for (int i = maxRow; i >= minRow; i--) {
                    a [i][minCol] = count;
                    count++;
                }
                minCol = minCol + 1;
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(a [i][j] + "  ");
                }
                System.out.println("");
            }
        }
    }




