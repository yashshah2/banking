package banking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shahy
 */
public class testbanking
{
    Operation obj;
    public testbanking() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp()
    {
        obj=new Operation();
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testdepositaccount() 
    {
        assertEquals(1000,obj.deposit(100,1000,0));
        assertEquals(1000,obj.deposit(200,1000,0));
        assertEquals(2000,obj.deposit(100,1000,1000));
        assertEquals(2000,obj.deposit(200,1000,1000));
    }
    @Test
    public void testwithdrawaccount() 
    {
        assertEquals(0,obj.withdraw(100,1000,0));
        assertEquals(1000,obj.withdraw(100,0,1000));
        assertEquals(1000,obj.withdraw(100,1000,2000));
    }
}
