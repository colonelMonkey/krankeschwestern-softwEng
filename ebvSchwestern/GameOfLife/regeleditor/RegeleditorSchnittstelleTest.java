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
	 * Hier würde die entsprechende Speicherfunktion getestet werden.
	 * 
	 * Die Methode "re_speichern" des Regeleditors würde den gesamten Ablauf simulieren. Gibt er false zurück, hat der Test geklappt: 
	 * Die Datei wurde nicht gespeichert und der Test ist OK. Wird true zurückgegeben, hat der Test versagt, weil (nach Pflichtenheft) die
	 * Datei nicht hätte gespeichert werden dürfen. 
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