package Vehicle;

public class Main {
    public static void main(String[] args) throws BrakesBrokenException {
        Car c=new Car(20,200,"red", "bugatti", false);
        Ship s= new Ship(400, 40, "orange");
        c.onoff();
        s.onoff();
        switch (1){
            case 1:
                c.onoff();
                break;
            case 2:
                c.accelerate(40);
                break;
            case 3:
                c.Brake();
                break;
            case 4:
                c.setGear(1);
                break;
            case 5:
                c.Use_Handbrake();
                break;
        }
        switch (1){
            case 1:
                s.accelerate();
                break;
            case 2:
                s.Brake();
                break;
        }
    }
}
