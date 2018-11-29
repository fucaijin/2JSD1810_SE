package file;

import java.io.File;

/*
 * 练习1:编写一段代码，完成1+2+...+100，并输出结果。不得使用for、while等循环	答案:5050
 * 练习2:买汽水，1块钱1瓶汽水，2个空瓶可以换1瓶汽水，3个瓶盖可以换1瓶汽水，问：20元可以买到多少瓶汽水？	答案:113瓶
 * TODO 未完成练习2
 * 
 * 完成方法，删除指定的File表示的文件或目录
 */
public class Test {
	public static void main(String[] args) {
		File file = new File("a");
		delete(file);
		System.out.println(addTo(1,100));
		System.out.println(sodaWaterNum(20, 0, 0));
	}

	public static int sodaWaterNum(int money, int bottle, int lid) {
		if(money > 0 || bottle > 1 || lid > 2){
			money += bottle / 2 + lid / 3;
			money += sodaWaterNum(0, money + bottle % 2, money + lid % 3);
		}
		return money;
	}
	
//	3
//	3	0	0
	
//	3	0	0
//	3	1	1
	
//	0	5	
	
	/*
	 * 某个数加到某个数
	 */
	public static int addTo(int i, int j) {
		int tem = i;
		if (i==j) {
			return j;
		}
		i++;
		return tem + addTo(i,j);
	}
	
//	i	j	return
//	1	3	1 + ↓
//	2 	3	2 + ↓
//	3	3	3

	/*
	 * 首先要判断file是否为一个目录，要是目录则需要 先将该目录中的所有子项全部删除后才可以将其删除， 若是文件可以删除
	 */
	public static void delete(File file) {
		// 如果当前的File是文件夹，则进入，并遍历所有子项
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			// 遍历所有子项进行删除
			for (int i = 0; i < listFiles.length; i++) {
				delete(listFiles[i]);
			}
		}
		// 不管是文件夹还是文件，最终都要删除当前的文件/文件夹
		file.delete();
	}
	
}