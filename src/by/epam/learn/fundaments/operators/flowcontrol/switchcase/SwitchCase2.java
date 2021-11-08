package by.epam.learn.fundaments.operators.flowcontrol.switchcase;

public class SwitchCase2 {
    public static void defineLevel(String str) throws IllegalAccessException {
        int level;
        switch (str){
            case "guest": level = 0;
                System.out.println(level);
                break;
            case "client": level = 1;
                System.out.println(level);
                break;
            case "moderator": level = 2;
                System.out.println(level);
                break;
            case "admin": level = 3;
                System.out.println(level);
                break;
            default: throw new IllegalAccessException("wrong role");
        }

    }
}
