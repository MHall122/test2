package sample.test2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sample.test2.App;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	logger.error("test");
        System.out.println( "Hello World!" );
        logger.error("Logger is working Correctly");
    }
}
