public class InstrukcjaWarunkowaSwitch {
    public static void main(String[] args) {
        // zadanie 1
        int a = 4;
        int b = 5;
        int result = 0;

        char option = '+';

        System.out.println("-------- SWITCH");
        switch(option){
            case '+': result = a+b; break;
            case '-': result = a-b; break;
            case '*': result = a*b; break;
            case '/': result = a/b; break;
        }

        System.out.println(a+""+option+""+b+"="+result);

        System.out.println("-------- IF");

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
    }
}
