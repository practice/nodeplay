package org.nodeplay.node.model;


public enum UserStatus {

	BLOCKED(0), ACTIVE(1)
    ;
	
	private int status;

	private UserStatus(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return status;
	}
}
