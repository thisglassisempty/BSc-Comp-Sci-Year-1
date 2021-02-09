/**
 * IterativeReverseArray
 * 
 * @author Aaron Patrick Monte
 * @version 24.01.2021
 */
public class IterativeReverseArray
{
    // instance variables - replace the example below with your own
    private int[] x = {5, 8, 9, 3, 6, 1};
    private int j = x.length - 1;
    
    /**
     * Constructor for objects of class IterativeReverseArray
     */
    public IterativeReverseArray(){
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
        
        for (int i = 0; i < x.length; i++) {
            if (i < j) {
                temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                
                j = j - 1;
            }
        }
    }
}
