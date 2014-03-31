package com.ssyeung.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssyeung.user.bo.UserBo;

public class UserAction extends ActionSupport {
	// DI via Spring
	UserBo userBo;

	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {

		userBo.printUser();
		return SUCCESS;

	}
	
}
