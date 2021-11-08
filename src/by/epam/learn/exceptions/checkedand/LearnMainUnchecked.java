package by.epam.learn.exceptions.checkedand;

public class LearnMainUnchecked {
    public static void main(String[] args) {
        String[] numbers = {"42", "0", "Y-" , "33"};
        int count = 0;
        int result;
        int value = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                result = Integer.parseInt(numbers[i]);
                try{
                    sum += 100 / result;
                    Integer.parseInt("");
                }catch (ArithmeticException | NumberFormatException e) {
                    e.printStackTrace();
                }
            } catch (NumberFormatException e) {
                System.err.println(e);
            } finally {
                System.out.println("count = " + ++ count );
            }
        }
        System.out.println(sum);
    }
}
