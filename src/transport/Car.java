package transport;

public class Car extends Transport implements Competing{


    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public String toString() {
        return "Легковой автомобиль " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль проехал на Пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        Math.random();
    }

    @Override
    public void maxSpeed() {
        Math.random();
    }


}
