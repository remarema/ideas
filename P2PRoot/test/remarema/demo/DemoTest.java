package remarema.demo;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {

	private Demo demo;

	@Before
	public void setupDemoTest() {
		demo = new Demo();
	}

	@Test
	public void connect_new_node() {
		DemoNode node = demo.createNode("sampleNode");
		node.connect();
	}

}
