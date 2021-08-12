package toyota;

public class Toyota {

    private final int wheel=4;
    private double engine;
    private String color;
    private String model;
    private String year;
    private boolean isCoupe;
    private double price;
    private String gear;

    public Toyota(double engine, String color, String model, String year, boolean isCoupe, double price, String gear) {
        this.engine = engine;
        this.color = color;
        this.model = model;
        this.year = year;
        this.isCoupe = isCoupe;
        this.price = price;
        this.gear = gear;

        if (gear.equalsIgnoreCase("auto") || gear.equalsIgnoreCase("manual") || gear.equalsIgnoreCase("robot")) {
            this.gear = gear;
        } else {
            System.out.println("u nas netu MTK");
        }


    }
    public void printCarInfo () {
        System.out.println("engine " + engine + " " + "color " + color + " " + "model " + model + " " + "year " + year);
    }
    public int getWheel() {
        return wheel;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isCoupe() {
        return isCoupe;
    }

    public void setCoupe(boolean coupe) {
        isCoupe = coupe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }
}
