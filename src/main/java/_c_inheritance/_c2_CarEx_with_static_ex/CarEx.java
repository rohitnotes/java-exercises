package _c_inheritance._c2_CarEx_with_static_ex;

public class CarEx {

    private EngineEx engine;
    private String name;
    private Integer variavleInteger = 4;
    private int variableInt = 4;
    private int mileage;

    public CarEx() {
    }

    public CarEx(String name) {
        this.name = name;
    }

    public CarEx(EngineEx engine){
        this.engine = engine;
    }

    //    2nd concept:
    public CarEx(String name, EngineEx engine) {
        this.name = name;
        this.engine = engine;
    }

//    1st approach:
//    public void printCarName(String name) {
//        this.name = name;
//        System.out.println("Car's name is: " + name);
//    }

//    2nd approach
//    public void printCarName() {
//        System.out.println("Car's name is: " + name);
//    }

    public static void printCarName(String name) {
        CarEx car = new CarEx(name);
        System.out.println(car.getName());
    }

    // 1st concept:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EngineEx getEngine() {
        return engine;
    }

    public void setEngine(EngineEx engine) {
        this.engine = engine;
    }

    public int getVariableInt() {
        return variableInt;
    }

    public Integer getVariavleInteger() {
        return variavleInteger;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }
}