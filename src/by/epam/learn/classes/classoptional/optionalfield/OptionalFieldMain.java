package by.epam.learn.classes.classoptional.optionalfield;

public class OptionalFieldMain {
    public static void main(String[] args) {
        OptionalOrder optionalOrder = new OptionalOrder(500, null);
        System.out.println(optionalOrder.getDescription());
        optionalOrder.setDescription("Hello");
        System.out.println(optionalOrder.getDescription());
    }
}
