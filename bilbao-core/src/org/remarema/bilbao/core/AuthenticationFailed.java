package org.remarema.bilbao.core;

/**
 * indicates an invalid authentication attempt.
 * 
 * @author mrodler
 *
 */
public class AuthenticationFailed extends RuntimeException {
	private static final long serialVersionUID = -2606746820699994698L;

	public AuthenticationFailed(String message) {
		super(message);
	}
}
