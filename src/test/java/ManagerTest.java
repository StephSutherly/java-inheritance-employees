import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob Tavernski", "SC22389C", 35000, "Human Resources");
    }

    @Test
    public void canGetName() {
        assertEquals("Bob Tavernski", manager.getName());
    }

    @Test
    public void canGetNINum() {
        assertEquals("SC22389C", manager.getNINum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(35000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Human Resources", manager.getDeptName());
    }

    @Test
    public void canRaiseSalaryByAmount() {
        assertEquals(40000, manager.raiseSalary(5000), 0.01);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(350, manager.payBonus(), 0.01);
    }
}
