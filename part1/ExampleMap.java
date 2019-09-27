import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      List<String> overEnrolledStudents = new LinkedList<>();
      //List<String> map_keys = courseListsByStudentName.keySet();
      for(String key: courseListsByStudentName.keySet()){
         List <Course> cs_list = courseListsByStudentName.get(key);
         int temp_units = 0;
         for(Course c1: cs_list){
            int unit = c1.getNumUnits();
            temp_units += unit;
         }

         if(temp_units > unitThreshold){ 
            overEnrolledStudents.add(key); 
         }
      }
      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */

      return overEnrolledStudents;      
   }
}
