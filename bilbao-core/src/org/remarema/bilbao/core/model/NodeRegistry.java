package org.remarema.bilbao.core.model;

import java.util.HashMap;
import java.util.Map;

import org.remarema.bilbao.core.DuplicateNode;
import org.remarema.bilbao.core.NodeId;
import org.remarema.bilbao.core.UnknownObject;

/**
 * a registry of all known nodes.
 * 
 * @author mrodler
 *
 */
public class NodeRegistry {

	private Map<NodeId, Node> registry;

	public NodeRegistry() {
		registry = new HashMap<>();
	}

	public void registerNewNode(Node node) {
		if (registry.containsKey(node.getNodeId())) {
			throw new DuplicateNode(node.getNodeId());
		}
		registry.put(node.getNodeId(), node);
	}

	public Node getNode(NodeId id) {
		Node node = registry.get(id);
		if (node == null) {
			throw new UnknownObject("Node:" + id);
		}
		return node;
	}

	public void deleteNode(Node node) {
		registry.remove(node.getNodeId());
	}

}
