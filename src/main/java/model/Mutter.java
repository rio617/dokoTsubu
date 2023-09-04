package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private int id;
	private String userName; //ユーザー名
	private String text; //つぶやき内容
	
	public Mutter() {
		
	}

	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
	}
	public Mutter(int id,String userName, String text) {
		this(userName,text);
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}


	public String getText() {
		return text;
	}


}
