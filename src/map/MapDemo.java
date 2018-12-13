package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map的结构是一个多行两列的表格,其中左列称为key,右列称为value.Map总是以key-value对的形式保存数据.并且总是以key来获取对应的value
 * 所以我们经常将要查询的数据作为value,将查询条件作为key,保存在Map中以便于根据条件快速查找对应的数据.
 * 
 * java.util.HashMap 散列表
 * HashMap是最常用的实现类,也是当今最快的查询结构
 */
public class MapDemo {

	public static void main(String[] args) {
		/*
		 * Map要求指定两个泛型,分别说明key与value的类型
		 */
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 * V put(K k, V v)
		 * 将给定的键值对保存在Map中.
		 * 注:
		 * Map有一个要求,即:Map中的Key不允许重复,重复的标准是依靠Key自身的equals比较结果.
		 * 所以put方法是有返回值的:若本次存放的key已经在Map中存在,则是替换value操作,那么返回值就是被替换的value.否则为null
		 */
		
		/*
		 * 若value的类型为包装类,切记不要用对应的基本类型接收put方法的返回值,
		 * 因为这会触发包装类自动拆箱,而put方法返回值有可能为null,这时若拆箱会造成空指针异常
		 */
		Integer num = map.put("语文", 98);
//		int put = map.put("语文", 98);//如果使用int来接收,会引发编译器的自动拆箱编译成map.put("语文", 98).intValue(),如果返回值为null,则会引发空指针异常
		System.out.println(num);
		map.put("数学", 100);
		map.put("英语", 99);
		map.put("物理", 95);
		map.put("化学", 97);
		System.out.println(map);
		System.out.println(map.put("语文", 60));
		System.out.println(map);
		
		/*
		 * V get(Object key)
		 * 根据给定的key获取对应的value,若给定的key在Map中不存在则返回值为null
		 */
		num = map.get("英语");
		System.out.println("英语:" + num);
		
		num = map.get("体育");
		System.out.println("体育:" + num);
		
		System.out.println("size:" + map.size());
		
		/*
		 * V remove(K k)
		 * 根据给定的key删除对应的这组键值对.返回值为该组键值对中的value.
		 */
		num = map.remove("英语");
//		num = map.remove("123");//如果删除一个不存在的key,则返回值为null
		System.out.println("返回:" + num);
		System.out.println(map);
		
		/*
		 * boolean containsKey(Object k)
		 * boolean containsValue(Object v)
		 * 判断当前Map是否包含给定的key或value
		 * 包含的判断还是依靠元素自身equals()比较的结果
		 */
		System.out.println(map.containsKey("语文"));
		System.out.println(map.containsKey("生物"));
		System.out.println(map.containsValue(100));
		System.out.println(map.containsValue(77));
	}

}
