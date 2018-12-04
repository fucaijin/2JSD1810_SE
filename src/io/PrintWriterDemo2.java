package io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流连接中使用PrintWriter
 */
public class PrintWriterDemo2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
//		pw.println("你好");
		pw.write("jsldjkflajskdf\n3214651");
//		pw.println("再见");
		pw.close();
	}

}
