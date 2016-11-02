package Eeam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


/*
 * 静态引入和增强for循环的使用
 * 增强for循环与迭代器的区别：增强for循环在遍历的过程中不能使用遍历对象修改集合的元素个数、
 * 						迭代器在遍历的过程中可以修改元素的个数
 * 增强for循环和普通for循环的比较：普通for循环可以输出其他对象，而增强for循环只能遍历数组和集合
 * 静态引入注意的事项：1.静态引入的方式 import static 类名   方法名
 * 2.静态引入的时候，如果该类有与之引入的方法名相同，默认使用本类的方法，如果确实需要使用引入的方法则需要在方法的面前加上类名
 */
import static java.util.Collections.sort;
public class Demo20 {
	public static void main(String[] args) {
		//使用增强for循环遍历集合
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(12);
		arr.add(23);
		arr.add(34);
		arr.add(21);
		arr.add(54);
		sort(arr);
		//增强for循环
		/*for (Integer item : arr) {
			System.out.print(item+" ");
		}*/
		//普通的for循环
		/*for(int item=0;item<arr.size();item++){
			System.out.print(arr.get(item)+" ");
		}*/
		//使用迭代器的遍历方法
		/*Iterator<Integer> it = arr.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"  ");
		}*/
		//使用增强for循环遍历map集合
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("001", "大家好");
		map.put("002", "你们好");
		map.put("002", "打击");
		Set<Entry<String,String>> entrySet = map.entrySet();
		entrySet.iterator();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("键"+entry.getKey()+"="+"值"+entry.getValue());
		}
	}
}
