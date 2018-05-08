package skhu.artview.dto;

public class User {

	int id;
	int fav_artfield_id;
	String login_id;
	String pwd;
	String name;
	String phone;
	String email;
	int age;
	UserType userType;
//constructor
	public User() {};
	public User(int id, int fav_artfield_id, String login_id, String pwd, String name, String phone, String email,
			int age) {

		this.id = id;
		this.fav_artfield_id = fav_artfield_id;
		this.login_id = login_id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.userType =UserType.NORMAL;
	}
//getter&setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFav_artfield_id() {
		return fav_artfield_id;
	}
	public void setFav_artfield_id(int fav_artfield_id) {
		this.fav_artfield_id = fav_artfield_id;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}





}
