/**
   Clyde "Thluffy" Sinclair
   APCS
   HW20 --
   2021-10-21
   TASK:
   Implement each method without typecasting.
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
 **/

public class Stats {

  public static int mean(int a, int b) {
     int avg = (1/2) * (a + b);
     return avg;
  }

  public static double mean(double a, double b) {
     double avg = (1/2) * (a + b);
     return avg;
  }

  public static int max(int a, int b) {
     int m = (1/2) * (a + b) + (1/2) * Math.abs(a - b);
     return m;
  }

  public static double max(double a, double b) {
     double m = (1/2) * (a + b) + (1/2) * Math.abs(a - b);
     return m;
  }

  public static int geoMean(int a, int b) {
     
  }

  public static double geoMean(double a, double b) {
	  double gm = Math.sqrt(a * b);
	  return gm;
  }

  public static int max(int a, int b, int c) {
	  if (a = b) {
		  if (a = c) {
			  return a;
		  } else if (a > c) {
			  return a;
		  } else {
			  return c;
		  }
	  } else if (a > b) {
		  if (a = c) {
			  return a;
		  } else if (a > c) {
			  return a;
		  } else {
			  return c;
		  }
	  } else {
		  if (b = c) {
			  return b;
		  } else if (b > c) {
			  return b;
		  } else {
			  return c;
		  }
	  }
  }

  public static double max(double a, double b, double c) {
	  if (a = b) {
		  if (a = c) {
			  return a;
		  } else if (a > c) {
			  return a;
		  } else {
			  return c;
		  }
	  } else if (a > b) {
		  if (a = c) {
			  return a;
		  } else if (a > c) {
			  return a;
		  } else {
			  return c;
		  }
	  } else {
		  if (b = c) {
			  return b;
		  } else if (b > c) {
			  return b;
		  } else {
			  return c;
		  }
	  }
  }

  public static int geoMean(int a, int b, int c) {
  }

  public static double geoMean(double a, double b, double c) {
	  gm = Math.cbrt(a * b * c);
	  return gm;
  }


  //main method for testing functionality
  public static void main( String[] args ) {

  }

}//end class