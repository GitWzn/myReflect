package com.wzn.test;

import java.lang.reflect.Constructor;

import com.wzn.Bean.User;

public class ConstructorTest {
	public static void main(String[] args) {
		try {
			// 获取Class对象
			Class<User> userClass = (Class<User>) Class.forName("com.wzn.Bean.User");
			// 获取所有的构造方法 包括私有的
			Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
			// 遍历所有构造方法
			for (Constructor<?> constructor : declaredConstructors) {
				System.out.println(constructor);
			}
			// 通过Class对象，去获取User的无惨构造 或有参
			Constructor<User> declaredConstructor1 = userClass.getDeclaredConstructor();
			// 因为无惨是私有的 不能直接创建 要通过setAccessible()方法将私有的变成共有的 就是修改访问权限
			declaredConstructor1.setAccessible(true);
			// 创建对象
			User user = declaredConstructor1.newInstance();
			System.out.println(user);
			// 通过Class对象，获取User的全参构造
			Constructor<User> declaredConstructor2 = userClass.getDeclaredConstructor(String.class,String.class,int.class);
			//因为全参构造是公有的   所以可以直接创建对象
			System.out.println(declaredConstructor2.newInstance("吴宗宁","男",18));
			//通过Class对象，获取User的两个参数构造
			Constructor<User> declaredConstructor3 = userClass.getDeclaredConstructor(String.class, String.class);
			//因为两个参数的构造时私有的   不能直接创建对象     先修改访问权限
			declaredConstructor3.setAccessible(true);
			//创建对象
			System.out.println(declaredConstructor3.newInstance("哈哈哈哈","20"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
