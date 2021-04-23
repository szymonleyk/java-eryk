public class SudokuTrudniejsze {
    public static void main(String[] args) {
        int[][] sudoku = {{2,0,0},{0,1,2},{1,2,0}};

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


        // przechodzę po wierszach (poziomo)
        i = 0;
        while(i < sudoku.length) {
            int j = 0;

            int sum = 0;
            int emptyColIndex = 0;
            int countFilledCol = 0;
            while (j < sudoku[i].length) {
                sum += sudoku[i][j];
                if(sudoku[i][j] == 0){
                    emptyColIndex = j;
                } else {
                    countFilledCol++;
                }
                j++;
            }
            if(countFilledCol == 2){
                sudoku[i][emptyColIndex] = 6 - sum;
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

//        // przechodzę po kolumnach (pionowo)
        i = 0;
        while(i < sudoku.length) {
            int j = 0;

            int sum = 0;
            int emptyRowIndex = 0;
            int countFilledRow = 0;
            while (j < sudoku[i].length) {
                sum += sudoku[j][i];
                if(sudoku[j][i] == 0){
                    emptyRowIndex = j;
                } else {
                    countFilledRow++;
                }
                j++;
            }
            if(countFilledRow == 2){
                sudoku[emptyRowIndex][i] = 6 - sum;
            }
            i++;
        }


        System.out.println("---------------");
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
