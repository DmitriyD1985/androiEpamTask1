import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMain {
    @Test
    public void checkChecker() throws Exception {
        assertEquals("Являются перестановкой", Main.checker("abc","cba"));
        assertNotEquals("Являются перестановкой", Main.checker("abC","cba"));
        assertNotEquals("Являются перестановкой", Main.checker("qqqQ","qqqq"));
        assertNotEquals("Являются перестановкой", Main.checker("abc","cba "));
    }
}
