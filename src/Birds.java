import java.util.Objects;

public class Birds extends Animals{
    private String livingEnvironment;

    public Birds(String animalName, int animalAge, String livingEnvironment) {
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
        System.out.println("Среди птиц имеются как растительноядные, так и хищники.");
    }

    public void go() {
        System.out.println("Для перемещения по земле у птиц имеются нижние конечности, а для полета - крылья.");
    }

    public void hunt() {
        System.out.println("Хищные птицы охотятся на других мелких животных или насекомых");
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
        Birds that = (Birds) o;
        return Objects.equals(livingEnvironment, that.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
