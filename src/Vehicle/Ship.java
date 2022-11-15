package Vehicle;

public class Ship extends Vehicle{
    public Ship(int max_speed, float acceleration, String color){
        super(acceleration, max_speed, color);
    }
    @Override
    public void ShiftGear() {

    }

    @Override
    public void Brake() {
        super.setSpeed(-(int)super.getAcceleration());
    }
}
