import java.util.List;
import java.util.LinkedList;

class SimpleList
{
   public static List<Integer> squareAll(List<Integer> values)
   {
      List<Integer> newValues = new LinkedList<Integer>();
      for(int value: values){
         int square = (int) Math.round(Math.pow(value, 2));
         newValues.add(square); 
      }
      /* TO DO: The output list, newValues, should hold as
         its elements the square of the corresponding element
         in the input list.

         Write a loop to add the square of each element from the
         input list into the output list.  Use a "foreach".
      */

      return newValues;
   }
}
