import org.example.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {
    @Test
    public void testSum() {
        Caculator calculator = new Caculator();
        Assert.assertEquals(calculator.sum(2, 3), 5);
    }

    @Test
    public void testSub() {
        Caculator calculator = new Caculator();
        Assert.assertEquals(calculator.sub(2, 2), 0);
    }
}
