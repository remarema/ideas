package org.remarema.bilbao.core;

/**
 * this exception occurs if any identifier references an unknown (not existing)
 * object.
 * 
 * @author mrodler
 *
 */
public class UnknownObject extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UnknownObject(String identifier) {
		super(identifier);
	}
}
