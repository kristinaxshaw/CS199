// Kristina Shaw
// CS 176L
// Interface Version 1

// establishing a public class
public class Data
{
 
     // Computes the average of the measures of the given objects.
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0)
      {
         return sum / objects.length;
      }
      else
      {
         return 0;
      }
   }

      // Computes the maximum of the measures of the given objects.

   public static double max(Measurable[] objects)
   {
      if (objects.length == 0)
      {
         return 0;
      }
      // Measurable max = objects[0];
      double max = 0;
      for (Measurable obj : objects)
      {
         if (obj.getMeasure() > max)
         {
            max = obj.getMeasure();
         }
      }

      return max;
   }

	   // Computes the maximum of the measures of the given objects.
	public static double min(Measurable[] objects)
	{
	   if (objects.length == 0)
	   {
	      return 0;
	   }
	   // Measurable max = objects[0];
	   double min = Integer.MAX_VALUE;
	   for (Measurable obj : objects)
	   {
	      if (obj.getMeasure() < min)
	      {
	         min = obj.getMeasure();
	      }
	   }
	
	   return min;
	}
}