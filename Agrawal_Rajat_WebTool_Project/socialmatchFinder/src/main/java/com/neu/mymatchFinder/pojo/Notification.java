package com.neu.mymatchFinder.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="notification")
public class Notification {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "NotificationId", unique = true, nullable = false)
	private int nId;
	
	@Column(name="Notification")
	private String notification;
	
	@Column(name="isSeen")
	private boolean isSeen;
	
	@OneToOne
	@JoinColumn(name="fromUser")
	private Userstable fromUser;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="toUser")
	private Userstable toUser;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "PostId")
	private Posts posts;

	public Posts getPosts() {
		return posts;
	}

	public void setPosts(Posts posts) {
		this.posts = posts;
	}

	public int getnId() {
		return nId;
	}

	public void setnId(int nId) {
		this.nId = nId;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public boolean isSeen() {
		return isSeen;
	}

	public void setSeen(boolean isSeen) {
		this.isSeen = isSeen;
	}

	public Userstable getFromUser() {
		return fromUser;
	}

	public void setFromUser(Userstable fromUser) {
		this.fromUser = fromUser;
	}

	public Userstable getToUser() {
		return toUser;
	}

	public void setToUser(Userstable toUser) {
		this.toUser = toUser;
	}
	
	
}

