package file;

import java.io.File;

/**
 * java.io.File
 * File���ڱ�ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * ʹ��File����:
 * 1.�������ʾ���ļ���Ŀ¼��������Ϣ(�ļ�������С��)
 * 2.������ɾ���ļ���Ŀ¼
 * 3.����Ŀ¼����
 * 
 * ���ǲ��ܷ����ļ�����
 */
public class FileDemo {

	public static void main(String[] args) {
		
		/**
		 * ����File��Ҫָ��·����ʹ���ʾ��·���µ��ļ���Ŀ¼��
		 * ����·��ͨ��ʹ�����·�������·����Ȼ����׼ȷ����λ�ã������Ǹ������л��������ģ�
		 * �������ĺô��ǿ�ƽ̨����ʹ�á�
		 * "./"ָ���ǵ�ǰĿ¼����eclipse������java����ʱ��
		 * ��ǰĿ¼��λ��Ϊ�ó���˵����Ŀ����ĿĿ¼
		 */
		File file = new File("./demo.txt");
		
		String name = file.getName();
		System.out.println(name);
		
		long length = file.length();
		System.out.println(length);
		
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		boolean hidden = file.isHidden();
		System.out.println(canRead);
		System.out.println(canWrite);
		System.out.println(hidden);
	}

}
