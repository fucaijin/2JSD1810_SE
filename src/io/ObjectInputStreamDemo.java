package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ���������
 */
public class ObjectInputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * �������person.obj�ļ��ж�ȡ����
		 */
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		/*
		 * ������������readObject�����Ὣ��ȡ��ֱ�Ӱ�����ṹ��ԭ�ض�Ӧ�Ķ���.
		 * ��������̳�Ϊ:�������л�
		 */
		Person person = (Person) ois.readObject();
		System.out.println(person.toString());
		ois.close();
	}

}
