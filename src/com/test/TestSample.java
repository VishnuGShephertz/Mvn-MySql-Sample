/**
 * 
 */
package com.test;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Vishnu
 *
 */
public class TestSample extends TestCase{
	

	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestSample( String testName )
    {
        super( testName );
    }
    @Test
    public void testTest()
    {
    	System.out.println("Simple Test Excuted");
        assertTrue( true );
    }
    
    @Test
    public void testSizePositive()
    {
    	System.out.println("First Test Excuted");
    	Sample sample=new Sample();
    	sample.addInteger(2);
    	assertEquals(sample.getSize(), 1);
    }
    
    @Test
    public void testLastValuePositive()
    {
    	System.out.println("Second Test Excuted");
    	Sample sample=new Sample();
    	sample.addInteger(2);
    	assertEquals(sample.getLastValue(), 2);
    }
    
}
