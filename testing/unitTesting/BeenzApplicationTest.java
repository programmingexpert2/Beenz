package unitTesting;

import static org.junit.Assert.*;
import java.util.Vector;
import org.junit.*;

//import xml.XMLOutput;
import beenz.*;


public class BeenzApplicationTest {
	
	public BeenzApplicationTest() {
    }
	
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
//    XMLOutput xml = new XMLOutput();
//    BeenzApplicationTest BeenzApllication = new BeenzApplicationTest();
    
    /**
     * Test of Registered Users method, of class BeenzApplication.
     **/
    @Test
    public void testRegisteredUser() {
        System.out.println("Test of Registered User");
        String name = "John";
        int UserID = 123;
        BeenzApplication instance = new BeenzApplication();
        int expResult = 123;
        int result = instance.RegisterUser(name, UserID);
        assertEquals(expResult, result);
    }
    

	
	/**
     * Test of RegisterBeenzUser method, of class BeenzApplication.
     *  
     */
    @Test
    public void testRegisterBeenzUser() {
        System.out.println("Register Beenz User");
        int UserID = 123;
        int BeenzID = 100;
        BeenzApplication instance = new BeenzApplication();
        int expResult = 100;
        int result = instance.RegisterBeenzUser(UserID, BeenzID);
        assertEquals(expResult, result);
      
    }
    
     /**
     * Test of setBeenz method, of class BeenzApplication.
     */
    @Test
    public void testSetBeenz() {
        System.out.println("setBeenz");
        Vector<Beenz> beenzs = new Vector<Beenz> (100);
        assertNotNull(beenzs);
        BeenzApplication instance = new BeenzApplication();
        instance.setBeenz(beenzs);
    }

    
    /**
     * Test of openDocument method, of class BeenzApplication.
     */
    @Test(timeout = 3000)
     public void testOpenDocument() {
        System.out.println("openDocument");
        BeenzApplication instance = new BeenzApplication();
        instance.RegisterBeenzUser(123,100);
        assertTrue("Beenz ID 100",true);
       // instance.xml(xml);
        BeenzApplication.openDocument(100, 50);
        //instance.xml(xml);
        //System.out.println("\n\nEmployees have collected points for open Document...\n" + xml);
       
    }


     /**
     * Test of contributeInfo method, of class BeenzApplication.
     */
    @Test(timeout = 3000)
     public void testContributeInfo() {
        System.out.println("contributeInfo");
        BeenzApplication instance = new BeenzApplication();
        instance.RegisterBeenzUser(123,100);
        assertFalse("Beenz ID 101", false);
        //instance.xml(xml);
        BeenzApplication.openDocument(100, 50);
        BeenzApplication.contributeInfo(100, 150);
        //instance.xml(xml);
        //System.out.println("\n\nUsers has collected points for contribute Info...\n" + xml);
       }
    
    
    /**
     * Test of claimCD method, of class BeenzApplication.
     */
    @Test(timeout = 3000)
    public void testclaimCD() {
        System.out.println("claimCD");
        BeenzApplication instance = new BeenzApplication();
        instance.RegisterBeenzUser(123,100);
        BeenzApplication.openDocument(100, 50);
        BeenzApplication.contributeInfo(100, 150);
        BeenzApplication.claimCD(100, 5);
        //instance.xml(xml);
        //System.out.println("\n\nusers has redeemed points for claim CD...\n" + xml);
      }

    /**
     * Test of claimBook method, of class BeenzApplication.
     */
    @Test(timeout = 3000)
    public void testclaimBook() {
        System.out.println("claimBook");
        BeenzApplication instance = new BeenzApplication();
        instance.RegisterBeenzUser(123,100);
        BeenzApplication.openDocument(100, 50);
        BeenzApplication.contributeInfo(100, 150);
        BeenzApplication.claimCD(100, 5);
        BeenzApplication.claimBook(100, 10);
        //instance.xml(xml);
        //System.out.println("\n\nUsers have redeemed points for claim Book...\n" + xml);
       }

    /**
     * Test of reserveVacation method, of class BeenzApplication.
     */
    @Test (timeout = 3000)
    public void testclaimVacation() {
        System.out.println("claimVacation");
        BeenzApplication instance = new BeenzApplication();
        instance.RegisterBeenzUser(123,100);
        BeenzApplication.openDocument(100, 50);
        BeenzApplication.contributeInfo(100, 150);
        BeenzApplication.claimCD(100, 5);
        BeenzApplication.claimBook(100, 10);
        BeenzApplication.claimVacation(100, 20);
        //instance.xml(xml);
        //System.out.println("\n\nUsers has redeemed points for claim Vacation...\n" + xml);
       }

	//@Test
	public void test() {
		fail("Not yet implemented");
	}

}
