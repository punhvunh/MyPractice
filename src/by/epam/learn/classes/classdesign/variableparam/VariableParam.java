package by.epam.learn.classes.classdesign.variableparam;

import java.util.Arrays;

public class VariableParam {
    public void method(String str, int ... values){
        if(values.length !=0){
            System.out.println(Arrays.toString(values) + " " + str);
        } else {
            System.out.println("without " + str);
        }
    }
    public static void method(int a, int b){
        System.out.println(a + " " + b);
    }
}
