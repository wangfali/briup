package Eeam;

import javax.swing.JOptionPane;

public class Demo01 {
	 int i=10;
public static void main(String[] args) {
	int i=5;
	System.out.println(i+=10);
	System.out.println(i);
	System.out.println(--i);
	JOptionPane.showConfirmDialog(null, "��ӭ");
	JOptionPane.showInputDialog("������");
	
	JOptionPane.showMessageDialog(null, "����","����",JOptionPane.WARNING_MESSAGE);
//	JOptionPane.showOptionDialog(null, "��ѡ��", null, 2, 1, JOptionPane.WARNING_MESSAGE, null, null);
}
public  void t(int x){
	i=x+10;
}
}
