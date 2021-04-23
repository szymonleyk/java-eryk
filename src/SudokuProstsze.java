public class SudokuProstsze {
    public static void main(String[] args) {
        int[][] sudoku = {{1,0,3},{0,1,2},{2,3,0}};

        // wyświetlenie tablicy
        int i = 0;
        while(i < sudoku.length) {
            int j = 0;
            while (j < sudoku[i].length) {
                System.out.print(sudoku[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }


        System.out.println("---------");


        i = 0;
        while(i < sudoku.length) {
            int j = 0;
            while (j < sudoku[i].length) {
                if (sudoku[i][j] == 0) {
                    System.out.println("Znalazłem puste pole na pozycji ["+i+"," + j + "]");

                    // sumowania komórek w wierszu
                    int sum = 0;
                    int z = 0;
                    while(z < sudoku[i].length){
                        sum+=sudoku[i][z];
                        z++;
                    }

                    sudoku[i][j] = 6 - sum;
                }
                j++;
            }
            i++;
        }


        // wyświetlenie tablicy
        i = 0;
        while(i < sudoku.length) {
            int j = 0;
            while (j < sudoku[i].length) {
                    System.out.print(sudoku[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
