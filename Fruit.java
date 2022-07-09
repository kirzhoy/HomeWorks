package Lesson3HW;

public class Fruit {

    private float wight;

    public Fruit(float wight) {
        this.wight = wight;
    }

    public float getWight() {
        return wight;
    }

    public void setWight(float wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "весом " + wight;
    }
}

