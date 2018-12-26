package Algorithm;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Palindrome implements ActionListener
{
	private JButton changeVewBtn;
	
	public Palindrome(Panel TopHolder) 
	{
		TopHolder.add(theHolder());
	}
	
	private Panel theHolder()
	{
		Panel tholder = new Panel();
		tholder.setLayout(null);
		tholder.setBounds(3, 306, 390, 300);
		tholder.setBackground(new Color(100, 100, 100));	
		tholder.add(changeVewBtn = accessbtn_Function(2, 2, 386, 30, "PALINDROME DEFINITION"));
		return tholder;
	}
	
	private JButton accessbtn_Function(int x, int y, int width, int height, String text)
	{
		JButton abtnFn = new JButton();
		abtnFn.setText(text);
		abtnFn.setBounds(x, y, width, height);
		abtnFn.setBackground(Color.DARK_GRAY);
		abtnFn.setForeground(Color.white);
		abtnFn.setSelected(false);
		abtnFn.setFocusable(false);
		abtnFn.addActionListener(this);
		return abtnFn;
	}
	
	public void actionPeformed(ActionEvent e)
	{
		
	}
	
}
