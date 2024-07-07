package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
        
    public Plane (int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
        public void onboard(String passenger) {
            this.passengers.add(passenger);
        }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;

    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassesngers() {
        return passengers;
    }
}

public class Activity6 {
    public static void main(String[] args) throws InterruptedException{
        Plane plane = new Plane(10);
    
        
        plane.onboard("Anjali");
        plane.onboard("Anjali");
        plane.onboard("Anjali");

        System.out.println("Take-off time:" + plane.takeOff());

        System.out.println("List of passengers:" + plane.getPassesngers()); 

        Thread.sleep(5000);

        plane.land();
        
        System.out.println("Time of landing:" + plane.getLastTimeLanded()); 

        System.out.println("People on the plane after landing: " + plane.getPassesngers());
        
    }
}
