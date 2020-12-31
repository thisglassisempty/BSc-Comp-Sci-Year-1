import java.util.HashSet;
import java.util.HashMap;
/**
 * Write a description of class Set here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Set
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Set
     */
    public Set()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void test()
    {
        // put your code here
        HashSet<Integer> mySet = new HashSet<>();
        
        mySet.add(3);
        mySet.add(4);
        mySet.add(3);
        mySet.add(1);
        System.out.println(mySet.size());
        
        HashMap<Integer, String> myMap = new HashMap<>();
        
        myMap.put(2,"Tiger");
        myMap.put(2,"Lion");
        
        System.out.println(myMap.get(2));
    }
}
