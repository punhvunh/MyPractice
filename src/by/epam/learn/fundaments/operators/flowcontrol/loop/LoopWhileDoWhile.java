package by.epam.learn.fundaments.operators.flowcontrol.loop;

public class LoopWhileDoWhile {
    public static void main(String[] args) {
        int value = 42;
//        while (value < 50 ){
//            value++;
//            if(value > 44 && value < 48) {
//                continue;
//                //break;
//            }
//            System.out.println(value);
//        }
        do {
            value++;
            if (value > 44 && value < 48) {
                continue;
                //break;
            }
            System.out.println(value);
        } while (value < 40 );
    }
}
