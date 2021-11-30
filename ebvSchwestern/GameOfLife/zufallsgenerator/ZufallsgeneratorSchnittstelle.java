package zufallsgenerator;

public interface ZufallsgeneratorSchnittstelle
{
  public int getRnd();
  public void setSeed();
  public int getSeed();
  public void resetSequence();
  public void showDialog();
  public void forceClose();
  
}
