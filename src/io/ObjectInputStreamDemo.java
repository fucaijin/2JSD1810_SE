package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输出流
 */
public class ObjectInputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * 将对象从person.obj文件中读取出来
		 */
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		/*
		 * 对象输入流的readObject方法会将读取的直接按照其结构还原回对应的对象.
		 * 而这个过程称为:对象反序列化
		 */
		Person person = (Person) ois.readObject();
		System.out.println(person.toString());
		ois.close();
	}

}
