import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood;

    public Predators(String animalName, int animalAge, String livingEnvironment, int speedOfMovement, String typeOfFood) {
        super(animalName, animalAge, livingEnvironment, speedOfMovement);

        if (typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "не указан";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void eat() {
        System.out.println("Данный вид питается животной пищей.");
    }

    public void go() {
        System.out.println("Для перемещения у хищников имеются особым образом устроенные конечности.");
    }

    public void hunt() {
        System.out.println("Они охотятся на других животных в одиночку или собираясь в стаи");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators that = (Predators) o;
        return Objects.equals(typeOfFood, that.getTypeOfFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Тип питания: " + typeOfFood + ".";
    }
}
