
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
  public static void main(String[] args) {
    String[] cars = {};
    
    if (cars != null) {
        String temp1 = cars[0];
        String temp2 = cars[cars.length-1];
        for (int i = 1; i < cars.length; i++) {
            cars[i-1] = cars[i];
        }
        cars[cars.length-1] = temp1;
        
        for (int i = 0; i < cars.length; i++) {
          System.out.println(cars[i]);
        }
    }
  }
}
