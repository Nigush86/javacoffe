public class Cappuccino extends Coffee{
    public Cappuccino() {
        super(30, 22, 20);
    }
    @Override
    public String toString(){
        return "Cappuccino"+super.toString();
    }
}
