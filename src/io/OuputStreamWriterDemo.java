package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java将按照读写单位划分为两类:
 * 1:字节流,读写以直接为最小单位
 * 2:字符流,读写以支付(unicode)为最小单位.实际上底层本质还是读写字节,
 * 但是字节与支付的转换操作有字符流自行完成.字符流只适合读写文本数据.
 * 
 * java.io.Reader是所有字符输入流的超类
 * java.io.Writer是所有字符输出流的超类
 *
 * 转换流(是一对高级流):
 * java.io.InputStreamReader
 * java.io.OutputStreamReader
 * 他们在流连接中使用字符流完成字符读写操作时是非常重要的一环,但是通常不直接操作这两个流
 * 
 * java中提供了很多功能更丰富的字符流,但是字符流都有一个共同点:不能直接连接在字节流上
 * 大部分常用的低级流都是字节流(比如文件流),这会导致在流连接中我们要使用字符流读写文本数据时
 * 无法直接与字节流连接.因此我们要使用转换流,转换流是唯一一对可以连接在字节流上的字符流,使用它
 * 作为"转换器"使用,可以达到让字符流与字节流连接使用
 *
 */
public class OuputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		
		/*
		 * 创建转换流时通常会指定第二个参数,该参数为字符集的名称,
		 * 这样通过转换流写出的文本数据都会按照指定的字符集转换为字节
		 * 若不指定,则是按照系统默认字符集,不推荐
		 */
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		osw.write("好嗨哟~");
		osw.write("感觉写bug达到了高潮~~~~");
		osw.close();
		System.out.println("写出完毕");
	}
}
