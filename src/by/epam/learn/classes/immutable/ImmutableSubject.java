package by.epam.learn.classes.immutable;

import java.util.Objects;
//Сеттеров нет т.к нельзя изменять
public class ImmutableSubject {
    private int id;
    private String name;

    public ImmutableSubject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableSubject that = (ImmutableSubject) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
