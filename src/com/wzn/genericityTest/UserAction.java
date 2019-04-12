package com.wzn.genericityTest;

import com.wzn.Bean.User;

public class UserAction extends BaseAction<User> {

	public UserAction() throws InstantiationException, IllegalAccessException {
		model.setName("吴宗宁");
		System.out.println("model: " + model);
	}
}
