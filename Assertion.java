package pkg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.junit.runner.Result;
import org.testng.annotations.Test;

public class Assertion {
	@Test		
    public void testAssert(){					
        		
        //Variable declaration		
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;					
        int[] arithematicArrary1 = { 1, 2, 3 };					
        int[] arithematicArrary2 = { 1, 2, 3 };					
        		
        //Assert statements		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
        assertArrayEquals(arithematicArrary1, arithematicArrary2);					
    }

	private void assertArrayEquals(int[] arithematicArrary1, int[] arithematicArrary2) {
		// TODO Auto-generated method stub
		
	}

	public static Result runClasses(Class<Assertion> class1) {
		// TODO Auto-generated method stub
		return null;
	}		
}		


