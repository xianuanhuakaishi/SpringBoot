package Summer.SpringBoot.beans;

public class User {

	private String loginName;
	private String password;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [loginName=" + loginName + ", password=" + password + ", id=" + id + "]";
	}

	public User(String loginName, String password, String id) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.id = id;
	}

	public User(String loginName, String password) {
		super();
		this.loginName = loginName;
		this.password = password;
	}

}
