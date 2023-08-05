//HW1 compareTo()

package alona.numbers;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static alona.numbers.Calculator.*;

//public int compareTo(String string2)
//public int compareTo(Object object)


class StringTest {
	@Test
	void charAtTest() {
		String str = "Hello";
		assertEquals('H', str.charAt(0));
		assertEquals('o', str.charAt(4));
		assertEquals('l',str.charAt(2));
		assertEquals('c', 'e' - 2);
		assertEquals("Hello2", str + 2);
	}
	@Test
	void containsTest() {
		String str = "Hello";
		assertTrue(str.contains("H"));
		assertFalse(str.contains("h"));
		assertTrue(str.contains("ello"));
		assertFalse(str.contains("lelo"));
	}
	@Test
	void compareToTest() {
		assertEquals(8, "9".compareTo("12345"));
		assertEquals(-4, "12345".compareTo("12349"));
		assertEquals(1, "123459".compareTo("12345"));
		assertEquals(0, "Hello".compareTo("Hello"));
		assertEquals('H' - 'h', "Hello".compareTo("hello"));
		assertTrue("Hello".compareTo("hello") < 0);
	}
	
	
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(8, "9".compareToIgnoreCase("12345"));
		assertEquals(-4, "12345".compareToIgnoreCase("12349"));
		assertEquals(2, "12345yu".compareToIgnoreCase("12345"));
		assertEquals(0, "Hello".compareToIgnoreCase("HeLlO"));
		assertEquals(0, "Hello".compareToIgnoreCase("hello"));
		
		
	}
	@Test
	void testStartWith() {
		String hello = "Hello";
		assertTrue (hello.startsWith("He"));
		assertFalse(hello.startsWith("he"));
	}
	@Test
	void testEndWith() {
		String hello = "Hello";
		assertTrue (hello.endsWith("lo"));
		assertFalse(hello.endsWith("LO"));
	}
	@Test
	void testIndexOf() {
		//tested method indexOf(String str)
		String hello = "Hello";
		assertEquals(0, hello.indexOf("He"));
		assertEquals(2, hello.indexOf("llo"));
		assertEquals(4, hello.indexOf("o"));
	}
	@Test
	
	void testLastIndexOf() {
		//tested method lastIndexOf(int ch)
		String hello = "HHellooo";
		assertEquals(1, hello.lastIndexOf('H'));
		assertEquals(4, hello.lastIndexOf('l'));
		assertEquals(7, hello.lastIndexOf('o'));
	}
	@Test
	void equalsIgnoreCase() {
		String hello = "Hello";
		assertTrue(hello.equalsIgnoreCase("hElLO"));
		assertFalse(hello.equalsIgnoreCase("Hlelo"));
		
	}
	@Test
	void testConcat() {
		
		String hello = "Hello";
		String world = " World";
		String helloWorld = "Hello World";
		hello.concat(world);
		assertEquals(helloWorld, hello.concat(world));
		assertEquals("Hello World!", helloWorld.concat("!"));
		assertNotEquals(hello, helloWorld);
	}

}
