package by.epam.learn.classes.classdesign.overridingandoverridingmethods;

public class PointMain {
    public static void main(String[] args) {
        Point1D point1D = new Point1D();
        point1D.setX(10);
        System.out.println(point1D.length());
        Point1D point2D = new Point2D();
        point2D.setX(3);
        // преобразование ссылки к Point2D
        ((Point2D)point2D).setY(4);
        System.out.println(point2D.length());
        Point2D  point2D1 = new Point2D();
        point2D1.method();
        point2D1.method(2);
        point2D1.method(101.1);
        Point2D.method("Hello");
        point1D.method(Double.parseDouble("5.0"));
    }
}
