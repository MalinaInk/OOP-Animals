import java.util.Arrays;
import java.util.Objects;

public class Animals {
    private final String animalName;
    private int animalAge;



    public Animals(String animalName, int animalAge) {
        if (animalName == null || animalName.isEmpty()) {
            this.animalName = "Животное";
        } else {
            this.animalName = animalName;
        }
        setAnimalAge(animalAge);
    }


    public void eat() {
        System.out.println("Животному необходимо специальное питание.");
    }

    public void go() {
        System.out.println("Для перемещения имеются особым образом устроенные конечности.");
    }

    public void sleep() {
        System.out.println("Животное спит ночью.");
    }


    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        if (animalAge < 0) {
            this.animalAge = Math.abs(animalAge);
        } else {
            this.animalAge = animalAge;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return animalAge == animals.animalAge && Objects.equals(animalName, animals.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, animalAge);
    }

    @Override
    public String toString() {
        return animalName + ", " + animalAge +
                " лет. ";
    }
}
