package model;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String name; //ユーザー名
	private String pass; //パスワード
	
	public User() {
		
	}
	
	public User(String name,String pass) {
		this.name=name;
		this.pass=pass;
	}
	
	public User(int id,String name,String pass) {
		this(name,pass);
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPass() {
		return pass;
	}

}
