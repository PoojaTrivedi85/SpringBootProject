package com.springboot.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "Feedback")
public class Feedback {

@Id @GeneratedValue
private int sr_no;
private String username;
private String userpass;
private String useremail;
private String userAdd;
@Column(name ="feedback")
private String feed;
private String comments;

public Feedback() {
	super();
	
}
public Feedback( String username, String userpass, String useremail, String userAdd, String feed, String comments) {
	super();
	
	this.username = username;
	this.userpass = userpass;
	this.useremail = useremail;
	this.userAdd = userAdd;
	this.feed = feed;
	this.comments = comments;
	
}

@Override
public String toString() {
	return "Feedback [sr_no=" + sr_no + ", username=" + username + ", userpass=" + userpass + ", useremail=" + useremail
			+ ", userAdd=" + userAdd + ", feed=" + feed + ", comments=" + comments + "]";
}


}
