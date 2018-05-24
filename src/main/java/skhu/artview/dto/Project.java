package skhu.artview.dto;

public class Project {

	int id;
	String subject;
	String p_path; //사진 url 저장
	String v_path; //동영상 url 저장

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getP_path() {
		return p_path;
	}
	public void setP_path(String p_path) {
		this.p_path = p_path;
	}
	public String getV_path() {
		return v_path;
	}
	public void setV_path(String v_path) {
		this.v_path = v_path;
	}
}