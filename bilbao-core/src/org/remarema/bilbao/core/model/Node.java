package org.remarema.bilbao.core.model;

import org.remarema.bilbao.core.NodeId;

/**
 * a node is a single entity of our network. it represents an user or a
 * workstation.
 * 
 * @author mrodler
 */
public class Node {

	/**
	 * the unique identifier of a node.
	 */
	private NodeId nodeId;

	private String credentials;

	public Node(NodeId nodeId, String credentials) {
		this.nodeId = nodeId;
		this.credentials = credentials;
	}

	public NodeId getNodeId() {
		return nodeId;
	}

	public boolean isCredentialsValid(String credentials) {
		return this.credentials.equals(credentials);
	}

}
