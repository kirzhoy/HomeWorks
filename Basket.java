package Lesson3HW;

public class Basket <T extends Fruit> {

    private T someFruit;
    private int quantityOfFruits;

    public Basket(T someFruit, int quantityOfFruits) {
        this.someFruit = someFruit;
        this.quantityOfFruits = quantityOfFruits;
    }

    public T getSomeFruit() {
        return someFruit;
    }

    public void setSomeFruit(T someFruit) {
        this.someFruit = someFruit;
    }

    public int getQuantityOfFruits() {
        return quantityOfFruits;
    }

    public void setQuantityOfFruits(int quantityOfFruits) {
        this.quantityOfFruits = quantityOfFruits;
    }

    @Override
    public String toString() {
        return " содержит " + quantityOfFruits +
                " фруктов " + someFruit;
    }


    public float getMass() {
        float mass = quantityOfFruits * someFruit.getWight();
        // System.out.println(quantityOfFruits * someFruit.getWight());
        return mass;
    }

    public static boolean compare(float basket1, float basket2) {
        if (basket1 == basket2) {
            return true;
        } else {
            return false;
        }
    }

    public static <T extends Fruit> float pour(Basket<T> littleBasket1, Basket<T> littleBasket2){
       littleBasket2.setQuantityOfFruits ((littleBasket1.getQuantityOfFruits() + littleBasket2.getQuantityOfFruits()));
       littleBasket1.setQuantityOfFruits(0);
       return littleBasket2.getQuantityOfFruits();
    }
}
