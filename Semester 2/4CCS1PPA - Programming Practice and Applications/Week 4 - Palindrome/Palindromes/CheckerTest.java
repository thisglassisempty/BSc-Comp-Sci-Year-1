

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CheckerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CheckerTest
{
    /**
     * Default constructor for test class CheckerTest
     */
    public CheckerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void isPalindrome() 
    {
        Checker checker = new Checker("Go hang a salami, I'm a lasagna hog.");
        assertEquals(true, checker.checkPalindrome());
    }
    
    @Test
    public void isTwoCharactersNotPalindrome() 
    {
        Checker checker = new Checker("ij");
        assertEquals(false, checker.checkPalindrome());
    }
    
    @Test
    public void isTwoCharactersPalindrome() 
    {
        Checker checker = new Checker("ii");
        assertEquals(true, checker.checkPalindrome());
    }
    
    @Test
    public void isOneCharacter() 
    {
        Checker checker = new Checker("i");
        assertEquals(false, checker.checkPalindrome());
    }
    
    @Test
    public void isEmptyString() 
    {
        Checker checker = new Checker("");
        assertEquals(false, checker.checkPalindrome());
    }
}
