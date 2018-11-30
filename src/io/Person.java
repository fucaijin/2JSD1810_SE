package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类实例测试对象流的对象读写操作
 * 
 * 所有希望被对象流读写的类都必须实现Serializable接口
 * 该接口是一个"签名接口",实现该接口后再源码中不需要重写任何方法.
 * 
 * 实际上编译器在编译当前源代码为class文件时发现当前类实现了可序列化接口,
 * 那么会为其自动添加一个方法,用于将当前实例转换为一组字节.但是这个方法无需在任何源代码中被体现.
 */

public class Person implements Serializable{
	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	private String name, gender;
	private int age;
	/*
	 * 当一个属性被transient关键字修饰后,那么当前类实例在序列化时,该属性值会被忽略.
	 * 忽略不必要的属性,可以减少序列化后的字节.做到对象瘦身的效果.减少资源开销
	 */
	private transient String[] otherInfo;
	
	public Person(String name, String gender, int age, String[] otherInfo) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.otherInfo = otherInfo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String[] getOtherInfo() {
		return otherInfo;
	}
	
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String toString() {
		return name + "," + age + "," + gender + ","  + Arrays.toString(otherInfo);
	}
}