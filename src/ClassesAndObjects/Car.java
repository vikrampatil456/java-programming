package ClassesAndObjects;

public class Car {
    String brand;
    int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;

        System.out.println(brand + " goes " + speed + " kmph");
    }
}
