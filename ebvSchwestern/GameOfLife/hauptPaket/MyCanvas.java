package hauptPaket;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MyCanvas extends Canvas
{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  BufferedImage img;
  double fillrate = 0.01;
  
  public MyCanvas() {
    super();
  }
  
  public MyCanvas(int width, int height)
  {
    super();
    img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    for (int x = 0; x < width; x++)
    {
      for (int y = 0; y < height; y++)
      {
        
        setBright(x, y, (Math.random()<fillrate)? 255 : 0);
      }
    }
  }
  public void setBoundsG(int x, int y, int width, int height)
  {
    this.setBounds(x, y, width, height);
    img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    for (int i = 0; i < width; i++)
    {
      for (int j = 0; j < height; j++)
      {
        
        setBright(i, j, (Math.random()<fillrate)? 255 : 0);
      }
    }
  }
  
  public void paint( Graphics g )
  {
    super.paint(g);
    g.drawImage(img, 0, 0, this);
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
