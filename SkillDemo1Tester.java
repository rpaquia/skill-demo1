import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Tester {
    @Test
    public void multiplication() {
        assertEquals(6, SkillDemo1.multiply(2, 3));
    }
}