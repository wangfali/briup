package Eeam;

import javax.swing.JOptionPane;

public class Demo18 {
public static void main(String[] args) {
	int x,y,result;
	String xVal,yVal;
	xVal=JOptionPane.showInputDialog("�����һ������");
	yVal=JOptionPane.showInputDialog("����ڶ�������");
	x=Integer.parseInt(xVal);
	y=Integer.parseInt(yVal);
	result=x*y;
	JOptionPane.showMessageDialog(null,"�������Ļ�֮��Ϊ"+result);
	System.exit(0);
}
}
