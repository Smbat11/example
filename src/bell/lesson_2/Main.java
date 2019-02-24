package bell.lesson_2;

class Car {

    protected String mark;
    private double weight;
    private int power;

    public Car(String mark, double weight, int power) {
        this.mark = mark;
        this.weight = weight;
        this.power = power;
    }

    public void setPower(int newPower){
        this.power = newPower;
        System.out.println("Новая мощность для Car: " + power);
    }
}

class Lorry extends Car{

    private  double loadCapacity;

    public Lorry(String mark, double weight, int power, double loadCapacity) {
        super(mark, weight, power);
        this.loadCapacity = loadCapacity;
    }

    public void setMark(String mark) {
        this.mark = mark;
        System.out.println("Новая марка для Lorry: " + mark);
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
        System.out.println("Новая грузоподъемность для Lorry: " + loadCapacity);
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Audi", 1500.55, 250);
                car.setPower(300);

        Lorry lorry = new Lorry("Volvo", 3500.75, 450, 950.65);
                lorry.setMark("BMW");
                lorry.setLoadCapacity(1500.78);

    }
}