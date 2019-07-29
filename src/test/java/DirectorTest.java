import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Annabelle Darling", "PH33759F", 60500, "Sales", 20000);
    }

    @Test
    public void canGetName() {
        assertEquals("Annabelle Darling", director.getName());
    }

    @Test
    public void canGetNINum() {
        assertEquals("PH33759F", director.getNINum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(60500, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canRaiseSalaryByAmount() {
        assertEquals(63000, director.raiseSalary(2500), 0.01);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(1210, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudgest() {
        assertEquals(20000, director.getBudget(), 0.01);
    }

    @Test
    public void canChangeName() {
        director.setName("Annabelle Jones");
        assertEquals("Annabelle Jones", director.getName());
    }
}
