
public class HelloUser {
	private String userName;
	
	public HelloUser(String userName) {
		this.setUserName(userName);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String greetUser() {
		return "Hello " + this.userName + "!";
	}
}
