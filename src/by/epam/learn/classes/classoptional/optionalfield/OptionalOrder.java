package by.epam.learn.classes.classoptional.optionalfield;

import java.util.Optional;

public class OptionalOrder {
    private long id;
    private Optional<String> description;

    public OptionalOrder(long id, Optional<String> description) {
        this.id = id;
        this.description = description;
    }

    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(String descriptionString) {
        this.description = Optional.ofNullable(descriptionString);
    }

    @Override
    public String toString() {
        return "OptionalOrder{" +
                "id=" + id +
                ", description=" + description +
                '}';
    }
}
