package Eeam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


/*
 * ��̬�������ǿforѭ����ʹ��
 * ��ǿforѭ�����������������ǿforѭ���ڱ����Ĺ����в���ʹ�ñ��������޸ļ��ϵ�Ԫ�ظ�����
 * 						�������ڱ����Ĺ����п����޸�Ԫ�صĸ���
 * ��ǿforѭ������ͨforѭ���ıȽϣ���ͨforѭ����������������󣬶���ǿforѭ��ֻ�ܱ�������ͼ���
 * ��̬����ע������1.��̬����ķ�ʽ import static ����   ������
 * 2.��̬�����ʱ�������������֮����ķ�������ͬ��Ĭ��ʹ�ñ���ķ��������ȷʵ��Ҫʹ������ķ�������Ҫ�ڷ�������ǰ��������
 */
import static java.util.Collections.sort;
public class Demo20 {
	public static void main(String[] args) {
		//ʹ����ǿforѭ����������
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(12);
		arr.add(23);
		arr.add(34);
		arr.add(21);
		arr.add(54);
		sort(arr);
		//��ǿforѭ��
		/*for (Integer item : arr) {
			System.out.print(item+" ");
		}*/
		//��ͨ��forѭ��
		/*for(int item=0;item<arr.size();item++){
			System.out.print(arr.get(item)+" ");
		}*/
		//ʹ�õ������ı�������
		/*Iterator<Integer> it = arr.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"  ");
		}*/
		//ʹ����ǿforѭ������map����
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("001", "��Һ�");
		map.put("002", "���Ǻ�");
		map.put("002", "���");
		Set<Entry<String,String>> entrySet = map.entrySet();
		entrySet.iterator();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("��"+entry.getKey()+"="+"ֵ"+entry.getValue());
		}
	}
}
