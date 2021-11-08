package by.epam.learn.fundaments.operators.flowcontrol.loop;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 0, j = 10; i < 10 && j <=10; i++, j--) {
            if (i == 5 ){ //пропускает 5
                continue;
                //break в циклах for нежелателен
            }
            System.out.println(i + " " + j);
        }
    }
}
