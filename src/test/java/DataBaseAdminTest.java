import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before() {
        dataBaseAdmin = new DataBaseAdmin("Joe Spencer", "SF33425D", 22000);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Spencer", dataBaseAdmin.getName());
    }

    @Test
    public void canGetNINum() {
        assertEquals("SF33425D", dataBaseAdmin.getNINum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(22000, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalaryByAmount() {
        assertEquals(22500, dataBaseAdmin.raiseSalary(500), 0.01);
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(220, dataBaseAdmin.payBonus(), 0.01);
    }
}
