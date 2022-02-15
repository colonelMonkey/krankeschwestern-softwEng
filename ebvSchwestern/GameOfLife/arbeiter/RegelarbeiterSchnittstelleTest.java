package arbeiter;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class RegelarbeiterSchnittstelleTest {

	@Test
	
	/**
	 * Der Test deckt folgende Situationen ab:
	 * 
	 * 	Ein Blinker wird als Array initialisiert. Dabei wird die einfachste Form eines Blinkers verwendet, der nach zwei Transitionen
	 * 	wieder im Ausgangszustand ist.
	 * 	Ein weiteres Array wird initialisiert, welches den Zustand des ersten Arrays nach einer Transition entspricht.
	 * 
	 * 	Der Test erfolgt dann entsprechend einfach: Das Ausgangs Array widerfährt einer Transition. Nun wird geprüft, ob das Ausgangsarray 
	 * 	nun den gleichen Zustand wie das zweite Array hat. Ist dem so, wurde die Transitionsmethode korrekt implementiert. Andernfalls liegt
	 * 	ein Fehler vor.
	 *  
	 *  Der Test deckt sowohl eine Transitionsregel mit Diagonale (testBlinkerDiagonal1 & 2) sowie ohne Diagonale
	 *  (testBlinkerOhneDiagonal1 & 2) ab. Diese sind entsprechend gekennzeichnet.
	 */
	public void test() {

		// Ausgangsarray MIT diagonaler Regel
		int[][] testBlinkerDiagonal1 = { 
				{ 0, 0, 0, 0 }, 
				{ 0, 1, 1, 1 }, 
				{ 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0 } 
		};

		// Korrektes Array nach einmaliger Transition des Ausgangsarrays MIT diagonaler Regel
		int[][] testBlinkerDiagonal2 = { 
				{ 0, 0, 1, 0 }, 
				{ 0, 0, 1, 0 }, 
				{ 0, 0, 1, 0 }, 
				{ 0, 0, 0, 0 } 
		};

		
		
		// Ausgangsarray OHNE diagonaler Regel
		int[][] testBlinkerOhneDiagonal1 = { 
				{ 0, 0, 0, 0 }, 
				{ 0, 1, 1, 1 }, 
				{ 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0 } 
		};

		// Korrektes Array nach einmaliger Transition des Ausgangsarrays OHNE diagonaler Regel
		int[][] testBlinkerOhneDiagonal2 = { 
				{ 0, 0, 0, 0 }, 
				{ 0, 0, 1, 0 }, 
				{ 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0 } 
		};

		
		
		// Annahme: Nach einmaliger Transition ist testBlinkerDiagonal1 im gleichen Zustand wie testBlinkerDiagonal2
		assertTrue(Arrays.equals(RegelarbeiterSchnittstelle.transit(testBlinkerDiagonal1), testBlinkerDiagonal2));
		
		
		// Annahme: Nach einmaliger Transition ist testBlinkerOhneDiagonal1 im gleichen Zustand wie testBlinkerOhneDiagonal2.
		assertTrue(Arrays.equals(RegelarbeiterSchnittstelle.transit(testBlinkerOhneDiagonal1), testBlinkerOhneDiagonal2));
	}

}