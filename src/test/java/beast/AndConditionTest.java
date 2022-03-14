package beast;

import org.junit.Assert;
import org.junit.Test;
import beast.condition.AndCondition;
import beast.condition.Condition;
import beast.value.Number;

public class AndConditionTest {

    @Test
    public void testTestIsTruthy() {
        Condition trueCondition = num -> true;

        Condition falseCondition = num -> false;

        Assert.assertFalse("false and false = false", new AndCondition(new Condition[]{falseCondition, falseCondition}).isTruthy(new Number(0)));
        Assert.assertFalse("false and true = false", new AndCondition(new Condition[]{falseCondition, trueCondition}).isTruthy(new Number(0)));
        Assert.assertFalse("true and false = false", new AndCondition(new Condition[]{trueCondition, falseCondition}).isTruthy(new Number(0)));
        Assert.assertTrue("true and true = true", new AndCondition(new Condition[]{trueCondition, trueCondition}).isTruthy(new Number(0)));
    }
}