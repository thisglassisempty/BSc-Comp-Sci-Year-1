
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private boolean isAfternoon;      // determines whether or not it is afternoon
    private String displayString;
    private String temp;
    public ClockDisplay()
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        isAfternoon = false; 
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute, boolean isAfternoon)
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        this.isAfternoon = isAfternoon;
        setTime(hour, minute, isAfternoon);
    }

    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {    // it just rolled over!
            hours.increment();
            if(hours.getValue() == 0) {  // if hours roll over,
                isAfternoon = ! isAfternoon;  // change isAfternoon to the opposite value
            }
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute, boolean isAfternoon)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        this.isAfternoon = isAfternoon;
        updateDisplay();
    }

    public String getTime()
    {
        return displayString;
    }

    private void updateDisplay()
    {
        temp = "AM";
        if(isAfternoon == true) {
            temp = "PM";
        }
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue() + temp;
    }
}