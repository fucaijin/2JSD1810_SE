package file;

import java.io.File;

/*
 * ��ϰ1:��дһ�δ��룬���1+2+...+100����������������ʹ��for��while��ѭ��	��:5050
 * ��ϰ2:����ˮ��1��Ǯ1ƿ��ˮ��2����ƿ���Ի�1ƿ��ˮ��3��ƿ�ǿ��Ի�1ƿ��ˮ���ʣ�20Ԫ�����򵽶���ƿ��ˮ��	��:113ƿ
 * 
 * ��ɷ�����ɾ��ָ����File��ʾ���ļ���Ŀ¼
 */
public class Test {
	public static void main(String[] args) {
		File file = new File("a");
		delete(file);
		System.out.println(addTo(1,100));
		System.out.println(sodaWaterNum(20));
	}

	public static int sodaWaterNum(int money) {
		
	}

	/*
	 * ĳ�����ӵ�ĳ����
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
//	1	3	1 + ��
//	2 	3	2 + ��
//	3	3	3

	/*
	 * ����Ҫ�ж�file�Ƿ�Ϊһ��Ŀ¼��Ҫ��Ŀ¼����Ҫ �Ƚ���Ŀ¼�е���������ȫ��ɾ����ſ��Խ���ɾ���� �����ļ�����ɾ��
	 */
	public static void delete(File file) {
		// �����ǰ��File���ļ��У�����룬��������������
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			// ���������������ɾ��
			for (int i = 0; i < listFiles.length; i++) {
				delete(listFiles[i]);
			}
		}
		// �������ļ��л����ļ������ն�Ҫɾ����ǰ���ļ�/�ļ���
		file.delete();
	}
	
}