public class TabliczkaMnozenia {
    public static void main(String[] args) {
        int tab[][] = new int[3][3];

        // ustawienie wartości
        tab[0][0] = 1;
        tab[0][1] = 2;
        tab[0][2] = 3;

        tab[1][0] = 2;
        tab[1][1] = 4;
        tab[1][2] = 6;

        tab[2][0] = 3;
        tab[2][1] = 6;
        tab[2][2] = 9;

        // wyświetlenie
        System.out.println(tab[0][0] + " " + tab[0][1] + " " + tab[0][2]);
        System.out.println(tab[1][0] + " " + tab[1][1] + " " + tab[1][2]);
        System.out.println(tab[2][0] + " " + tab[2][1] + " " + tab[2][2]);


        // tabliczka mnożenia z while
        int n = 10;
        int[][] table = new int[n][n];

//        System.out.println(table[0][0]);
//        System.out.println(table[0][1]);
//        System.out.println(table[0][2]);
//        System.out.println(table[0][3]);
//        System.out.println(table[0][4]);

        // wyswietlenie
        int z = 0;
        while (z < table.length) {
            int x = 0;
            while (x < table[z].length) {
                System.out.print(table[z][x]+"\t");
                x++;
            }
            System.out.println();
            z++;
        }
        System.out.println();
        // ustawienie wartości pierwszego wiersza i kolumny
        int b = 0;
        while(b < table.length) {
            table[0][b] = b+1;
            table[b][0] = b+1;
            b++;
        }

        // mnożenie
//        table[1][1] = table[1][0] * table[0][1];
//        table[1][2] = table[1][0] * table[0][2];
//        table[1][3] = table[1][0] * table[0][3];


        int x = 1;
        while(x < table.length) {
            int f = 1;
            while (f < table.length) {
                table[x][f] = table[x][0] * table[0][f];
                f++;
            }
            x++;
        }

        // wyswietlenie
        z = 0;
        while (z < table.length) {
            x = 0;
            while (x < table[z].length) {
                System.out.print(table[z][x]+"\t");
                x++;
            }
            System.out.println();
            z++;
        }
    }
}
