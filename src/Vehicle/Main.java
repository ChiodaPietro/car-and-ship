package Vehicle;

public class Main {
    public static void main(String[] args) {
        Car c=new Car(20,200,"red", "bugatti", false);
        Ship s= new Ship(400, 40, "orange");
        c.onoff();
    }
}
