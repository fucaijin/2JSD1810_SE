package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 *
 * ��������һ�Ը߼���,����������ʹ�����ǿ��Ժܷ���Ķ�дjava�е��κζ���
 */
public class ObjcetOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * ��һ��Personʵ��д�뵽�ļ�person.obj��
		 */
		String name = "��ͬѧ";
		String gender = "��";
		int age = 18;
		String[] otherInfo = {"��һ����Ա", "�����ϼ�", "�����ǳ���Ƥ",  "�ٽ�ͬѧ����,�ٺ�~"};
		Person person = new Person(name, gender, age, otherInfo);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * �����������writeObject���Խ������Ķ�������ṹת��Ϊһ��֫���ͨ�������ӵ���д��.
		 * ����������һ��Ҫ��:
		 * д���Ķ��������������ʵ�ֿ����л��ӿ�,
		 * ������׳��쳣:notSerializableException
		 * 
		 * ��ǰ������,��������������������������:
		 * �ļ����Ͷ�����
		 * ����:
		 * ������������𽫶�������ṹת��Ϊһ���ֽ�,��������̳�Ϊ:�������л�
		 * �ļ�����������ֽ�д�뵽�ļ���.��������д���ļ��Ĺ��̳�Ϊ:���ݳ־û�
		 */
		oos.writeObject(person);
		System.out.println("�������л����:" + person.toString());
		oos.close();
	}

}
