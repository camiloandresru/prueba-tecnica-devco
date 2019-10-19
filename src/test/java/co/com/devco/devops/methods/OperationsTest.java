package co.com.devco.devops.methods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OperationsTest {

    private static final double DELTA = 0.001;
    private List<String> sParameter;
    private double dResult = 0;

    @Before
    public void prepareParameters(){
       sParameter = new ArrayList<>(Arrays.asList("2", "3.5", "1.7", "0", "8", "-2.2"));
    }

    @Test
    public void testAdd(){
        dResult = Operations.add(sParameter.get(0), sParameter.get(1));
        assertEquals(5.5, dResult, DELTA);
    }

    @Test
    public void testNegativeSum(){
        dResult = Operations.add(sParameter.get(0), sParameter.get(5));
        assertTrue(dResult<0);
    }

    @Test
    public void testSubtract(){
        dResult = Operations.subtract(sParameter.get(1), sParameter.get(2));
        assertEquals(1.8, dResult, DELTA);
    }

    @Test
    public void testMultiply(){
        dResult = Operations.multiply(sParameter.get(0), sParameter.get(4));
        assertEquals(16, dResult, DELTA);
    }

    @Test
    public void testDivide(){
        dResult = Operations.divide(sParameter.get(4), sParameter.get(0));
        assertEquals(4, dResult, DELTA);
    }

    @Test
    public void testDivisionByZero(){
        try {
            Operations.divide(sParameter.get(2), sParameter.get(3));
            fail();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    @After
    public  void clearParameters(){
        sParameter.clear();
    }
}
