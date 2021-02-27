package poc.spring.swagger;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.Assert.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private static Logger LOG = getLogger(lookup().lookupClass());
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
	LOG.info("App Test");
    }
}
