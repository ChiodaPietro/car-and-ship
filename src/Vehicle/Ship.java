package Vehicle;

public class Ship extends Vehicle{
    private int gear;
    public Ship(int max_speed, float acceleration, String color){
        super(acceleration, max_speed, color);
        gear=0;
    }
    @Override
    public void ShiftGear() {
        int Gear_shift_point=super.getMax_speed()/40;
        gear=(int)super.getSpeed()/Gear_shift_point;
    }
    @Override
    public void accelerate(){
        super.accelerate();
        if(super.getMax_speed()<super.getSpeed()){
            super.setSpeed(super.getMax_speed());
        }
    }

    @Override
    public void Brake() {
        super.setSpeed(-(int)super.getAcceleration());
    }

    public int getGear() {
        return gear;
    }
}

