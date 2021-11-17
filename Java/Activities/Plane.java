package activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane 
{
	private List<String> passengers;
    private Date lastTimeTakeoff;
    private Date lastTimeLanded;

    Plane()
    {
        this.passengers = new ArrayList<>();
    }

    void onboard(String passenger) 
    {
        this.passengers.add(passenger);
    }

    Date takeOff() 
    {
        this.lastTimeTakeoff = new Date();
        return lastTimeTakeoff;
    }

    void land() 
    {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    Date getLastTimeLanded() 
    {
        return lastTimeLanded;
    }

    List<String> getPassengers() 
    {
        return passengers;
    }
}

