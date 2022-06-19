public class Main {
    public static void main(String[] args) {
        CoffeeMachineInterface prototype = new CoffeeMachine("prototype",1000,1000,1000, 3000);// объемы кофе, воды, молока и общий объем
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        System.out.println(prototype.doCappuccino());
        System.out.println(prototype.doLatte());
        prototype.start();
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        System.out.println(prototype.doCappuccino());
        System.out.println(prototype.doLatte());
        prototype.charge();
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        System.out.println(prototype.doCappuccino());
        System.out.println(prototype.doLatte());
        prototype.clean();
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        System.out.println(prototype.doCappuccino());
        System.out.println(prototype.doLatte());
        prototype.turnOff();
        System.out.println(prototype.doAmericano());
        System.out.println(prototype.doEspresso());
        System.out.println(prototype.doCappuccino());
        System.out.println(prototype.doLatte());
    }
}
