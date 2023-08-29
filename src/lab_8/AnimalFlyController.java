package lab_8;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalFlyController {

    public static void winnerRacing(List<AnimalFly> animalList) {
        //add animal flyable
        List<AnimalFly> animalFlyList = new ArrayList<>();
        for (AnimalFly animal : animalList) {
            if (animal.isFlyable() == false)
                animalFlyList.add(animal);
        }

        System.out.println("List can race: " + animalFlyList);

        String winner = "";
        int speedMax = 0;

        for (AnimalFly animal : animalFlyList) {
            if (animal.getSpeed() > speedMax) {
                speedMax = animal.getSpeed();
                winner = animal.getName();
            }
        }

        System.out.println("Winner is:" + winner);
    }

    public static void main(String[] args) {
        AnimalFly.Builder animalBuilder = new AnimalFly.Builder();

        AnimalFly eagle = animalBuilder
                .setName("Eagle")
                .setSpeed(new SecureRandom().nextInt(150))
                .setFlyable(true)
                .build();

        AnimalFly falcon = animalBuilder
                .setName("Falcon")
                .setSpeed(new SecureRandom().nextInt(250))
                .setFlyable(true)
                .build();

        AnimalFly tiger = animalBuilder
                .setName("Tiger")
                .setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(false)
                .build();

        AnimalFly snake = animalBuilder
                .setName("Snake")
                .setSpeed(new SecureRandom().nextInt(30))
                .setFlyable(false)
                .build();

        List<AnimalFly> animalList = Arrays.asList(eagle, falcon, tiger, snake);
        System.out.println(animalList);
        winnerRacing(animalList);
    }
}
