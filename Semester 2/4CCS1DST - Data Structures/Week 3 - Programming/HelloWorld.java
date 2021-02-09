import java.util.Arrays;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{
     public int[][] countOnes()
     {
         int[][] array = {   
                            {1, 0, 1, 1, 0}, 
                            {0, 1, 0, 1, 0}, 
                            {1, 1, 1, 0, 1}, 
                            {1, 1, 0, 0, 1}, 
                            {0, 0, 1, 1, 0}
                        };
         int count = 0;
         
         int[][] oneCount = array;
         
         for (int i = 0; i < array.length; i++) {
         
             for (int j = 0; j < array[i].length; j++) {
                 
                 if (array[i][j] == 1) {
                     count++;
                 }
                 oneCount[i][j] = count;
             }
         }
         
         System.out.println(Arrays.deepToString(array));
         return oneCount;
     }
}
