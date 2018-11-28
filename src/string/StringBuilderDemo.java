package string;

/**
 *StringBuilder��ר����������༭�ַ������ݵ�API��
 *����String���ʺ�Ƶ���޸ģ�������ʵ�ʿ���������о����޸�
 *�ַ����Ĳ���ʱ������ʹ��StringBuilder����ɡ�
 *
 *StringBuilder�ڲ�ά��һ���ɱ���ַ����飬�����޸ĵĹ���
 *����Դ����С�������ṩ�˶�Ӧ�Ĳ���������ɾ���顢�ġ���
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		String str = "�ú�ѧϰjava";
		
//		Ĭ�Ϸ�ʽ�����ڲ���ʾһ�����ַ���""
//		StringBuilder stringBuilder = new StringBuilder();
		
//		����ʱ��ʾ�����ַ�������
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.append("��Ϊ���Ҹ��ù���");
		str = stringBuilder.toString();
		System.out.println(str);
		
		/*
		 * �ú�ѧϰJava,Ϊ���Ҹ��ù���
		 * �ú�ѧϰJava,����Ϊ�˸ı�����
		 * replace(��ʼ�±꣬�����±꣬Ҫ�����������ַ���):��ָ����Χ�ڵ��ַ����滻Ϊ��������
		 */
		stringBuilder.replace(9, stringBuilder.length(), "����Ϊ�˸ı�����");
		str = stringBuilder.toString();
		System.out.println(str);
		
		/*
		 * �ú�ѧϰjava������Ϊ�˸ı����磡
		 * ������Ϊ�˸ı����磡
		 * delete(ɾ������ʼλ�ã�����λ��):ɾ��ָ����Χ�ڵ��ַ���
		 */
		stringBuilder.delete(0, 8);
		str = stringBuilder.toString();
		System.out.println(str);

		
		/*
		 * ������Ϊ�˸ı�����
		 * ���ţ�����Ϊ�˸ı�����
		 * insert():���ƶ����ݲ��뵽ָ��λ��
		 */
		stringBuilder.insert(0, "����");
		str = stringBuilder.toString();
		System.out.println(str);
	}

}
