package transport;

public class Bus extends Transport implements Competing{


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус проехал на Пит-стоп.");
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
