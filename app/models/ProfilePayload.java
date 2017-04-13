package models;

public class ProfilePayload {
	
	String conFriends;
	String penFriends;
	String reqFriends;
	String message;
	
	public ProfilePayload(String conFriends, String penFriends,
			String reqFriends, String message) {
		this.conFriends = conFriends;
		this.penFriends = penFriends;
		this.reqFriends = reqFriends;
		this.message = message;
	}
	
	public String getConFriends() {
		return conFriends;
	}
	
	public String getPenFriends() {
		return penFriends;
	}
	
	public String getReqFriends() {
		return reqFriends;
	}
	
	public String getMessage() {
		return message;
	}
	
}
