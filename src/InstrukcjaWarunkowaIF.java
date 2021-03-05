public class InstrukcjaWarunkowaIF {
    public static void main(String[] args) {

        /*
        if(warunek){
            instrukcje....
        }
        */


        int wiek = 19;
        if(wiek >= 18){
            System.out.println("Pełnoletni.");
        }


        int a = 12;
        int b = 5888;

        if(a > b){
            System.out.println("Większa jest: "+a);
        } else {
            System.out.println("Większa jest: "+b);
        }

        wiek = 8;
        a = 2314;
        if(wiek < 10 && a > 100){
            System.out.println("Tak.");
        }


        /*
        if(warunek){
            instrukcja1 // jeśli prawda
        } else {
            instrukcja2 // w przeciwnym wypadku
        }
         */

        double chleb = 2.5;
        double maslo = 3.1;
        double bulka = 1.2;

        double kwota = 5;

        if(kwota >= chleb + maslo){
            System.out.println("Kupiłem chleb i masło.");
        } else if(kwota >= 2*bulka + maslo){
            System.out.println("Kupiłem 2 bułki i masło.");
        } else if(kwota >= bulka){
            System.out.println("Kupiłem bułkę.");
        } else {
            System.out.println("Nic nie kupiłem.");
        }

    }
}
