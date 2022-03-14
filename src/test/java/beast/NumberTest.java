package beast;

import org.junit.Assert;
import org.junit.Test;
import beast.value.Number;

public class NumberTest {
    @Test
    public void testGetLabel() {
        Number number = new Number(1);
        Assert.assertEquals(number.getLabel(), "1");
    }

    @Test
    public void testGetNumber() {
        Number number = new Number(1);
        Assert.assertEquals(number.getNumber(), 1);
    }
}