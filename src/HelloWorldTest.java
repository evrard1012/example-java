import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author mac
 *
 */
public class HelloWorldTest {

	HelloWorld hw;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		hw = new HelloWorld();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		assertEquals(hw.sum(2, 4), 6);
	}
	@Test
	public void testSum2() {
		assertEquals(hw.sum(2, 5), 7);
	}
	@Test
	public void testGetMessage() {
		assertEquals(hw.getMessage("evrard"), "Hello evrard");
	}

}
