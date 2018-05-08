package skhu.artview.dto;

public class Provider extends User{

	int id;
	int user_id;
	int facility_id;
//constructor
	public Provider(int id, int fav_artfield_id, String login_id, String pwd, String name, String phone, String email,
			int age) {
		super(id, fav_artfield_id, login_id, pwd, name, phone, email, age);
		// TODO Auto-generated constructor stub
	}

	public Provider(int id, int fav_artfield_id, String login_id, String pwd, String name, String phone, String email,
			int age, int id2, int user_id, int facility_id) {
		super(id, fav_artfield_id, login_id, pwd, name, phone, email, age);
		id = id2;
		this.user_id = user_id;
		this.facility_id = facility_id;
	}
//getter&setter
	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getFacility_id() {
		return facility_id;
	}

	public void setFacility_id(int facility_id) {
		this.facility_id = facility_id;
	}



}
