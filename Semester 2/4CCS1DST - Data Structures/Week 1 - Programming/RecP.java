
/**
 * RecP
 * 
 * @author Aaron Patrick Monte
 * @version 24.01.2021
 */
public class RecP
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class recP
     */
    public RecP()
    {
    }

    /**
     * recP
     */
    public int recP(int n)
    {
        if (n < 3) {
            return 1;
        }
        else {
            return (recP(n-3) * recP(n-1)) + 1; 
        }
    }
}
