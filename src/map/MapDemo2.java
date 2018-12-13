package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * Map�ı��������ַ�ʽ��
 * ��������key
 * ��������key-value
 * ��������value
 */
public class MapDemo2 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
		
		/*
		 * LinkedHashMap�ǿ�����������˳����putʱ˳��һ�µ�
		 */
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 99);
		System.out.println(map);
		
		/*
		 * �������е�key
		 * Set ketSet()
		 * ����ǰMap�����е�Key��һ��Set������ʽ����,
		 * �����ü��Ͼ͵�ͬ�ڱ��������е�key
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println(key);
		}
		
		/*
		 * ����ÿ���ֵ��
		 * Set entrySet()
		 * ����ǰMap��ÿ���ֵ��(���ɵ�Entryʵ��)��һ��Set������ʽ����
		 * 
		 * java.util.Map.Entry
		 * ÿ��Entryʵ����ʾMap�е�һ���ֵ��
		 * ���÷���:
		 * K getKey():��ȡ���ʾ�ļ�ֵ���е�key
		 * V getValue:��ȡ���ʾ�ļ�ֵ���е�value
		 */
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		/*
		 * �������е�value
		 * Collection values()
		 * ����ǰMap�����е�value��һ��������ʽ����,����Map�в�Ҫ��value���ظ�,�����䲻��Set������ʽ����
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println(value);
		}
		
		
	}

}
