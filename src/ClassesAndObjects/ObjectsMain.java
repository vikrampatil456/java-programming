package ClassesAndObjects;

public class ObjectsMain {
    public static void main(String[] args) {
        //object creation
        Student s1 = new Student();
        s1.name = "vikram";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Alice";
        s2.age = 22;

//        s1.display();
//        s2.display();

        Car c1 = new Car("Toyota", 180);
        Car c2 = new Car("Porsche", 299);
    }
}
