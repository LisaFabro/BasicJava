import java.util.Objects;

public class Main {
public static void main(String[] args){
    Car car1 = new Car(2000, "AA456WW", "Mercedes", "classe A");
    System.out.println(car1);

    car1.setPlate("BB000CC");
    System.out.println("N° targa sostituita " + car1.getPlate());
    System.out.println("Sostituita targa in Mercedes " + car1);
}
}