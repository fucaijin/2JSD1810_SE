package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * ʹ�õ�ǰ��ʵ�����Զ������Ķ����д����
 * 
 * ����ϣ������������д���඼����ʵ��Serializable�ӿ�
 * �ýӿ���һ��"ǩ���ӿ�",ʵ�ָýӿں���Դ���в���Ҫ��д�κη���.
 * 
 * ʵ���ϱ������ڱ��뵱ǰԴ����Ϊclass�ļ�ʱ���ֵ�ǰ��ʵ���˿����л��ӿ�,
 * ��ô��Ϊ���Զ����һ������,���ڽ���ǰʵ��ת��Ϊһ���ֽ�.������������������κ�Դ�����б�����.
 */

public class Person implements Serializable{
	/**
	 * ���л��汾��
	 */
	private static final long serialVersionUID = 1L;
	private String name, gender;
	private int age;
	/*
	 * ��һ�����Ա�transient�ؼ������κ�,��ô��ǰ��ʵ�������л�ʱ,������ֵ�ᱻ����.
	 * ���Բ���Ҫ������,���Լ������л�����ֽ�.�������������Ч��.������Դ����
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