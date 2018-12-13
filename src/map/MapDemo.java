package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map ���ұ�
 * Map�Ľṹ��һ���������еı��,�������г�Ϊkey,���г�Ϊvalue.Map������key-value�Ե���ʽ��������.����������key����ȡ��Ӧ��value
 * �������Ǿ�����Ҫ��ѯ��������Ϊvalue,����ѯ������Ϊkey,������Map���Ա��ڸ����������ٲ��Ҷ�Ӧ������.
 * 
 * java.util.HashMap ɢ�б�
 * HashMap����õ�ʵ����,Ҳ�ǵ������Ĳ�ѯ�ṹ
 */
public class MapDemo {

	public static void main(String[] args) {
		/*
		 * MapҪ��ָ����������,�ֱ�˵��key��value������
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 * V put(K k, V v)
		 * �������ļ�ֵ�Ա�����Map��.
		 * ע:
		 * Map��һ��Ҫ��,��:Map�е�Key�������ظ�,�ظ��ı�׼������Key�����equals�ȽϽ��.
		 * ����put�������з���ֵ��:�����δ�ŵ�key�Ѿ���Map�д���,�����滻value����,��ô����ֵ���Ǳ��滻��value.����Ϊnull
		 */
		
		/*
		 * ��value������Ϊ��װ��,�мǲ�Ҫ�ö�Ӧ�Ļ������ͽ���put�����ķ���ֵ,
		 * ��Ϊ��ᴥ����װ���Զ�����,��put��������ֵ�п���Ϊnull,��ʱ���������ɿ�ָ���쳣
		 */
		Integer num = map.put("����", 98);
//		int put = map.put("����", 98);//���ʹ��int������,���������������Զ���������map.put("����", 98).intValue(),�������ֵΪnull,���������ָ���쳣
		System.out.println(num);
		map.put("��ѧ", 100);
		map.put("Ӣ��", 99);
		map.put("����", 95);
		map.put("��ѧ", 97);
		System.out.println(map);
		System.out.println(map.put("����", 60));
		System.out.println(map);
		
		/*
		 * V get(Object key)
		 * ���ݸ�����key��ȡ��Ӧ��value,��������key��Map�в������򷵻�ֵΪnull
		 */
		num = map.get("Ӣ��");
		System.out.println("Ӣ��:" + num);
		
		num = map.get("����");
		System.out.println("����:" + num);
		
		System.out.println("size:" + map.size());
		
		/*
		 * V remove(K k)
		 * ���ݸ�����keyɾ����Ӧ�������ֵ��.����ֵΪ�����ֵ���е�value.
		 */
		num = map.remove("Ӣ��");
//		num = map.remove("123");//���ɾ��һ�������ڵ�key,�򷵻�ֵΪnull
		System.out.println("����:" + num);
		System.out.println(map);
		
		/*
		 * boolean containsKey(Object k)
		 * boolean containsValue(Object v)
		 * �жϵ�ǰMap�Ƿ����������key��value
		 * �������жϻ�������Ԫ������equals()�ȽϵĽ��
		 */
		System.out.println(map.containsKey("����"));
		System.out.println(map.containsKey("����"));
		System.out.println(map.containsValue(100));
		System.out.println(map.containsValue(77));
	}

}
