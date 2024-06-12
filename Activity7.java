package Activities;

interface BicycleParts {
    public int gears = 0;
    public int speed = 0;
}

interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

 class Bicycle implements BicycleParts, BicycleOperations {

	 public int gears;
	    public int speed;
	    
    public Bicycle(int gears, int speed) {
        this.gears = gears;
        this.speed = speed;   
    }
    
    public void applyBrake(int decrement) {
    	speed = speed - decrement;
    	System.out.println("Current speed: " + speed);
    }
    
    public void speedUp(int increment) {
    	speed += increment;
    	System.out.println("Current speed: " + speed);
    }
    
    public String bicycleDesc() {
        return("No of gears are "+ gears + " " + "Speed of bicycle is " + speed);
    }
}
 
 class MountainBike extends Bicycle {
	
	 int seatHeight;
	public MountainBike(int gears, int speed, int seatHeight) {
		super(gears, speed);
		this.seatHeight = seatHeight;
	}

	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
        return(super.bicycleDesc() + " " + "Height of seat "+ seatHeight);
    }
 }
 
public class Activity7 {

	public static void main(String[] args) {
		MountainBike m = new MountainBike(4, 60, 7);
		m.speedUp(20);
		m.applyBrake(5);
		System.out.println(m.bicycleDesc());
		
	}
}
