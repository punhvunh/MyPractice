package by.epam.learn.classes.classdesign.overridingandoverridingmethods;

public class Point2D extends Point1D{
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    //Нельзя менять обасть вилимости, либо оа должна быть как у класса родителя или больше
    public double length() {
        return Math.hypot(y,getX());
    }
    public void method(){
        System.out.println("without");
    }
    private void method(int value){
        System.out.println("int " + value);
    }
    public static void method(String str){
        System.out.println("String " + str);
    }

}

