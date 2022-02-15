package zufallsgenerator;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class GeneratorTesterTest {

    private GeneratorTester generatorTester;

    @Test
    public void getTestsubjektTest() {
        ZufallsgeneratorPrototyp prototyp = new Zufallsgenerator();
        generatorTester = new GeneratorTester(prototyp, 3);
        final ZufallsgeneratorPrototyp actual = generatorTester.getTestsubjekt();
        assertEquals(0, actual.getRnd());
        assertEquals(0, actual.getSeed());
    }

    @Test
    public void getVorkommnisseTest() {
        ZufallsgeneratorPrototyp prototyp = new Zufallsgenerator();
        generatorTester = new GeneratorTester(prototyp, 3);
        HashMap<Integer, Integer> actual = generatorTester.getVorkommnisse();
        assertEquals(1, actual.keySet().size());
        assertEquals(1000, actual.get(0).intValue());
    }

    @Test
    public void getProbabilityTest() {
        ZufallsgeneratorPrototyp prototyp = new Zufallsgenerator();
        generatorTester = new GeneratorTester(prototyp, 3);
        double actual = generatorTester.getProbability(0);
        assertEquals(333.0, actual, 0.01);
    }
}