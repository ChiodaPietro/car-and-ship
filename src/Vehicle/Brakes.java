package Vehicle;

public class Brakes {
    private int longevity;
    private String brand;
    public Brakes(String brand){
        this.longevity=100;
        this.brand=brand;
    }
    public int getLongevity(){
        return longevity;
    }
    public String getBrand(){
        return brand;
    }
    public void Brakes_consumption(int consumption) throws BrakesBrokenException{
        if(consumption<longevity) {
            longevity = longevity - consumption;
        }else {
            longevity=0;
            throw new BrakesBrokenException("the brakes are broken");
        }
    }
    public void setLongevity(int longevity){
        this.longevity-=longevity;
    }
}
