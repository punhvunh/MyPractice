package by.epam.learn.classes.garbagecollector;
//Object, A,B,C -  иерархия констукторов, деструкторы наоборот
class A{
}
class B extends A{
}
class C extends B{
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        // отказались
    }
}


public class Main {
    public static void main(String[] args) {
        C c = new C();
        c = null;
        //Сборщик мусора
        System.gc();
        Runtime.getRuntime().gc();
    }
}
