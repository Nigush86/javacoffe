public class CoffeeMachine implements CoffeeMachineInterface {
    String model;
    int coffeeCapacity;
    int waterCapacity;
    int milkCapacity;
    int garbgeCapacity;
    int currentGarbgeAmount;
    int currentWaterAmount = 0;
    int currentMilkAmount = 0;
    int currentCoffeeAmount = 0;
    boolean isWorking = false;

    public CoffeeMachine(String model, int coffeeCapacity,int waterCapacity, int milkCapacity, int garbgeCapacity ) {
        this.model = model;
        this.coffeeCapacity = coffeeCapacity;
        this.waterCapacity = waterCapacity;
        this.milkCapacity = milkCapacity;
        this.garbgeCapacity = garbgeCapacity;
        this.currentGarbgeAmount = garbgeCapacity;
    }

    @Override // переопределяем метод класса
    public void charge() {
        this.currentCoffeeAmount = coffeeCapacity;
        this.currentWaterAmount = waterCapacity;
        this.currentMilkAmount = milkCapacity;
    }

    @Override
    public void start() {
        if(isWorking == false){
            this.isWorking = true;
            System.out.println(this.model+" is on/включен");
        }
    }

    @Override
    public void turnOff() {
        if (isWorking == true){
            this.isWorking = false;
            System.out.println(this.model+" is off/выключен");
        }
    }

    @Override
    public Coffee doEspresso() {
        if(this.isWorking == true){
            Coffee espresso = new Espresso();
            if(currentWaterAmount<espresso.requiredWaterValue ){
                System.out.println("Ошибка: отсутствует вода!");
            }
            if(currentCoffeeAmount<espresso.requiredCoffeeValue){
                System.out.println("Ошибка: отсутствует молотое кофе!");
            }
            if(currentGarbgeAmount == garbgeCapacity){
                System.out.println("Ошибка: переполнен бак с отработанным кофе!");
            }
            if(currentWaterAmount >= espresso.requiredWaterValue && currentCoffeeAmount >= espresso.requiredCoffeeValue && currentGarbgeAmount != garbgeCapacity){
                currentGarbgeAmount += espresso.amountGarbageProduced;
                currentCoffeeAmount -= espresso.requiredCoffeeValue;
                currentWaterAmount -= espresso.requiredWaterValue;
                return espresso;
            }
            return null;
        }
        return null;
    }

    @Override
    public Coffee doAmericano() {
        if(this.isWorking == true){
            Coffee americano = new Americano();
            if(currentWaterAmount<americano.requiredWaterValue ){
                System.out.println("Ошибка: отсутствует вода!");
            }
            if(currentCoffeeAmount<americano.requiredCoffeeValue){
                System.out.println("Ошибка: отсутствует молотое кофе!");
            }
            if(currentGarbgeAmount == garbgeCapacity){
                System.out.println("Ошибка: переполнен бак с отработанным кофе!");
            }
            if(currentWaterAmount >= americano.requiredWaterValue && currentCoffeeAmount >= americano.requiredCoffeeValue && currentGarbgeAmount != garbgeCapacity){
                currentGarbgeAmount += americano.amountGarbageProduced;
                currentCoffeeAmount -= americano.requiredCoffeeValue;
                currentWaterAmount -= americano.requiredWaterValue;
                return americano;
            }
            return null;
        }
        return null;
    }
    @Override
    public Coffee doCappuccino() {
        if(this.isWorking==true){
            Coffee cappuccino= new Cappuccino();
            if(currentWaterAmount<cappuccino.requiredWaterValue ){
                System.out.println("Ошибка: отсутствует вода!");
            }
            if(currentCoffeeAmount<cappuccino.requiredCoffeeValue){
                System.out.println("Ошибка: отсутствует молотое кофе!");
            }
            if(currentMilkAmount<cappuccino.requiredMilkValue){
                System.out.println("Ошибка: отсутствует молоко!");
            }
            if(currentGarbgeAmount==garbgeCapacity){
                System.out.println("Ошибка: переполнен бак с отработанным кофе!");
            }
            if(currentWaterAmount>=cappuccino.requiredWaterValue && currentCoffeeAmount>=cappuccino.requiredCoffeeValue && currentMilkAmount>=cappuccino.requiredMilkValue && currentGarbgeAmount!=garbgeCapacity){
                currentGarbgeAmount+=cappuccino.amountGarbageProduced;
                currentCoffeeAmount-=cappuccino.requiredCoffeeValue;
                currentWaterAmount-=cappuccino.requiredWaterValue;
                currentMilkAmount-=cappuccino.requiredMilkValue;
                return cappuccino;
            }
            return null;
        }
        return null;
    }
    @Override
    public Coffee doLatte() {
        if(this.isWorking==true){
            Coffee latte = new Latte();
            if(currentWaterAmount<latte.requiredWaterValue ){
                System.out.println("Ошибка: отсутствует вода!");
            }
            if(currentCoffeeAmount<latte.requiredCoffeeValue){
                System.out.println("Ошибка: отсутствует молотое кофе!");
            }
            if(currentMilkAmount<latte.requiredMilkValue){
                System.out.println("Ошибка: отсутствует молоко!");
            }
            if(currentGarbgeAmount==garbgeCapacity){
                System.out.println("Ошибка: переполнен бак с отработанным кофе!");
            }
            if(currentWaterAmount>=latte.requiredWaterValue && currentCoffeeAmount>=latte.requiredCoffeeValue && currentMilkAmount>=latte.requiredMilkValue && currentGarbgeAmount!=garbgeCapacity){
                currentGarbgeAmount+=latte.amountGarbageProduced;
                currentCoffeeAmount-=latte.requiredCoffeeValue;
                currentWaterAmount-=latte.requiredWaterValue;
                currentMilkAmount-=latte.requiredMilkValue;
                return latte;
            }
            return null;
        }
        return null;
    }
    @Override
    public void clean() {
        currentGarbgeAmount = 0;
    }
}
