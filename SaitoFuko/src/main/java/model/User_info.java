package model;

public class User_info {

	private String user_id;
	private String password;
	private String email;
	private String user_name;
	private String gender;
	private String nickname;
	private String birthday;
	private String user_stat;
	
	
	public String getMarkingPwd() {
		String replacePwd=password;
		StringBuilder myName = new StringBuilder(replacePwd);
		int length=password.length();
		for(int i=1;i<length;i++) {
			myName.setCharAt(i, '*');
		}
		replacePwd=myName.toString();
		return replacePwd;
	}
	//${user_info.markingPwd}
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getUser_stat() {
		return user_stat;
	}
	public void setUser_stat(String user_stat) {
		this.user_stat = user_stat;
	}
	
}
