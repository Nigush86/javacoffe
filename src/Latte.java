public class Latte extends Coffee{
    public Latte() {
        super(30, 22, 30);
    }
    @Override
    public String toString(){
        return "Latte"+super.toString();
    }
}
