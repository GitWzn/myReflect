package com.wzn.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.wzn.Bean.User;

public class FieldTest {
	public static void main(String[] args) {
		try {
			//获取Class对象
			Class<User> userClass = (Class<User>) Class.forName("com.wzn.Bean.User");
			//获取一个无参的构造方法
			Constructor<User> constructor = userClass.getDeclaredConstructor();
			//修改访问权限
			constructor.setAccessible(true);
			//创建对象
			User user = constructor.newInstance();
			//获取指定的属性
			Field name = userClass.getDeclaredField("name");
			System.out.println(name);
			//获取User类中的所有属性
			Field[] fields = userClass.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field);
				//修改所有属性的访问权限
				field.setAccessible(true);
			}
			System.out.println("修改前的user: " + user);
			//给属性设置值
			fields[0].set(user, "吴宗宁");
			fields[1].set(user, "男");
			fields[2].setInt(user, 18);
			System.out.println("修改后的user: " + user);
			System.out.println(fields[0].getName());
			System.out.println(fields[1].getName());
			System.out.println(fields[2].getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
