
/**
 * This class provides the ability to simulate a number of
 * car objects racing around a race track. In particular,
 * it can determine which car is leading the race after
 * every lap.
 * 
 * @author King's College London
 * @version 1.0
 */
public class Race
{
    //the cars participating in the race
    private Car car1;
    private Car car2;
    private Car car3;
    
    //the total amount of laps the race will last for
    private int numberOfLaps;

    /**
     * Constructor for objects of class Race
     */
    public Race(Car car1, Car car2, Car car3, int numberOfLaps,
    int averageLapTime, boolean isRaining)
    {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
        this.numberOfLaps = numberOfLaps;
        
    }
    
    /**
     * Identifies which of the cars is leading the race,
     * which is the one with the lowest total time
     * taken in the race so far.
     * 
     * @return the car that is leading the race
     */
    public Car getRaceLeader()
    {
        //TASK: determine which car, out of the three
        //in the race, is the leader
        int car1LapTime = car1.getTotalTime();
        int car2LapTime = car2.getTotalTime();
        int car3LapTime = car3.getTotalTime();
        
        if ((car1LapTime < car2LapTime) && (car1LapTime < car3LapTime)) {
            return car1;
        }
        else if ((car2LapTime < car1LapTime) && (car2LapTime < car3LapTime)) {
            return car2;
        }
        else if ((car3LapTime < car1LapTime) && (car3LapTime < car2LapTime)) {
            return car3;
        }
        return null;
    }
    
    /**
     * Simulates the race by making each car complete
     * laps around the track for the amount of laps
     * specified in numberOfLaps.
     */
    public void simulateRace()
    {
        //TASK: look at the following line of code. Explain
        //what is wrong with it, but why the program compiles
        //successfully with this left in.
        //Now remove it, as it is not needed in this method
        //anyway, and make changes in the other classes 
        //to prevent the program from compiling if it was left in.
        
        //car1.setCurrentFuelLevel(987654321);
        
        //TASK: make the cars race numberOfLaps amount of times
        //After each lap, print:
        //-the single lap time of each car
        //-the total time of each car
        //-name of the car that is leading the race
        int i = 1;
        while (i != numberOfLaps) {
            int car1LapTime = car1.completeLap();
            int car2LapTime = car2.completeLap();
            int car3LapTime = car3.completeLap();
            
            System.out.println("Lap " + i);
            System.out.println("The leader of the race is " + getRaceLeader().getName());
            System.out.println();
            System.out.println(car1.getName() + " lap time: " + car1LapTime);
            System.out.println(car1.getName() + " total time: " + car1.getTotalTime());
            System.out.println(car2.getName() + " lap time: " + car2LapTime);
            System.out.println(car2.getName() + " total time: " + car2.getTotalTime());
            System.out.println(car3.getName() + " lap time: " + car3LapTime);
            System.out.println(car3.getName() + " total time: " + car3.getTotalTime());
            
            i++;
            
        }
        
        
    }
    
    public int getAverageLapTime()
    {
        return averageLapTime;
    }
    
    public boolean getIsRaining()
    {
        return isRaining;
    }
}
