package by.epam.learn.exceptions.checkedand;

public class LearnMainExceptions {
    public static void main(String[] args) {
        try {
            int value = 1 / 0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");

    int [] array = new int[]{};
    try{
        int value = array[0];
    } catch(ArrayIndexOutOfBoundsException o ){
        System.out.println(o.getMessage());
    }
    Object object = null;
    object.getClass();
    }
}
