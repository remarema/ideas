package org.remarema.bilbao.core;

import java.util.HashSet;
import java.util.Set;

import org.remarema.bilbao.core.model.Node;
import org.remarema.bilbao.core.model.NodeRegistry;

/**
 * this class manages the network of nodes.
 * 
 * @author mrodler
 *
 */
public class NetworkManager {

	private NodeRegistry nodeRegistry;

	private Set<Node> activeNodes;

	public NetworkManager(NodeRegistry registry) {
		this.nodeRegistry = registry;
		activeNodes = new HashSet<>();
	}

	public Node execute(JoinNetwork command) {
		Node node = nodeRegistry.getNode(command.getNodeId());
		if (node.isCredentialsValid(command.getCredentials())) {
			activeNodes.add(node);
			return node;
		}
		throw new AuthenticationFailed(command.getNodeId().toString());
	}

}
