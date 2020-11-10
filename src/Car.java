public class Car extends Vehicle implements Costable {

    private int doorCount;

    public Car(int wheelCount, int doorCount){
        super(wheelCount);
        this.doorCount = doorCount;
    }

    @Override
    public int getCost() {
        return 5000;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Машина - количество дверей: " + doorCount +
                ", количество колёс: " + wheelCount + ", Цена: " + getCost() + "$");
    }
}
