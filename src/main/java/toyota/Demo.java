package toyota;

public class Demo {

    public static void main(String[] args) {

        Toyota camry =new Toyota(3.5,"Black","camry70","2021", false,35000.0, "auto");
        camry.printCarInfo();

        camry.setPrice(25000.0);
        System.out.println(camry.getPrice());

    }
}
