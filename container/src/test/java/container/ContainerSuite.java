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
public class ContainerSuite extends TestCase {

    public ContainerSuite(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("ContainerSuite");
        suite.addTest(container.MainTest.suite());
        suite.addTest(container.PackageTest.suite());
        suite.addTest(container.ContainerTest.suite());
        suite.addTest(container.WarehouseTest.suite());
        return suite;
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
