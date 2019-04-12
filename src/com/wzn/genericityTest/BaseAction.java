package com.wzn.genericityTest;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseAction<T> {
	public T model;

	@SuppressWarnings("unchecked")
	public BaseAction() throws InstantiationException, IllegalAccessException {
		// 获取父类上声明的泛型的Class对象 就是<>泛型的Class类
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		// 获取泛型的所有字节码(Class)对象 <T,K> T,K的字节码对象
		Type[] types = genericSuperclass.getActualTypeArguments();
		// 获取T泛型的Class对象 然后创建T泛型对象
		this.model = ((Class<T>) types[0]).newInstance();
		// 查看当前泛型类对象是哪一个
		System.out.println("当前泛型类的对象" + model.getClass());
	}
}
