public class Zadania {
    public static void main(String[] args) {

        // zadanie 1
        int a = 100;
        while (a>=1) {
            System.out.println(a);
            a--;
        }

        // zadanie2
        char[] imie = {'c','z','e','s','ł','a','w','a'};
        System.out.print(imie[0]);
        System.out.print(imie[1]);
        System.out.print(imie[2]);
        System.out.print(imie[3]);
        System.out.print(imie[4]);
        System.out.print(imie[5]);
        System.out.print(imie[6]);

        System.out.println();


        int b = 0;
        while(b<imie.length) {
            System.out.print(imie[b]);
            b++;
        }
    }
}
