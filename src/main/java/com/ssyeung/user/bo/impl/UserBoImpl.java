package com.ssyeung.user.bo.impl;

import com.ssyeung.user.bo.UserBo;

public class UserBoImpl implements UserBo {

	public void printUser() {
		System.out.println("printUser() is executed...");		
	}
	
	
	@Override
	public String toString() {
		return "this is from user bo impl.";
	}
}
