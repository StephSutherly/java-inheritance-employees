import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Sally Reubens", "SC22657C", 31000);
    }

    @Test
    public void canGetName() {
        assertEquals("Sally Reubens", developer.getName());
    }

    @Test
    public void canGetNINum() {
        assertEquals("SC22657C", developer.getNINum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(31000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalaryByAmount() {
        assertEquals(35000, developer.raiseSalary(4000), 0.01);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(310, developer.payBonus(), 0.01);
    }
}

