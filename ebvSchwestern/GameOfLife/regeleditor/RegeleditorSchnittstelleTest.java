package regeleditor;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class RegeleditorSchnittstelleTest {
	
	private static Regeleditor regeleditor;
	
	static {
		regeleditor = new Regeleditor();
	}

	@Test
	public void test() {
		
	}
	
	@Test
	/** 
	 * Pflichtenheft Seite 28 4.3 Regeleditor: "Blick auf Speichern"
	 * 
	 * Hier w�rde die entsprechende Speicherfunktion getestet werden.
	 * 
	 * Die Methode "re_speichern" des Regeleditors w�rde den gesamten Ablauf simulieren. Gibt er false zur�ck, hat der Test geklappt: 
	 * Die Datei wurde nicht gespeichert und der Test ist OK. Wird true zur�ckgegeben, hat der Test versagt, weil (nach Pflichtenheft) die
	 * Datei nicht h�tte gespeichert werden d�rfen. 
	 */
	public void regelditorSaveTest() {
		assertFalse(regeleditor.re_speichern());
	}
	
	
	@Test
	/**
	 * 
	 */
	public void failOnLoadFileWithoutRights() {
		
	}
}