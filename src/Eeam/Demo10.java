package Eeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo10 {
private String colors[]={"��","��","��","��","��","��","��ɫ","��ɫ"};
private ArrayList alist;
public Demo10(){
	alist=new ArrayList(Arrays.asList(colors));
	Collections.sort(alist);
	System.out.println("��ArrayList����"+alist);
}
public void printsaerchResult(){
	printsearchResultHelper(colors[3]);
	printsearchResultHelper(colors[0]);
	printsearchResultHelper(colors[7]);
	printsearchResultHelper("��");
	printsearchResultHelper("��");
	printsearchResultHelper("��ɫ");
	
}
private void printsearchResultHelper(String key){
	int result=0;
	System.out.println("\n�����ؼ���"+key);
	result=Collections.binarySearch(alist, key);
	System.out.println(result>=0?"�ҵ��±�"+result:"û���ҵ�"+result);
}
public static void main(String[] args) {
	new Demo10().printsaerchResult();
}
}
