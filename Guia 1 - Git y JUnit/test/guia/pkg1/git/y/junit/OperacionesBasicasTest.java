package guia.pkg1.git.y.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperacionesBasicasTest {
    
    public OperacionesBasicasTest() {
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

    @org.junit.Test
    public void testSumar() {
        System.out.println("sumar");
        OperacionesBasicas instance = new OperacionesBasicas(20,5);
        //int expResult = 10;
        //int result = instance.Sumar();
        //assertEquals(expResult, result);
        assertTrue(instance.sumar()==25);
        
    }

    @org.junit.Test
    public void testResta() {
        System.out.println("resta");
         OperacionesBasicas instance = new OperacionesBasicas(20,5);
        //int expResult = 6;
        //int result = instance.Restar();
        //assertEquals(expResult, result);
        assertTrue(instance.resta()==15);
    }

   @org.junit.Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas(20,5);
        //int expResult = 16;
        //int result = instance.Multiplicar();
        //assertEquals(expResult, result);
        assertTrue(instance.multiplicar()==100);
    }

    @org.junit.Test
    public void testDivivir() {
        System.out.println("divivir");
        OperacionesBasicas instance = new OperacionesBasicas(20,5);
        //int expResult = 4;
        //int result = instance.Dividir();
        //assertEquals(expResult, result);
        assertTrue(instance.dividir()==4);
    }    
}
