package zufallsgenerator;

import java.util.HashMap;
import java.util.Map.Entry;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("feb6c803-5a37-4b4d-8803-91078a3e717b")
public class GeneratorTester {
    @objid ("c915399f-5b02-48c6-ad77-c5179bf5ccdd")
    private HashMap<Integer, Integer> vorkommnisse = new HashMap<Integer, Integer>(100);

    @objid ("4d6d36ce-fd04-4db8-bdbf-95b54cd824fd")
    private ZufallsgeneratorPrototyp testsubjekt;

    @objid ("b56e7b13-7f33-404a-8bc0-7b0fd21a3028")
    public GeneratorTester(ZufallsgeneratorPrototyp rndzor, int iterations) {
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

    @objid ("706e628e-51f7-4f6d-8141-3770d5d6cc99")
    public static void main(String[] args) {
        new GeneratorTester(new TesterTester(), 100000000);//läuft wie geplant und breitzum testen des zufallsgenerators
    }

}
