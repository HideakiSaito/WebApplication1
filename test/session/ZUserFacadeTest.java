/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.ZUser;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author macuser
 */
//@Ignore
public class ZUserFacadeTest {
    
    public ZUserFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of count method, of class ZUserFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        
        ZUserFacade instance = (ZUserFacade)SessionTestSuite.getContainer().getContext().lookup("java:global/classes/ZUserFacade");
        int expResult = 2;
        int result = instance.count();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

   
}
