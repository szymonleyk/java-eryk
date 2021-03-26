public class InstrukcjaIteracyjnaWhile {
    public static void main(String[] args) {
        // while
        /*
        while(waruenk){
            instrukcje;
        }

        wykonuje się dopóki warunek jest prawdziwy (true)

        */

//          bez pętli
//        double[] number = {32.1,24,1,5.29};
//        double sum = 0;
//        sum+=number[0];
//        sum+=number[1];
//        sum+=number[2];
//        sum+=number[3];
//        System.out.println(sum);


        // z pętlą
        double[] numbers = {32.1,24,1,5.29, 3,234,23,42,3,2,34,23,4,2,12,123,1,21,1,1,23,12,3,1,12,31,23};
        double sum = 0;
        int i = 0;
        while(i < numbers.length) {
            sum += numbers[i];             // i=0  -> number[0], i=1 -> numbers[1], i=2 -> numbers[2], i=3 => numbers[3]
            i++;
        }
        System.out.println(sum);


        char[] names = {'K','r','y','s','t','y','n','a',' ','N','o','w','a','k'};
        System.out.print(names[0]);
        System.out.print(names[1]);
        System.out.print(names[2]);
        System.out.print(names[3]);
        System.out.print(names[4]);
        System.out.print(names[5]);
        System.out.print(names[6]);
        System.out.print(names[7]);

        System.out.println();

        int index = 0;
        while(index < names.length){
            System.out.print(names[index]);
            index++;
        }



    }
}
