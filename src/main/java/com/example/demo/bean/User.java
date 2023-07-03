package com.example.demo.bean;

public class User {
   private String name;
   private String email;
   private String imageUrl;
   
public User() {
	super();
}
public User(String name, String email, String gender, String url) {
	super();
	this.name = name;
	this.email = email;
	this.imageUrl=url;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", imageUrl=" + imageUrl + "]";
}

   
   
}
