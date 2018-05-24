package skhu.artview.dto;

public class Comment {

	int id;
	int articleId;
	int userId;
	String context;
	int rate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}

}