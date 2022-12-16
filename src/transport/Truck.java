package transport;

public class Truck extends Transport implements Competing{


    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус проехал на Пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + (Math.random() * 7) + " мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + (Math.random() * 120) + " км/ч.");
    }


}
