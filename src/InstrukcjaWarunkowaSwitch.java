public class InstrukcjaWarunkowaSwitch {
    public static void main(String[] args) {

        System.out.println("------- Zad1. obliczenia");
        int a = 4;
        int b = 5;
        int result = 0;

        char option = '+';

        System.out.println("-- SWITCH");
        switch(option){
            case '+': result = a+b; break;
            case '-': result = a-b; break;
            case '*': result = a*b; break;
            case '/': result = a/b; break;
        }

        System.out.println(a+""+option+""+b+"="+result);

        System.out.println("-- IF");

        if(option == '+'){
            result = a+b;
        } else if(option == '-'){
            result = a-b;
        } else if(option == '*'){
            result = a*b;
        } else if(option == '/'){
            result = a/b;
        }

        System.out.println(a+""+option+""+b+"="+result);

        // zadanie 2
        System.out.println("------- Zad2. skojarzenia");
        char kolor = 'v';
        switch (kolor){
            case 'c':
                System.out.println("Pomidor.");
                break;
            case 'z':
                System.out.println("Trawa");
                break;
            case 'n':
                System.out.println("Morze");
                break;
            default:
                System.out.println("Brak skojarzeń");
        }

        // zadanie. dla podanych ocen wyświetl je słownie
        System.out.println("------------- Zadnie. Oceny.");
        int ocena = 3;
        switch (ocena){
            case 1:
                System.out.println("niedostateczna");
                break;
            case 2:
                System.out.println("dopuszczający");
                break;
            case 3:
                System.out.println("dostateczny");
                break;
            case 4:
                System.out.println("dobry");
                break;
            case 5:
                System.out.println("bardzo dobry");
                break;
            case 6:
                System.out.println("celujący");
                break;
        }
    }
}
