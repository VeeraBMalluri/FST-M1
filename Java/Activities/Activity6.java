package activities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        // max no of Passengers are not defined because list can take 'n' values
        Plane plane = new Plane();
        //Add passengers on the list
        plane.onboard("Venkat");
        plane.onboard("Veera");
        plane.onboard("Padma");
        plane.onboard("Kala");
        //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
        Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}