package Eeam;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.BitSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Demo19 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Demo19(){
		super("BitSets");
		final BitSet sieve=new BitSet(1024); 
		Container c=getContentPane();
		final JLabel status=new JLabel();
		c.add(status,BorderLayout.SOUTH);
		JPanel inputPanel=new JPanel();
		inputPanel.add(new JLabel("从1至1023"+"输入值："));
		final JTextField input=new JTextField(10);
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int val=Integer.parseInt(input.getText());
			if(sieve.get(val))
				status.setText(val+"这是第一个素数");
			else
				status.setText(val+"不是一个素数");
			}
		});
		inputPanel.add(input);
		c.add(inputPanel,BorderLayout.NORTH);
		JTextArea primes=new JTextArea();
		ScrollPane p=new ScrollPane();
		p.add(primes);
		c.add(p,BorderLayout.CENTER);
		int size=sieve.size();
		for(int i=1;i<size;i++)
		sieve.set(i);
		int finalBit=(int)Math.sqrt(sieve.size());
		for(int i=2;i<finalBit;i++)
			if(sieve.get(i))
				for(int j=2*i;j<size;j+=i)
					sieve.clear(j);
		int counter=0;
		for(int i=1;i<size;i++)
			if(sieve.get(i)){
				primes.append(String.valueOf(i));
				primes.append(++counter%7==0?"\n":"\t");
			}
	setSize(300,200);
	show();
	}
	public static void main(String[] args) {
		Demo19 app=new Demo19();
		app.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}
