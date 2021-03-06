package com.brianmccutchon.checkers.model;

/**
 * Describes a callback to be executed when the
 * preferences window is closed.
 * @author Brian McCutchon
 */
@FunctionalInterface
public interface PreferenceListener {
	
	public void finished(Preferences endstate);
	
}
