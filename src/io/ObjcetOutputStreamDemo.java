package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 *
 * 对象流是一对高级流,在流连接中使用它们可以很方便的读写java中的任何对象
 */
public class ObjcetOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 将一个Person实例写入到文件person.obj中
		 */
		String name = "王同学";
		String gender = "男";
		int age = 18;
		String[] otherInfo = {"是一名演员", "来自南极", "爱好是吃猪皮",  "促进同学交流,嘿嘿~"};
		Person person = new Person(name, gender, age, otherInfo);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * 对象输出流的writeObject可以将给定的对象按照其结构转换为一组肢解后通过其连接的流写出.
		 * 但是这里有一个要求:
		 * 写出的对象所属的类必须实现可序列化接口,
		 * 否则会抛出异常:notSerializableException
		 * 
		 * 当前案例中,我们在流连接中连接了两个流:
		 * 文件流和对象流
		 * 其中:
		 * 对象输出流负责将对象按照其结构转换为一组字节,而这个过程称为:对象序列化
		 * 文件输出流负责将字节写入到文件中.而将数据写入文件的过程称为:数据持久化
		 */
		oos.writeObject(person);
		System.out.println("对象序列化完毕:" + person.toString());
		oos.close();
	}

}
