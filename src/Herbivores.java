import java.util.Objects;

public class Herbivores extends Mammals {

    private String typeOfFood;

    public Herbivores(String animalName, int animalAge, String livingEnvironment, int speedOfMovement, String typeOfFood) {
        super(animalName, animalAge, livingEnvironment, speedOfMovement);

        if (typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "не указан";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void eat() {
        System.out.println("Данный вид питается растительной пищей.");
    }

    public void go() {
        System.out.println("Для перемещения у травоядных имеются особым образом устроенные конечности.");
    }
    public void graze() {
        System.out.println("В поисках корма стада этих животных пасутся на открытых пространствах своего ареала");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
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
