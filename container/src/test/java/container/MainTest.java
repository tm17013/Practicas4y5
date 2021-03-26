/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Kenia Tepas
 */
public class MainTest extends TestCase {

    public static Test suite() {
        TestSuite suite = new TestSuite(PackageTest.class);
        return suite ;
        
    }
    public static Test suite1() {
        TestSuite suite = new TestSuite(WarehouseTest.class);
        return suite ;
        
    }
   public static Test suite2() {
        TestSuite suite = new TestSuite(ContainerTest.class);
        return suite ;
        
    }
    public MainTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
}
