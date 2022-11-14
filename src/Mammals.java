import java.util.Objects;

public class Mammals extends Animals{

    private String livingEnvironment;
    private int speedOfMovement;

    public Mammals(String animalName, int animalAge, String livingEnvironment, int speedOfMovement) {
        super(animalName, animalAge);
        if (livingEnvironment == null || livingEnvironment.isEmpty()){
            this.livingEnvironment = "разнообразная";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

        if (speedOfMovement <0){
            this.speedOfMovement = Math.abs(speedOfMovement);
        } else {
            this.speedOfMovement = speedOfMovement;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void walk(String name){
        System.out.println("Часто можно увидеть, как " + getAnimalName() + " гуляет в естественной среде");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speedOfMovement == mammals.speedOfMovement && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speedOfMovement);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Среда обитания: " + livingEnvironment +
                ". Скорость передвижения: " + speedOfMovement;
    }
}
