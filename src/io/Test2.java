package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ʹ��PWʵ�ּ��׼��±�����
 * ����������Ҫ�������ļ���,Ȼ����ļ�д����
 * ֮���û������ÿ���ַ�������д���ļ�(����д).
 * ������exitʱ�����˳�
 */
public class Test2 {

	public static void main(String[] args) throws IOException {
		System.out.println("�������ļ���:");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine().trim();
		
		FileOutputStream fos = new FileOutputStream(inputStr);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		/*
		 * ����������ʹ��PWʱ,���Դ���ڶ�������,�ò���Ϊһ��booleanֵ,����ֵΪtrueʱ,����
		 * �Զ���ˢ�²���
		 * 
		 * ���ǵ����ǵ��õ�PW��println����д��һ���ַ�������Զ�flush
		 * ע��:print�����ǲ����Զ���ˢ�µ�!
		 */
		PrintWriter pw = new PrintWriter(bw, true);	//�ڶ������������ÿ����Զ���ˢ��,ÿ�������з���ˢ��,������println()
		System.out.println("�������ļ�����,����exit�˳�:");
		
//		�㷨1:
		inputStr = scanner.nextLine();
		while(!inputStr.equalsIgnoreCase("exit")){
			pw.println(inputStr);
			inputStr = scanner.nextLine();
		}

//		�㷨2(��ʦ��д��):
//		while(true){
//			String input  = scanner.nextLine();
//			if (input.equalsIgnoreCase("exit")) {
//				break;
//			}
//			pw.println(input);
//		}
		
//		�㷨3:
//		inputStr = "";
//		do{
//			pw.println(inputStr);
//			inputStr = scanner.nextLine();
//		}while((!inputStr.toLowerCase().equals("exit")));
		
		System.out.println("�������");
		bw.close();
		scanner.close();
	}

}
