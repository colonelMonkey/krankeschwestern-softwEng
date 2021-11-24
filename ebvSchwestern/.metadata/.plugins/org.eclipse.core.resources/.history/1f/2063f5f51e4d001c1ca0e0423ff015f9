package zufallsgenerator;

import java.util.HashMap;

public class GeneratorTester
{
  private ZufallsgeneratorSchnittstelle testsubjekt;
  private HashMap<Integer, Integer> vorkommnisse = new HashMap<Integer, Integer>(100);

  public GeneratorTester(Object rndzor, int iterations)
  {
    testsubjekt = (ZufallsgeneratorSchnittstelle) rndzor; 
    if(iterations < 1000)iterations = 1000;
    for (int i = 0; i < iterations; i++)
    {
      int erg = testsubjekt.getRnd();
      vorkommnisse.putIfAbsent(null, null)// mach mal später
    }
  }

  public static void main(String[] args)
  {

  }

}
