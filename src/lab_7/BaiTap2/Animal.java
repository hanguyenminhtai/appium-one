package lab_7.BaiTap2;

import java.security.SecureRandom;

public class Animal {

    private int speed;
    private String name;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    public Animal(int maxSpeed, String name) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
        this.name = name;
    }
}
