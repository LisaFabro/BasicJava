public class Car {
    private int engine;
    private String plate;
    private String brand;
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Car(int engine, String plate, String brand, String model){
        this.engine= engine;
        this.plate= plate;
        this.brand= brand;
        this.model= model;
    }
    public int getEngine(){
        return engine;
    }
    public int setEngine(int engine){
        this.engine = engine;
        return engine;
    }
    public String getPlate(){
        return plate;
    }
    public String setPlate(String plate){
        this.plate = plate;
        return plate;
    }
    public String getBrand(){
        return brand;
    }
    public String setBrand(String brand){
        this.brand = brand;
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String setModel(String model){
        this.model = model;
        return model;
    }
}
