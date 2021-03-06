package zufallsgenerator;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTestGenerator
{
  static GeneratorTester  generationTester;
  
  @BeforeClass
  public static void init() {
    JOptionPane.showMessageDialog(null,"In dem Dialogfenster bitte Hinzufügen drücken, von 1 bis 3 gewicht 1 eingeben und 2*übernehmen! Und nochmal für 4 bis 6.");
    generationTester = new GeneratorTester(new TesterTester(), 10000);
  }

  @Test
  public void Wahscheinlichkeitstest()
  {
    //fail("Not yet implemented");
    
    generationTester.getTestsubjekt().showDialog();
    for (int i = 1; i <= 6; i++)
    {
      assertEquals((double)Math.round(generationTester.getProbability(i)*10)/10.0, 1.0/6.0);//Wahrscheinlichkeit für i ~ 1/6
    } 
  }
  @Test
  public void Reinheitstest()
  {
    for (int j = 1; j <= 6; j++)
    {
      assertTrue(generationTester.getVorkommnisse().keySet().contains((Integer)j));
    }
    assertFalse(generationTester.getVorkommnisse().keySet().contains((Integer)0));
    assertFalse(generationTester.getVorkommnisse().keySet().contains((Integer)7));
  }

}
