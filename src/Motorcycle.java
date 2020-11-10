public class Motorcycle extends Vehicle implements Costable {

    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed){
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getCost() {
        return 1500;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл - количество колёс: " + wheelCount
                + ", максимальная скорость км/ч " + maxSpeed + ", Цена: " + getCost() + "$");
    }
}
