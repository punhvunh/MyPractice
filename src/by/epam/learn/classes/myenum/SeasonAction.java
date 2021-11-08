package by.epam.learn.classes.myenum;

public class SeasonAction {
    public Integer action(Seasons seasons, Integer a, Integer b){
        return seasons.get().apply(a,b);
    }
}
