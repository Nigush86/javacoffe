public interface CoffeeMachineInterface {
    void start();
    void turnOff();
    Coffee doEspresso();
    Coffee doAmericano();
    Coffee doCappuccino();
    Coffee doLatte();
    void clean();

    void charge();

}
