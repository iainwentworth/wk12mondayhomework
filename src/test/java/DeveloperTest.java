import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("John", "HK831947F", 45000);
    }

    @Test
    public void hasName() {
        assertEquals("John", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("HK831947F", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(45000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.05);
        assertEquals(47250, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(450, developer.payBonus(), 0.01);
    }
}
