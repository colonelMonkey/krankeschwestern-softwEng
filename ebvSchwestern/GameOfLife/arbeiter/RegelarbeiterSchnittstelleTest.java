package arbeiter;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class RegelarbeiterSchnittstelleTest {

	@Test
	public void test() {
		
		  int [][] testBlinkerDiagonal1 = {{0,0,0,0},
				  						  {0,1,1,1},
				  						  {0,0,0,0},
				  						  {0,0,0,0}};

		  int [][] testBlinkerDiagonal2 = {{0,0,1,0},
					  					  {0,0,1,0},
					  					  {0,0,1,0},
					  					  {0,0,0,0}};


		  int [][] testBlinkerOhneDiagonal1 = {{0,0,0,0},
				  							  {0,1,1,1},
				  							  {0,0,0,0},
				  							  {0,0,0,0}};

		  int [][] testBlinkerOhneDiagonal2 = {{0,0,0,0},
				  							  {0,0,1,0},
				  							  {0,0,0,0},
				  							  {0,0,0,0}};	

		assertTrue(Arrays.equals(RegelarbeiterSchnittstelle.transit(testBlinkerDiagonal1), testBlinkerDiagonal2));
		assertTrue(Arrays.equals(RegelarbeiterSchnittstelle.transit(testBlinkerOhneDiagonal1), testBlinkerOhneDiagonal2));
	}

}
