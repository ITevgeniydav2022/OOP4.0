package transport;

import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1,2,3,4");

        Car lada = new Car("Lada", "Granta", 2.2);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("KIA", "Sportage", 2.4);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);

        System.out.println(" ");

        Bus liaz = new Bus("ЛиАЗ", "677", 190);
        Bus uaz = new Bus("УАЗ", "452Д", 180);
        Bus laz = new Bus("ЛАЗ", "695М", 160);
        Bus ikarus = new Bus("Икарус", "280", 190);

        System.out.println(liaz);
        System.out.println(uaz);
        System.out.println(laz);
        System.out.println(ikarus);

        System.out.println(" ");

        Truck kamaz = new Truck("КАМАЗ", "Мастер", 980);
        Truck maz = new Truck("МАЗ", "6440 RR", 1000);
        Truck iveco = new Truck("IVECO", "695М", 980);
        Truck tatra = new Truck("Tatra", "280", 1000);

        System.out.println(kamaz);
        System.out.println(maz);
        System.out.println(iveco);
        System.out.println(tatra);
        kamaz.start();
        kamaz.stop();
        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maxSpeed();

        System.out.println(" ");

        DriverB evgeniy = new DriverB("Евгений ", true, 10);
        DriverC akakiy = new DriverC("Акакий ", true, 8);
        DriverD evpatiy = new DriverD("Евпатий ", true, 3);

        evgeniy.startMove(audi);
        evgeniy.stopMove(audi);
        evgeniy.refill(audi);
        evgeniy.printInfo(audi);

        akakiy.startMove(maz);
        akakiy.stopMove(maz);
        akakiy.refill(maz);
        akakiy.printInfo(maz);

        evpatiy.startMove(ikarus);
        evpatiy.stopMove(ikarus);
        evpatiy.refill(ikarus);
        evpatiy.printInfo(ikarus);
    }
}