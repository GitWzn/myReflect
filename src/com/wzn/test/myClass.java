package com.wzn.test;

import com.wzn.Bean.User;

public class myClass {
	public static void main(String[] args) {
		//获取Class对象的方式一
		Class<? extends User> class1 = new User("", "", 18).getClass();
		System.out.println(class1);
		//方式二
		System.out.println(User.class);
		//方式三
		try {
			System.out.println(Class.forName("com.wzn.Bean.User"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
