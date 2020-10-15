
/**
 * Drink class for all the drinks in a bar
 *
 * @Aaron Patrick Monte 
 * @1.0.0 (7/10/2020)
 */
public class Drink
{
    // instance variables - replace the example below with your own
    private String name;
    private int price;
    private Boolean isAlcoholic;
    private int counter;
    

    /**
     * Constructor for objects of class Drink
     */
    public Drink(String inName, int inPrice, Boolean inIsAlcoholic)
    {
        // initialise instance variables
        name = inName;
        price = inPrice;
        isAlcoholic = inIsAlcoholic;
        counter = 0;
        
    }

    /**
     * getPrice gets the price of the drink
     */
    public int getPrice()
    {
        // put your code here
        return price;
    }
    
    /**
     * getIsAlcohlic returns whether or not the drink is alcoholic
     */
    public Boolean getIsAlcoholic()
    {
        // put your code here
        return isAlcoholic;
    }
    
    /**
     * getCounter returns the count of the drink
     */
    public int getCounter()
    {
        // put your code here
        return counter;
    }
    
    /**
     * recordSale records the sale (increases the counter by 1)
     */
    public void recordSale()
    {
        // put your code here
        counter = counter + 1;
    }
    
    /**
     * reset resets the counter
     */
    public void reset()
    {
        // put your code here
        counter = 0;
    }
}
