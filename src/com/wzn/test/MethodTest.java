package com.wzn.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.wzn.Bean.User;

public class MethodTest {
	public static void main(String[] args) {
		try {
			//获取Class对象
			Class<User> userClass = (Class<User>) Class.forName("com.wzn.Bean.User");
			//获取无惨构造
			Constructor<User> constructor = userClass.getDeclaredConstructor();
			//修改访问权限
			constructor.setAccessible(true);
			//创建对象
			User user = constructor.newInstance();
			//获取User的所有方法
			Method[] methods = userClass.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println(method);
				//修改访问权限
				method.setAccessible(true);
				//method.invoke(user);
			}
			//methods[2].invoke(user, "吴宗宁");
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
