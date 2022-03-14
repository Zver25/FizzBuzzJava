package beast;

import org.junit.Assert;
import org.junit.Test;
import beast.condition.DivCondition;
import beast.value.Number;

public class DivConditionTest {

    @Test
    public void testIsTruthy() {

        DivCondition condition = new DivCondition(3);

        Assert.assertTrue("9 div 3", condition.isTruthy(new Number(9)));
        Assert.assertFalse("10 div 3", condition.isTruthy(new Number(10)));
    }

}