
/**
 * Lab sheet 3 -- Member
 *
 * @Aaron Patrick Monte
 * @1.0.0.0
 */
public class Member
{
    // instance variables - replace the example below with your own
    private String name;
    private int year;
    private boolean isStudent;
    private int memberFor;
    private String temp;
    

    /**
     * Constructor for objects of class Member
     */
    public Member(String name, int year, boolean isStudent)
    {
        // initialise instance variables
        this.name = name;
        this.year = year;
        this.isStudent = isStudent;
    }

    /**
     * Return the name of a member
     */
    public String getName()
    {
        // 
        return name;
    }
    
    /**
     * Return the year of a member
     */
    public int getYear()
    {
        // 
        return year;
    }
    
    /**
     * Return whether or not the member is a student
     */
    public boolean getIsStudent()
    {
        // 
        return isStudent;
    }
    
    /**
     * Mutator method to update the member as student
     */
    public void setStudent()
    {
        // 
        isStudent = ! isStudent;
    }
    
    /**
     * Output method to display classes in the format "[Name], member since [year] [isStudent]"
     */
    public void show()
    {
        // 
        String details = name + ", member since" + year;
        if(isStudent == true) {
            details = " (student)";
        }
        if(memberYear() >= 10) {
            details += " (senior)";
        }
        System.out.println(details);
    }
    
    /**
     * Calculate the years someone has been a member for
     */
    public int memberYear()
    {
        // 
        memberFor = 2020 - year;
        return memberFor;
    }
}
