import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static Animals[] animals = new Animals[0];
    public static void addAnimal(Animals animal) {
        boolean isExist = false;

        for (Animals animal1 : animals) {
            if (animal1.equals(animal) == true) {
                isExist = true;
                animal = animal1;
                System.out.println("Объект " + animal.getAnimalName() + " возрастом " + animal.getAnimalAge() + " уже существует");
                break;
            }
        }
        if (isExist != true) {
             animals = Arrays.copyOf(animals, animals.length + 1);
             animals[animals.length - 1] = animal;
            }
        }

    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("газель", 5, "африканские прерии", 97, "травянистые растения");
        System.out.println(gazelle.toString());
        gazelle.eat();
        gazelle.sleep();
        gazelle.graze();
        gazelle.walk(gazelle.getAnimalName());

        Herbivores giraffe = new Herbivores("жираф", 6, "австралийские прерии", 60, "лиственные деревья");
        System.out.println(giraffe.toString());
        giraffe.eat();
        giraffe.sleep();
        giraffe.graze();
        giraffe.walk(giraffe.getAnimalName());

        Herbivores horse = new Herbivores("лошадь", 3, "степная полоса", 88, "злаки");
        System.out.println(horse.toString());
        horse.eat();
        horse.sleep();
        horse.graze();
        horse.walk(horse.getAnimalName());

        Predators hyena = new Predators("гиена", 5, "лесостепь",64, "животная пища");
        System.out.println(hyena.toString());
        hyena.eat();
        hyena.sleep();
        hyena.hunt();
        hyena.walk(hyena.getAnimalName());

        Predators tiger = new Predators("тигр", 6, "саванна", 55, "животная пища");
        System.out.println(tiger.toString());
        tiger.eat();
        tiger.go();
        tiger.sleep();
        tiger.hunt();
        tiger.walk(tiger.getAnimalName());

        Predators bear = new Predators("медведь", 7, "лес", 56, "животная пища");
        System.out.println(bear.toString());
        bear.eat();
        bear.sleep();
        bear.hunt();
        bear.walk(bear.getAnimalName());

        Amphibians frog = new Amphibians("лягушка", 3, "болото");
        System.out.println(frog.toString());
        frog.eat();
        frog.sleep();
        frog.go();
        frog.hunt();
        horse.walk(frog.getAnimalName());

        Amphibians freshwaterSnake = new Amphibians("уж пресноводный", 2, "река");
        System.out.println(freshwaterSnake.toString());
        freshwaterSnake.eat();
        freshwaterSnake.sleep();
        freshwaterSnake.go();
        freshwaterSnake.hunt();

        NotFlying peacock = new NotFlying("павлин", 2, "лес, домашние виды", "не летает");
        System.out.println(peacock.toString());
        peacock.eat();
        peacock.go();
        peacock.walk(peacock.getAnimalName());

        NotFlying penguin = new NotFlying("пнгвин", 4, "арктика", "не летает");
        System.out.println(penguin.toString());
        penguin.eat();
        penguin.go();
        penguin.walk(penguin.getAnimalName());


        NotFlying dodo = new NotFlying("птица додо", 2, "лес", "не летает");
        System.out.println(dodo.toString());
        dodo.eat();
        dodo.go();
        dodo.walk(dodo.getAnimalName());

        Flying seagull  = new Flying("чайка", 2, "побережье", "летает");
        System.out.println(seagull.toString());
        seagull.eat();
        seagull.go();
        seagull.fly(dodo.getAnimalName());

        Flying albatross  = new Flying("альбатрос", 4, "побережье", "летает");
        System.out.println(albatross.toString());
        albatross.eat();
        albatross.go();
        albatross.fly(albatross.getAnimalName());

        Flying falcon  = new Flying("сокол", 2, "степь", "летает");
        System.out.println(falcon.toString());
        falcon.eat();
        falcon.go();
        falcon.fly(falcon.getAnimalName());

        Flying falcon2  = new Flying("сокол", 2, "степь", "летает");
        Flying falcon3  = new Flying("сокол", 3, "степь", "летает");
        Amphibians frog2 = new Amphibians("лягушка", 3, "болото");
        System.out.println(frog2.equals(frog));
        System.out.println(falcon.equals(falcon2));
        System.out.println(falcon.equals(falcon3));


        addAnimal(falcon);
        addAnimal(falcon2);
        addAnimal(falcon3);

        Arrays.stream(animals).collect(Collectors.toList()).forEach(System.out::println);
//преобразуем массив в список, затем выполняем что-то для каждого элемента.
    }
}