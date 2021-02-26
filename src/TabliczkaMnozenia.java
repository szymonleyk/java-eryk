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
        System.out.println(tab[0][0] + " " +tab[0][1] + " "+tab[0][2]);
        System.out.println(tab[1][0] + " " +tab[1][1] + " "+tab[1][2]);
        System.out.println(tab[2][0] + " " +tab[2][1] + " "+tab[2][2]);

    }
}
