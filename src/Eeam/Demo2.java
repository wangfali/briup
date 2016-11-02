package Eeam;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JOptionPane;

/*
 * 考试内容
 */
public class Demo2 extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double sum;
	@Override
	public void init() {
		String fristNumber,secondeNumber;
		double number1,number2;
		fristNumber=JOptionPane.showInputDialog("enter firstNumber value");
		secondeNumber=JOptionPane.showInputDialog("enter SecondeNuber value");
		number1=Double.parseDouble(fristNumber);
		number2=Double.parseDouble(secondeNumber);
		sum=number1+number2;
	}
	@Override
	public void paint(Graphics g) {
		g.drawRect(15, 18, 270, 20);
		g.drawString("数组相加之和为"+sum,25 ,25);
	}
}
