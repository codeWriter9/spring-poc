package com.ghosh.sanjay;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Logger LOG = getLogger(lookup().lookupClass());
	
    public static void main( String[] args )
    {
    	LOG.info( "Hello World!" );
    }
}
