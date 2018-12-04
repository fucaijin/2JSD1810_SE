package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 重写含有throws声明异常抛出的方法时对throws的重写准则
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
//	 * 可以仅抛出超类方法的部分异常
//	 */
//	public void dosome() throws IOException{
//	}
	
//	/**
//	 * 允许不再抛出任何异常
//	 */
//	public void dosome(){
//	}
	
	
//	/**
//	 * 允许抛出子类型异常
//	 */   
//	public void dosome() throws FileNotFoundException{
//	}
	
//	/**
//	 * 不可以抛出额外异常
//	 */
//	public void dosome() throws SQLException{
//	}
	
//	/**
//	 * 不允许抛出父类型异常
//	 */
//	public void dosome() throws Exception{
//	}
}