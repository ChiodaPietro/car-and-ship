package Vehicle;

public class Car extends Vehicle{
    private boolean HandBrake;
    private Brakes Front_Brakes;
    private Brakes Rear_Brakes;
    private int Gear_max_speed;
    private int gear;
    private boolean traction; // off= rear on = front
    public Car(float acceleration, int max_speed, String color, String brakes_brand, boolean traction) {
        super(acceleration, max_speed, color);
        Front_Brakes =new Brakes(brakes_brand);
        Rear_Brakes= new Brakes(brakes_brand);
        this.traction=traction;
        gear=0;
    }

    @Override
    public void ShiftGear() {
        if (super.isOnoff()) {
            float Gear_changing_point=getMax_speed()/6;
            Gear_max_speed = ((int)Gear_changing_point*gear);
        } else {
            super.onoff();
            System.out.println("the car just turned on");
        }
    }
    @Override
    public void Brake() {
        super.setSpeed(super.getSpeed()-50);
        if (super.isOnoff()) {
            if(traction){
                Front_Brakes.setLongevity(5);
            }else {
                Rear_Brakes.setLongevity(5);
            }
        } else {
            super.onoff();
            System.out.println("car just turned on");
        }
    }
    public void setGear(int gear){
        if (super.isOnoff()) {
            try {
                if(gear<6) {
                    this.gear = gear;
                }else {
                    throw new GearOutOfBoundException("that gear doesnt exist in this car");
                }
            } catch (GearOutOfBoundException e) {
                System.out.println(e.getMessage());
            }
            ShiftGear();
        } else {
            super.onoff();
            System.out.println("car just turned on");
        }
    }
    public void accelerate(int add_speed){
        if(super.isOnoff()) {
            if (super.getSpeed() + add_speed < Gear_max_speed) {
                setSpeed(super.getSpeed() + add_speed);
            } else {
                System.out.println("you can't reach that speed with this gear");
            }
        }else {
            super.onoff();
            System.out.println("car just turned on");
        }
    }
    public void Use_Handbrake() throws BrakesBrokenException {
        if(super.isOnoff()) {
            if (super.getSpeed() <= 3) {
                Front_Brakes.Brakes_consumption(1);
                Rear_Brakes.Brakes_consumption(1);
                super.setSpeed(0);
            } else {
                Front_Brakes.Brakes_consumption(50);
                Rear_Brakes.Brakes_consumption(50);
                super.setSpeed(0);
            }
        }else {
            super.onoff();
            System.out.println("car just turned on");
        }
    }
}
