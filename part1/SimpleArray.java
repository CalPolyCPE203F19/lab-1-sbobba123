class SimpleArray
{
   public static int [] squareAll(int values[]){
	      /* TO DO: This size is not right.  Fix it to work with any
 * 	         input array.  The length of an array is accessible through
 * 	         	         an array's length field (e.g., values.length).
 * 	         	         	      */
	      int [] newValues = new int[values.length];
         for(int i = 0; i < values.length; i++){
            newValues[i] = values[i] * values[i];
         }
         return newValues;

	   }
}
