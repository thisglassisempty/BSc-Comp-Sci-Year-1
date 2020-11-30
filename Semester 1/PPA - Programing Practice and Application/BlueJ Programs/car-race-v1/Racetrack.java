
/**
 * Write a description of class Racetrack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Racetrack
{
    //this tracks information that can affect the time taken to complete
    //a single lap
    private boolean isRaining;
    
    /*
     * The number of seconds it takes for a car to complete a single lap
     * in this race, on average. Each race can have a different
     * averageLapTime, since races take place on different race tracks
     */
    private int averageLapTime;

    /**
     * Constructor for objects of class Racetrack
     */
    public Racetrack()
    {
        // initialise instance variables
        this.averageLapTime = averageLapTime;
        this.isRaining = isRaining;
    }
    
    /**
     * Return average lap time
     */
    public int getAverageLapTime()
    {
        return averageLapTime;
    }
    
    /**
     * Return average lap time
     */
    public boolean getIsRaining()
    {
        return isRaining;
    }

}
