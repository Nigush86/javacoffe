import java.util.Random;

public class Coffee {
    Random random= new Random();
    int requiredWaterValue;
    int requiredCoffeeValue;
    int requiredMilkValue;
    int amountGarbageProduced;

    public Coffee(int requiredWaterValue, int requiredCoffeeValue, int requiredMilkValue) {

        this.requiredWaterValue = requiredWaterValue;
        this.requiredCoffeeValue = requiredCoffeeValue;
        this.requiredMilkValue = requiredMilkValue;
        this.amountGarbageProduced = random.nextInt(requiredCoffeeValue/5);
    }

    @Override
    public String toString() {
        return "{" +
                "requeredWaterValue=" + this.requiredWaterValue +
                "requeredCoffeeValue=" + this.requiredCoffeeValue +
                "requeredMilkValue=" + this.requiredMilkValue +
                "}";
    }
}
