package skhu.artview.dto;

public class Provider {

	int id;
	int user_id;
	int facility_id;

	// constructor
	public Provider(int id, int user_id, int facility_id) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.facility_id = facility_id;
	}
//getter&setter
	public int getId() {
		return id;
	}

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
