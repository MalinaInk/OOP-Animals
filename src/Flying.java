import java.util.Objects;

public class Flying extends Birds{
    private String movementType;

    public Flying(String animalName, int animalAge, String livingEnvironment, String movementType) {
        super(animalName, animalAge, livingEnvironment);
        if (movementType == null || movementType.isEmpty()) {
            this.movementType = "не указан.";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void fly(String name){
        System.out.println("Часто можно увидеть птицу " + getAnimalName() + " в полете");
    }

    public void eat() {
        System.out.println("Среди птиц имеются как растительноядные, так и хищники.");
    }

    public void go() {
        System.out.println("Для перемещения по земле у птиц имеются нижние конечности, для полета - крылья.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAnimalName());
    }


    @Override
    public String toString() {
        return super.toString() +
                " Тип передвижения: " + movementType;
    }
}
