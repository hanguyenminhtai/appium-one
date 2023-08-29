package lab_7.BaiTap2;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {

    public static String winnerRacing(List<Animal> animalList) {
        String winner = "";
        int speedmax = 0;

        for (Animal animal : animalList) {
            if (animal.getSpeed() > speedmax) {
                speedmax = animal.getSpeed();
                winner = animal.getName();
            }
        }

        return "Winner is: " + winner;
    }

    public static void main(String[] args) {
        Animal h = new Horse("Horse");
        Animal t = new Tiger("Tiger");
        Animal d = new Dog("Dog");
        List<Animal> animalList = Arrays.asList(h, t, d);

        System.out.println(animalList);
        System.out.println(winnerRacing(animalList));
    }
}
