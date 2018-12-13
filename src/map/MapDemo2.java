package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * Map的遍历有三种方式：
 * 遍历所有key
 * 遍历所有key-value
 * 遍历所有value
 */
public class MapDemo2 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
		
		/*
		 * LinkedHashMap是可以做到遍历顺序与put时顺序一致的
		 */
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 99);
		System.out.println(map);
		
		/*
		 * 遍历所有的key
		 * Set ketSet()
		 * 将当前Map中所有的Key以一个Set集合形式返回,
		 * 遍历该集合就等同于遍历了所有的key
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println(key);
		}
		
		/*
		 * 遍历每组键值对
		 * Set entrySet()
		 * 将当前Map中每组键值对(若干的Entry实例)以一个Set集合形式返回
		 * 
		 * java.util.Map.Entry
		 * 每个Entry实例表示Map中的一组键值对
		 * 常用方法:
		 * K getKey():获取其表示的键值对中的key
		 * V getValue:获取其表示的键值对中的value
		 */
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		/*
		 * 遍历所有的value
		 * Collection values()
		 * 将当前Map中所有的value以一个集合形式返回,由于Map中不要求value不重复,所以其不以Set集合形式返回
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println(value);
		}
		
		
	}

}
