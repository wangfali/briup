package Eeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo10 {
private String colors[]={"红","白","蓝","黑","黄","紫","茶色","粉色"};
private ArrayList alist;
public Demo10(){
	alist=new ArrayList(Arrays.asList(colors));
	Collections.sort(alist);
	System.out.println("对ArrayList分类"+alist);
}
public void printsaerchResult(){
	printsearchResultHelper(colors[3]);
	printsearchResultHelper(colors[0]);
	printsearchResultHelper(colors[7]);
	printsearchResultHelper("绿");
	printsearchResultHelper("灰");
	printsearchResultHelper("橙色");
	
}
private void printsearchResultHelper(String key){
	int result=0;
	System.out.println("\n检索关键字"+key);
	result=Collections.binarySearch(alist, key);
	System.out.println(result>=0?"找到下标"+result:"没有找到"+result);
}
public static void main(String[] args) {
	new Demo10().printsaerchResult();
}
}
