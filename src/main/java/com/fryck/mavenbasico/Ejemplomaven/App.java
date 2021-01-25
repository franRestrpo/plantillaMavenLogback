package com.fryck.mavenbasico.Ejemplomaven;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger logger = LoggerFactory.getLogger(App.class);
    
    public static void main( String[] args )
    {
    	logger.info("Example log from {}", App.class.getSimpleName());
        logger.debug("Hello world.");
        logger.warn("Hello world.!!");
    }
}
