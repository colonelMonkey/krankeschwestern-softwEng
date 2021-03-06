package zufallsgenerator;

import java.util.HashMap;
import java.util.Map.Entry;

public class GeneratorTester
{
  private ZufallsgeneratorPrototyp testsubjekt;
  private HashMap<Integer, Integer> vorkommnisse = new HashMap<Integer, Integer>(100);
  public ZufallsgeneratorPrototyp getTestsubjekt()
  {
    return testsubjekt;
  }
  public HashMap<Integer, Integer> getVorkommnisse()
  {
    return vorkommnisse;
  }
  public void setTestsubjekt(ZufallsgeneratorPrototyp testsubjekt)
  {
    this.testsubjekt = testsubjekt;
  }
  public void setVorkommnisse(HashMap<Integer, Integer> vorkommnisse)
  {
    this.vorkommnisse = vorkommnisse;
  }
  int iterations;

  public GeneratorTester(ZufallsgeneratorPrototyp rndzor, int iterations)
  {
    this.iterations = iterations;
    testsubjekt = rndzor; 
    
    if(iterations < 1000)iterations = 1000;
    for (int i = 0; i < iterations; i++)
    {
      int erg = testsubjekt.getRnd();
      if((vorkommnisse.putIfAbsent(erg, 1))!=null) {
        vorkommnisse.put(erg,vorkommnisse.get(erg) + 1);
      }
    }
    for( Entry<Integer, Integer> entry : vorkommnisse.entrySet()) {
      System.out.println("Ereignis: " + entry.getKey() + "    Häufigkeit: " + Math.round((double)entry.getValue()/iterations*100)+"%");
    }
  }
   double getProbability(int occurance) {
     return (vorkommnisse.get(occurance)/iterations);
   }
/*
  public static void main(String[] args)
  {
    new GeneratorTester(new TesterTester(), 100000000);//läuft wie geplant und breitzum testen des zufallsgenerators
  }
*/
}
