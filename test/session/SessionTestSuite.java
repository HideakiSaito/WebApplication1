/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author macuser
 */
//@Ignore
@RunWith(Suite.class)
@Suite.SuiteClasses({session.ZUserFacadeTest.class, session.ZSkillFacadeTest.class})
public class SessionTestSuite {
    
    public static EJBContainer container=null;

    public static EJBContainer getContainer() {
        if (container == null){
               container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
               System.out.print("EJBコンテナを作る！！！！！！！！！！！！！！！！！！！！");
        }
        return container;
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
         container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        container.close();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
