package lab_8;

public class AnimalFly {

    private boolean flyable;
    private String name;
    private int speed;

    protected AnimalFly(Builder builder) {
        this.flyable = builder.flyable;
        this.name = builder.name;
        this.speed = builder.speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "AnimalFly{" +
                "flyable=" + flyable +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public static class Builder{
        private boolean flyable;
        private String name;
        private int speed;

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalFly build(){
            return new AnimalFly(this);
        }
    }
}
