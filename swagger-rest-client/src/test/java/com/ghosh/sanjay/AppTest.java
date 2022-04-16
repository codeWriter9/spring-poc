package com.ghosh.sanjay;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.slf4j.Logger;

/**
 * Unit test for simple App.
 */
@ExtendWith(SpringExtension.class)
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
    }
}
