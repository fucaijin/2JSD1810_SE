package io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ����������ʹ��PrintWriter
 */
public class PrintWriterDemo2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
//		pw.println("���");
		pw.write("jsldjkflajskdf\n3214651");
//		pw.println("�ټ�");
		pw.close();
	}

}
