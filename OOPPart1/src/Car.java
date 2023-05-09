public class Car {
    private String make = "KIA";
    private String model = "Soul";
    private String color = "Alien Green";
    private int doors = 4;
    private boolean convertible = false;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(
            doors + "-door " +
            color + " " +
            make + " " +
            model + " " +
            (convertible ? "Convertible" : ""));
    }
}
