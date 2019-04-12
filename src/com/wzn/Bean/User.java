package com.wzn.Bean;

public class User {
	private String name;
	private String sex;
	private int age;

	//private User() {}
	public User() {}

	public User(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	private User(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	private void show() {
		System.out.println("世界上最帅的男人是吴宗宁！！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}
