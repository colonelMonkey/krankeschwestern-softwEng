package aufg0250;

public final class MyMath
{
  private MyMath() {}//Privater Konstruktor 
  
  public static double sin(double x)
  {
    return Math.sin(x);
  }
  public static double cos(double x)
  {
    return Math.cos(x);
  }
  public static double tan(double x)
  {
    return Math.tan(x);
  }
  public static double cot(double x)
  {
    return 1/Math.tan(x);
  }
  public static double sinh(double x)
  {
    return Math.sinh(x);
  }
  public static double cosh(double x)
  {
    return Math.cosh(x);
  }
  public static double tanh(double x)
  {
    return Math.tanh(x);
  }
  public static double coth(double x)
  {
    return 1/Math.tanh(x);
  }
  public static double ln(double x)
  {
    return Math.log(x);//Tatsächlich der ln
  }
  public static double exp(double x)
  {
    return Math.exp(x);
  }
  public static double log(double x)
  {
    return Math.log(x)/Math.log(10);
  }
  public static double exp10(double x)
  {
    return Math.pow(10,x);
  }
  /**
   * Rounds the double value x to n places. Negative values for n work.
   * @param x
   * @param n
   * @return double n rounded to n places
   */
  public static double round(double x, int n) 
  {
    double round = x - x % Math.pow(10, -n);
    if(x % Math.pow(10, -n) >= 5*Math.pow(10, -(n+1))) 
    {
      round += Math.pow(10, -n);
    }
    return round;
  }
}
