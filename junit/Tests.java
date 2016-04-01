import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

	@Test
	public void testIsTriangle(){
		Triangle t = new Triangle(-1, 2, 3);
		assertEquals(false, t.isTriangle(t));
		
		Triangle t2 = new Triangle(1,-2, 3);
		assertEquals(false, t2.isTriangle(t2));
		
		Triangle t3 = new Triangle(1,2, -3);
		assertEquals(false, t3.isTriangle(t3));
		
		Triangle t4 = new Triangle(2, 3, 4);
		assertEquals(true, t4.isTriangle(t4));
		
		Triangle t5 = new Triangle(2, 3, 1);
		assertEquals(false, t5.isTriangle(t5));
		
		Triangle t6 = new Triangle(1, 2, 3);
		assertEquals(false, t6.isTriangle(t6));
		
		Triangle t7 = new Triangle(2, 1, 3);
		assertEquals(false, t7.isTriangle(t7));
		
		Triangle t14 = new Triangle(1, 3, 3);
		assertEquals(true, t14.isTriangle(t14));
	}
	
	@Test
	public void testGetType(){
		Triangle t8 = new Triangle(-2, 1, 3);
		assertEquals(false, t8.isTriangle(t8));
		assertEquals("Illegal", t8.getType(t8));
		
		Triangle t9 = new Triangle(3, 4, 5);
		assertEquals(true, t9.isTriangle(t9));
		assertEquals("Scalene", t9.getType(t9));
		
		Triangle t10 = new Triangle(2, 2, 2);
		assertEquals(true, t10.isTriangle(t10));
		assertEquals("Regular", t10.getType(t10));
		
		Triangle t11 = new Triangle(2, 2, 3);
		assertEquals(true, t11.isTriangle(t11));
		assertEquals("Isosceles", t11.getType(t11));
		
		Triangle t12 = new Triangle(3, 2, 2);
		assertEquals(true, t12.isTriangle(t12));
		assertEquals("Isosceles", t12.getType(t12));
		
		Triangle t13 = new Triangle(3, 2, 3);
		assertEquals(true, t13.isTriangle(t13));
		assertEquals("Isosceles", t13.getType(t13));
	}
	
	@Test
	public void testBorders(){
		long arr[] = {1,2,3};
		Triangle t = new Triangle(1, 2, 3);
		assertArrayEquals(arr, t.getBorders());
	}
	
}
