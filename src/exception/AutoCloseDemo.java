package exception;

import java.io.FileOutputStream;

/**
 * JDK1.7֮���Ƴ���һ��������:�Զ��ر�
 * ʹ�ø�����,����IO������Ĺرձ�ñȽϼ���
 *
 */
public class AutoCloseDemo {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("fos.txt")){
			/*
			 * JDK1.7���ṩ��һ���ӿ�:AutoCloseable
			 * ʵ���˸ýӿڵ�������ڴ˶���.���ջ���finally�б��ر�(���������ڱ����ı����)
			 */
			fos.write(1);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
