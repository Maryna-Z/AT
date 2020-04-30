package tests;

import DAY4.entity.AutomatedMyTest;
import DAY4.entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import DAY4.worker.AutomationEngineer;
import DAY4.worker.Engineer;
import DAY4.worker.TestEngineer;

public class SimpleATestTests {

    private Engineer testEngineer = new TestEngineer();
    private Engineer automationEngineer = new AutomationEngineer();

    @Test
    public void instabilityLessNull() {
        AutomatedMyTest autoTest = new AutomatedMyTest(TestLevel.API, 0);
        Assert.assertEquals("If instability %d less than null instability = %d", 0, autoTest.getInstability());
    }
    @Test
    public void instabilityMore10() {
        AutomatedMyTest autoTest = new AutomatedMyTest(TestLevel.API, 11);
        Assert.assertEquals("If instability %d more than 10 instability = %d", 10, autoTest.getInstability());
    }
    @Test
    public void instabilityBetween1and10() {
        AutomatedMyTest autoTest = new AutomatedMyTest(TestLevel.API, 9);
        Assert.assertEquals("If instability %d value in a range between 1 and 10 instability = %d", 9, autoTest.getInstability());
    }
}
