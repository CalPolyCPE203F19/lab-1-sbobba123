class BetterLoop
{
   public static boolean contains(int [] values, int v)
   {
      for(int check: values){
         if(check == v){
             return true;
         }
      }
	   return false;
    // A bit optimistic, but a real boolean value.
	       // 	   }
   }
}
