/**
 * ReverseArray
 * 
 * @author Aaron Patrick Monte
 * @version 24.01.2021
 */
public class ReverseArray
{
    // instance variables - replace the example below with your own
    private int[] x = {5, 8, 9, 3, 6, 1};
    private int i = 0;
    private int j = x.length - 1;
    
    /**
     * Constructor for objects of class ReverseArray
     */
    public ReverseArray(){
    }
    
    /**
     * Output the array
     */
    public void printArray()
    {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    
    /**
     * Reverse the array using recursion
     */
    public void reverseArray(){
        int temp; // Used to temporarily store the value of x[i] to perform the swap.
        
        if (i < j) {
            temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            
            i = i + 1; //increment values
            j = j - 1;
            
            reverseArray();
        }
    }
}
