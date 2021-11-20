package bspMandelbrot;

import java.math.BigInteger;

public class Verarbeitung
{
  public Verarbeitung() { }
  
  private BigInteger bI = new BigInteger("999999999999999999999999999999999999999999999999999999999999999999");
  private double border = 2;
  
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
    else if (iteration == 255)//probably wont reach infinity
    {
      return -1;
    }
    else {
      return rekMandelbrot(nextZ, c, iteration);//recursion
    }  
  }
  
  private Complex addCx(Complex z, Complex c)//mandelbrot addidion z² + c
  {
    Complex zSq = new Complex( (z.getReal() * z.getReal()) - (z.getImaginary() * z.getImaginary()) , (2 * z.getReal() * z.getImaginary()) );
    Complex erg = new Complex(zSq.getReal() + c.getReal(), zSq.getImaginary() + c.getImaginary());
    return erg;
  }
  
  public void testBI(MainPanel mp) 
  {
    int yOffset = -mp.getCanvas().getHeight()/2+MainPanel.yoff;
    int xOffset = mp.getCanvas().getWidth()/2+MainPanel.xoff;
    for (int x = 0; x < mp.getCanvas().getWidth(); x++)
    {
      for (int y = 0; y < mp.getCanvas().getHeight(); y++)
      {
        int xC = x-xOffset;
        int yC = y+yOffset;
        //generate c
        double z = xC * (MainPanel.scale*1.6/mp.getCanvas().getWidth());
        double i = yC * (MainPanel.scale*0.9/mp.getCanvas().getHeight());
        int mandel = rekMandelbrot(new Complex(0, 0), new Complex(z, i), 0);
        
        if(mandel > 0)
        {
          mp.getCanvas().setBright(x, y, 255-mandel);
        }
        
        else mp.getCanvas().setBright(x, y, 0);
        
      }
    }
    mp.getCanvas().repaint();
    
  }
}
