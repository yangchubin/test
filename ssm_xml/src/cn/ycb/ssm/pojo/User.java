package cn.ycb.ssm.pojo;

public class User {
	
	private Integer userId;
	private String username;
	private String gender;
	private Integer telephone_number;

	public User() {
		super();
	}

	public User(Integer userId, String username, String gender, Integer telephone_number) {
		super();
		this.userId = userId;
		this.username = username;
		this.gender = gender;
		this.telephone_number = telephone_number;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getTelephoneNumber() {
		return telephone_number;
	}

	public void setTelephoneNumber(Integer telephone_number) {
		this.telephone_number = telephone_number;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", gender=" + gender + ", telephone_number="
				+ telephone_number + "]";
	}

}
