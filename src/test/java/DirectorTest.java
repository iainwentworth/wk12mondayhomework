import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Alistair", "KL871647T", 230000, "Leadership Team", 5000000);
    }

    @Test
    public void hasName() {
        assertEquals("Alistair", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("KL871647T", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(230000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Leadership Team", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.05);
        assertEquals(241500, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2300, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(5000000, director.getBudget(), 0.01);
    }
}
