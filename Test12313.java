

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test12313.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test12313
{
    private Granja granja1;
    private Pollo pollo1;
    private Pato pato1;
    private Cerdo cerdo1;
    private Vaca vaca1;

    /**
     * Default constructor for test class Test12313
     */
    public Test12313()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        granja1 = new Granja();
        pollo1 = new Pollo();
        pato1 = new Pato();
        cerdo1 = new Cerdo();
        vaca1 = new Vaca();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
