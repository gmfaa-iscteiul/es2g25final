import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class HelloTest extends TestCase{

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Hello helloworld;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	void testProduct() {
		Hello hel = new Hello();
		int output = hel.product(2, 2);
		assertEquals(4, output);
	}
}
