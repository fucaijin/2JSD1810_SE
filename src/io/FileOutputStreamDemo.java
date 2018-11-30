package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO java标准的输入与输出
 * java提供了统一的标准的输入与输出操作，用于与外界设备进行交互数据
 * 
 * 其中：
 * 输入流:用于从外界读取数据到程序中的流。(读操作)
 * 输出流:用于将程序中的数据发送到外界的流。(写操作)
 *
 * java.io.InputStream:
 * 所有字节输入流的超类，定义了所有输入流都具备的读取字节的方法。但InputStream是抽象类，不可以被实例化
 * 
 * java.io.OutputStream:
 * 所有字节输出流的超类，定义了写出数据的方法。
 * 
 * 流读写数据采取的模式为:顺序读写，也就是说无论读还是写，都是一次性的，不可以回退。
 * 
 * java将流划分为了两类:
 * 1.节点流:又叫低级流，是实际连接程序与另一端的"管道"，负责实际读写数据的流。读写一定是建立在节点流的基础上进行的。
 * 2.处理流:又叫高级流,高级流不可以独立存在,必须连接在其他流上,这样当数据流经当前高级流时会对数据进行加工,这样可以简化我们对数据加工的操作.
 * 
 * 用一组高级流进行串联操作.最终连接到某个低级流上,完成对读写数据的流水线式加工.这样的操作称为流链接.
 * 流链接是学习IO的精髓,要掌握.
 * 
 * 文件流:
 * 文件流是一堆低级流,用于读写文件数据的流.
 * java.io.FileOutputStream
 * java.io.FileInputStream
 * 
 * 文件流与RandomAccessFile(RAF)对比:
 * 文件流是基于java标准IO进行读写数据的,所以对文件数据是顺序读写形式.
 * RAF是基于指针的随机读写形式.可以操作指针对文件任意位置进行读/写
 * 
 * 文件流可以基于流连接,串联若干高级流完成更复杂的读写数据操作.而RAF很多操作都需要自行完成
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 向fos.txt文件中写入数据
		 * 常见构造方法:
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * 以上两种创建模式为覆盖写模式,即创建流的时候若该文件已经存在,流会现将该文件数据清除,然后才开始新的写操作
		 * 
		 * FileOutputStream(String path, boolean append)
		 * FileOutputStream(File file, boolean append)
		 * 以上两种创建模式为追加写模式,即:文件数据都保留,会将通过该流写入的数据继续追加到文件末尾
		 */
		
		FileOutputStream fos = new FileOutputStream("fos.txt", true);
		
		String str = "我可以,陪你去看星星";
		byte[] bytes = str.getBytes("utf-8");
		fos.write(bytes);
//
//		str = "我不想,每一次都和你分离";
//		bytes = str.getBytes("utf-8");
//		fos.write(bytes);
		
//		String str = "我不想,每一次都和你分离";
//		byte[] bytes = str.getBytes("utf-8");
//		fos.write(bytes);
		
		System.out.println("写入完毕");
		fos.close();
	}

}
