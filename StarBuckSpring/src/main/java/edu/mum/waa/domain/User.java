package edu.mum.waa.domain;

public class User {
String name;
String password; 

public User () {}

public User (String name, String password) {
	this.password = password;
	this.name = name;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
