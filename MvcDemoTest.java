package com.mvcweb.org;

public class MvcDemoTest {
	public boolean authenctication(String username, String password){
		if(password==null || password.trim()==""){
			return false;
		}
		else {
			return true;
		}
	}

}
