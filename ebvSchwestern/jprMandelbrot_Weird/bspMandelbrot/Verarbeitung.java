package bspMandelbrot;

public class Verarbeitung
{
  public Verarbeitung() { }
  
  private double border = 1.55;
  
  private class Complex //inner class for handling complex numbers
  {
    //variables
    private double real = 0;
    private double imaginary = 0;
    private double abs = -1;
    
    //getters
    public double getReal()
    {
      return real;
    }
    public double getImaginary()
    {
      return imaginary;
    }
    public double getAbs()
    {
      if(abs == -1)
      {
        abs = calcAbs();
      }
      return abs;
    }
    
    
   //functions
    public Complex(double r, double i)
    {
      real = r;
      imaginary = i;
    }
    private double calcAbs()
    {
      return Math.sqrt((real * real) + (imaginary * imaginary));
    }
  }
  
  private int rekMandelbrot(Complex z, Complex c, int iteration)
  {
    iteration++;
    Complex nextZ = addCx(z, c);
    if(nextZ.getAbs() >=border)//Infinity
    {
      return iteration;
    }
    else if (iteration == 1000)//probably wont reach infinity
    {
      return -1;
    }
    else {
      return rekMandelbrot(nextZ, c, iteration);//recursion
    }  
  }
  
  private Complex addCx(Complex z, Complex i)//mandelbrot addidion z² + c
  {
    Complex erg = new Complex(z.getReal() * z.getReal() + i.getReal(), z.getImaginary() * z.getImaginary() + i.getImaginary());
    return erg;
  }
  
  public void testBI(MainPanel mp) 
  {
    int xres = 1920*2;
    int yres = 1080*2;
    int max = 0;
    int yOffset = -yres/2;
    int xOffset = xres/2;
    for (int x = 0; x < xres; x++)
    {
      for (int y = 0; y < yres; y++)
      {
       //System.out.println("("+x+"/"+y+")");
        int xC = x-xOffset;
        int yC = y+yOffset;
        //generate c
        double z = xC * (2.0*border/xres);
        double i = yC * (2.0*border/yres);
        int mandel = rekMandelbrot(new Complex(0, 0), new Complex(z, i), 0);
        //System.out.println(mandel);
        if(mandel > max)max = mandel;
        
        if(mandel > 0)
        {
          int border = 18;
          for(int j = 1; j < border; j++) {
            if(mandel == j)
            mp.getCanvas().setBright(x, y, 180-j*180/border);
          }
        }
        
        else mp.getCanvas().setBright(x, y, 0);
        
      }
    }
    System.out.println("max = "+max);
    mp.getCanvas().repaint();
    
  }
}
