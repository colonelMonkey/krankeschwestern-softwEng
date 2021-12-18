package zufallsgenerator;

public abstract class ZufallsgeneratorPrototyp
{
  public TableDialog tDia;
  public ZufallsgeneratorPrototyp() {}
  public abstract int getRnd();
  public abstract int setSeed(int seed);
  public abstract int getSeed();
  public abstract void resetSequence();
  public abstract void showDialog();
  public abstract void forceClose();
  
}
