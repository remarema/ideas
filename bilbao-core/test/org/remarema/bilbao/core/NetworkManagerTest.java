package org.remarema.bilbao.core;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.remarema.bilbao.core.model.Node;
import org.remarema.bilbao.core.model.NodeRegistry;

public class NetworkManagerTest {

	private NetworkManager networkManager;

	@Before
	public void setup() {
		NodeRegistry nodeRegistry = new NodeRegistry();
		NodeId nodeId = new NodeId("nodeA");
		Node node = new Node(nodeId, "password");
		nodeRegistry.registerNewNode(node);
		networkManager = new NetworkManager(nodeRegistry);
	}

	@Test
	public void join_network_on_valid_request() {
		NodeId nodeId = new NodeId("nodeA");
		JoinNetwork command = new JoinNetwork(nodeId, "password");

		Node node = networkManager.execute(command);
		assertThat(node.getNodeId(), is(nodeId));
	}

	@Test(expected = AuthenticationFailed.class)
	public void do_not_join_network_if_invalid_credential() {
		NodeId nodeId = new NodeId("nodeA");
		JoinNetwork command = new JoinNetwork(nodeId, "invalid");
		networkManager.execute(command);
	}

}
