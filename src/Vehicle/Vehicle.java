package Vehicle;

public abstract class Vehicle {
    private String color;
    private int max_speed;
    private int speed;
    private float acceleration;
    private boolean onoff= false;
    public Vehicle(float acceleration, int max_speed, String color){
        this.max_speed=max_speed;
        this.acceleration=acceleration;
        this.color=color;
        speed=0;
    }
    public abstract void ShiftGear();
    public abstract void Brake();
    public  void accelerate(){
        speed=speed+(int)acceleration;
    }
    public  void onoff(){
        onoff=!onoff;
    }

    public String getColor() {
        return color;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public boolean isOnoff() {
        return onoff;
    }
    public int getSpeed(){
        return speed;
    }
    public void setMax_speed(int max_speed){
        this.max_speed=max_speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

}
