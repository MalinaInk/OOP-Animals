import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String animalName, int animalAge, String livingEnvironment) {
        super(animalName, animalAge);
        if (livingEnvironment == null || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "разнообразная";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public void eat() {
        System.out.println("Данный вид питается разнообразной животной пищей.");
    }

    public void go() {
        System.out.println("Для перемещения у земноводных имеются особым образом устроенные конечности.");
    }

    public void hunt() {
        System.out.println("Они охотятся на других мелких животных или насекомых");
    }

    @Override
    public String toString() {
        return super.toString() +
                " Среда обитания: " + livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
