
/**
 * Write a description of class Screen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Screen
{
    // instance variables - replace the example below with your own
    private int screenID;
    private final int SEATCOUNT = 50;
    private String movieTitle;
    private int movieCost;
    private int availableSeats = 50;
    

    /**
     * Constructor for objects of class Screen
     */
    public Screen(int screenID, String movieTitle, int movieCost)
    {
        // initialise instance variables
        this.screenID = screenID;
        this.movieTitle = movieTitle;
        this.movieCost = movieCost;
    }

    /**
     * emptyScreen
     */
    public void emptyScreen()
    {
        // put your code here
        availableSeats = SEATCOUNT;
    }
    
    public void book(int row, int seatNumber)
    {
        
    }
}
