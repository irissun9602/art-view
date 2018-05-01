package skhu.artview;

public enum UserType {
	NORMAL("1"),
	ARTIST("2"),
	PROVIDER("3") ;

	private String userTypeValue;

	private UserType() {};

	private UserType(String userTypeValue) {
		this.userTypeValue = userTypeValue;
	}

	public String getUserTypeValue() {
		return userTypeValue;
	}

	public String isUserTypeValue() {return userTypeValue;}


}
