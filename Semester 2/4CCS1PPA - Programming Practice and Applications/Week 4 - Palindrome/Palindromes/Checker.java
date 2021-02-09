
/**
 * Write a description of class Checker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Checker
{
    // instance variables - replace the example below with your own
    private String sentence;
    private int i;
    private int j;

    /**
     * Constructor for objects of class Checker
     */
    public Checker(String sentence)
    {
        // initialise instance variables
        this.sentence = sentence;
    }

    /**
     * 
     */
    public boolean checkPalindrome(int i, int j)
    {
        String[] typesetSentence = sentence.toLowerCase().replaceAll("\\p{P}", "").split("");
        
        boolean isPalindrome = false;
        i = 0;
        j = typesetSentence.length - 1;
        if (i < j) {      //Checks if even
            if (typesetSentence[i].equals(typesetSentence[j]) && isPalindrome) {
                isPalindrome = true;
                return checkPalindrome(i + 1, j - 1);
            }
            else return isPalindrome = false;
            
        }
        return isPalindrome;
    }
}
