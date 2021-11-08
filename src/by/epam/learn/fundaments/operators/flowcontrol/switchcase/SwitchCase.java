package by.epam.learn.fundaments.operators.flowcontrol.switchcase;

public class SwitchCase {
    public static void main(String[] args) throws IllegalAccessException {
        byte b = 3; // int, enum, short,String,char + их классы оболочки (либо константа в качестве case)
        switch (b) {
            case 1:
                System.out.println("1 " + b);
                break;
            case 3:
            case 4:
                System.out.println("4 " + b);
                break;
            default:
                System.out.println("default " + b);
        }
      SwitchCase2.defineLevel("foka");
    }

 }

