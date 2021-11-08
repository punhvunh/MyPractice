package by.epam.learn.fundaments.datatypes.var;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class Var {
    public static void main(String[] args) {
        // тип данных не определен, при помощи var;
        var i = 1;
        var n = Integer.valueOf(2);
        var str = "Java";
        // не является хорошей практикой
        var res = List.of(1,"2", 3.0, new StringBuilder("Java10"));
        List<Object> list = Collections.singletonList(res);
        List<? extends Serializable> list1 = res;
        var x = "".split("");
    }
}
