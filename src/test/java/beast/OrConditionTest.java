package beast;

import org.junit.Assert;
import org.junit.Test;
import beast.condition.Condition;
import beast.condition.OrCondition;
import beast.value.Number;

public class OrConditionTest {

    @Test
    public void testTestIsTruthy() {
        Condition trueCondition = num -> true;

        Condition falseCondition = num -> false;

        Assert.assertFalse("false or false = false", new OrCondition(new Condition[]{falseCondition, falseCondition}).isTruthy(new Number(0)));
        Assert.assertTrue("false or true = true", new OrCondition(new Condition[]{falseCondition, trueCondition}).isTruthy(new Number(0)));
        Assert.assertTrue("true or false = true", new OrCondition(new Condition[]{trueCondition, falseCondition}).isTruthy(new Number(0)));
        Assert.assertTrue("true or true = true", new OrCondition(new Condition[]{trueCondition, trueCondition}).isTruthy(new Number(0)));
    }
}