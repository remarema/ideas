package org.remarema.bilbao.core;

/**
 * this exception is thrown, if you try to add a new node with a already
 * existing nodeId.
 * 
 * @author mrodler
 *
 */
public class DuplicateNode extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DuplicateNode(NodeId nodeId) {
		super(nodeId.toString());
	}

}
