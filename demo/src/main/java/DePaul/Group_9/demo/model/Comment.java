package DePaul.Group_9.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
	private int userID;
	private int storeID;
	private int rating;
	private String commentWords;
	private String reply;
	private Date commentTime;
	private boolean like_dislike;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getCommentWords() {
		return commentWords;
	}
	public void setCommentWords(String commentWords) {
		this.commentWords = commentWords;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public boolean isLike_dislike() {
		return like_dislike;
	}
	public void setLike_dislike(boolean like_dislike) {
		this.like_dislike = like_dislike;
	}
}
