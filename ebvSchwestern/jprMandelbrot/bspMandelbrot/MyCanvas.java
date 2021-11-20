package bspMandelbrot;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.scene.paint.Color;

public class MyCanvas extends Canvas
{
  BufferedImage img = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
  
  public MyCanvas()
  {
    
  }
  
  public void paint( Graphics g )
  {
    super.paint(g);
    g.drawImage(img, 0, 0, this);
    //speichern
    /*/
    File outputfile = new File("daten\\frac.jpg");
    try
    {
      ImageIO.write(img, "jpg", outputfile);
    }
    catch (IOException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    /*/
  }
  
  public void setBright(int x , int y, int br)
  {
    img.setRGB(x, y, grayscale(br));
  }
  
  private int grayscale(int brightness)
  {
    int r = brightness;
    int g = brightness;
    int b = brightness;
    int col = (r << 16) | (g << 8) | b;
    return col;
  }

}
