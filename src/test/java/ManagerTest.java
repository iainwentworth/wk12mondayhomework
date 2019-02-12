import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Iain", "JL173827G", 65000, "Top Secret Projects");
    }

    @Test
    public void hasName() {
        assertEquals("Iain", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JL173827G", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(65000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Top Secret Projects", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.05);
        assertEquals(68250, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(650, manager.payBonus(), 0.01);
    }
}
