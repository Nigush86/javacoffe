public class Americano extends Coffee{
    public Americano() {
        super(100, 22, 0);// вставил молоко, так как компилятор выдавал ошибку, когда добавил молоко для каппучино
    }
    @Override
    public String toString(){
        return "Americano"+super.toString();
    }
}
