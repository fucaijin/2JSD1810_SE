package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ��д����throws�����쳣�׳��ķ���ʱ��throws����д׼��
 *
 */
public class ThrowsDemo{
	public void dosome() throws IOException, AWTException{
		
	}
}

class Boo extends ThrowsDemo{
//	public void dosome() throws IOException, AWTException {
//	}
	
//	/**
//	 * ���Խ��׳����෽���Ĳ����쳣
//	 */
//	public void dosome() throws IOException{
//	}
	
//	/**
//	 * �������׳��κ��쳣
//	 */
//	public void dosome(){
//	}
	
	
//	/**
//	 * �����׳��������쳣
//	 */   
//	public void dosome() throws FileNotFoundException{
//	}
	
//	/**
//	 * �������׳������쳣
//	 */
//	public void dosome() throws SQLException{
//	}
	
//	/**
//	 * �������׳��������쳣
//	 */
//	public void dosome() throws Exception{
//	}
}