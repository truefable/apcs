
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
     int gm = Math.sqrt(a * b);
     return gm;
  }

  public static double geoMean(double a, double b) {

  }

  public static int max(int a, int b, int c) {

  }

  public static double max(double a, double b, double c) {

  }

  public static int geoMean(int a, int b, int c) {

  }

  public static double geoMean(double a, double b, double c) {

  }


  //main method for testing functionality
  public static void main( String[] args ) {

  }

}//end class
