package org.remarema.bilbao.core;

/**
 * a client sends this command to authenticate and join the network.
 * 
 * @author mrodler
 *
 */
public class JoinNetwork {

	private NodeId nodeId;
	private String credentials;

	public JoinNetwork(NodeId nodeId, String credentials) {
		this.nodeId = nodeId;
		this.credentials = credentials;
	}

	public String getCredentials() {
		return credentials;
	}

	public NodeId getNodeId() {
		return nodeId;
	}

}
