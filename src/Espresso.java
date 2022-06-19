public class Espresso extends Coffee{
    public Espresso () {
        super(30, 22, 0); // вставил молоко, так как компилятор выдавал ошибку, когда добавил молоко для каппучино
    }
    @Override // означает переопределение метода базового класса
    public String toString(){
        return "Espresso"+super.toString();
    }
}
