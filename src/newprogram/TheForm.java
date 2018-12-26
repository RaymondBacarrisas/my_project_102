package newprogram;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class TheForm implements ActionListener
{
	private int[] myNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	private int[] hiegtnumber = {17, 24, 31, 38, 45, 52, 59, 66, 73, 80};
	private JPanel myPanel1;
	private JPanel myPanel2;
	private JButton jbtnA1;
	private JButton jbtnA2;
	private JButton jbtnA3;
	
	private JLabel jlbval0; 
	private JLabel jlbval1;
	private JLabel jlbval2; 
	private JLabel jlbval3; 
	private JLabel jlbval4;
	private JLabel jlbval5; 
	private JLabel jlbval6; 
	private JLabel jlbval7; 
	private JLabel jlbval8; 
	private JLabel jlbval9;
	
	
	public TheForm()
	{
		myFrame();		
	}
	public JFrame myFrame()
	{
		JFrame jfr1 = new JFrame("activity");	
		jfr1.setVisible(true);
		jfr1.setSize(1366, 768);
		jfr1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jfr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfr1.getContentPane().setBackground(new Color(160, 160, 160));
		jfr1.getContentPane().add(myPanel(), BorderLayout.NORTH);
		return jfr1;	
	}
	
	public JPanel myPanel()
	{
		myPanel1 = new JPanel();
		myPanel1.setLayout(null);
		myPanel1.setPreferredSize(new Dimension(300,100));
		myPanel1.setBackground(new Color(100, 100, 100));
		myPanel1.add(random());
		myPanel1.add(bubbleSort());
		// ------------------- JAVA Label Value 1 ------------------- 
		jlbval0 = new JLabel(String.valueOf(myNumber[0]));
		jlbval0.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval0.setForeground(Color.black);
		jlbval0.setBackground(Color.WHITE);
		jlbval0.setHorizontalAlignment(JLabel.CENTER);
		jlbval0.setVerticalAlignment(JLabel.BOTTOM);
		jlbval0.setOpaque(true);
		jlbval0.setSize(15, 17);
		jlbval0.setLocation(300, 10);
		myPanel1.add(jlbval0);
		// ------------------- JAVA Label Value 2 ------------------- 
		jlbval1 = new JLabel(String.valueOf(myNumber[1]));
		jlbval1.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval1.setForeground(Color.black);
		jlbval1.setBackground(Color.WHITE);
		jlbval1.setHorizontalAlignment(JLabel.CENTER);
		jlbval1.setVerticalAlignment(JLabel.BOTTOM);
		jlbval1.setOpaque(true);
		jlbval1.setSize(15, 24);
		jlbval1.setLocation(320, 10);
		myPanel1.add(jlbval1);		
		// ------------------- JAVA Label Value 3 ------------------- 
		jlbval2 = new JLabel(String.valueOf(myNumber[2]));
		jlbval2.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval2.setForeground(Color.black);
		jlbval2.setBackground(Color.WHITE);
		jlbval2.setHorizontalAlignment(JLabel.CENTER);
		jlbval2.setVerticalAlignment(JLabel.BOTTOM);
		jlbval2.setOpaque(true);
		jlbval2.setSize(15, 31);
		jlbval2.setLocation(340, 10);
		myPanel1.add(jlbval2);		
		// ------------------- JAVA Label Value 4 ------------------- 
		jlbval3 = new JLabel(String.valueOf(myNumber[3]));
		jlbval3.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval3.setForeground(Color.black);
		jlbval3.setBackground(Color.WHITE);
		jlbval3.setHorizontalAlignment(JLabel.CENTER);
		jlbval3.setVerticalAlignment(JLabel.BOTTOM);
		jlbval3.setOpaque(true);
		jlbval3.setSize(15, 38);
		jlbval3.setLocation(360, 10);
		myPanel1.add(jlbval3);		
		// ------------------- JAVA Label Value 5 ------------------- 
		jlbval4 = new JLabel(String.valueOf(myNumber[4]));
		jlbval4.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval4.setForeground(Color.black);
		jlbval4.setBackground(Color.WHITE);
		jlbval4.setHorizontalAlignment(JLabel.CENTER);
		jlbval4.setVerticalAlignment(JLabel.BOTTOM);
		jlbval4.setOpaque(true);
		jlbval4.setSize(15, 45);
		jlbval4.setLocation(380, 10);
		myPanel1.add(jlbval4);		
		// ------------------- JAVA Label Value 6 ------------------- 
		jlbval5 = new JLabel(String.valueOf(myNumber[5]));
		jlbval5.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval5.setForeground(Color.black);
		jlbval5.setBackground(Color.WHITE);
		jlbval5.setHorizontalAlignment(JLabel.CENTER);
		jlbval5.setVerticalAlignment(JLabel.BOTTOM);
		jlbval5.setOpaque(true);
		jlbval5.setSize(15, 52);
		jlbval5.setLocation(400, 10);
		myPanel1.add(jlbval5);		
		// ------------------- JAVA Label Value 7 ------------------- 
		jlbval6 = new JLabel(String.valueOf(myNumber[6]));
		jlbval6.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval6.setForeground(Color.black);
		jlbval6.setBackground(Color.WHITE);
		jlbval6.setHorizontalAlignment(JLabel.CENTER);
		jlbval6.setVerticalAlignment(JLabel.BOTTOM);
		jlbval6.setOpaque(true);
		jlbval6.setSize(15, 59);
		jlbval6.setLocation(420, 10);
		myPanel1.add(jlbval6);		
		// ------------------- JAVA Label Value 8 ------------------- 
		jlbval7 = new JLabel(String.valueOf(myNumber[7]));
		jlbval7.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval7.setForeground(Color.black);
		jlbval7.setBackground(Color.WHITE);
		jlbval7.setHorizontalAlignment(JLabel.CENTER);
		jlbval7.setVerticalAlignment(JLabel.BOTTOM);
		jlbval7.setOpaque(true);
		jlbval7.setSize(15, 66);
		jlbval7.setLocation(440, 10);
		myPanel1.add(jlbval7);		
		// ------------------- JAVA Label Value 9 ------------------- 
		jlbval8 = new JLabel(String.valueOf(myNumber[8]));
		jlbval8.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval8.setForeground(Color.black);
		jlbval8.setBackground(Color.WHITE);
		jlbval8.setHorizontalAlignment(JLabel.CENTER);
		jlbval8.setVerticalAlignment(JLabel.BOTTOM);
		jlbval8.setOpaque(true);
		jlbval8.setSize(15, 73);
		jlbval8.setLocation(460, 10);
		myPanel1.add(jlbval8);		
		// ------------------- JAVA Label Value 10 ------------------ 
		jlbval9 = new JLabel(String.valueOf(myNumber[9]));
		jlbval9.setFont(new Font("Lucida Bright", Font.BOLD, 8));
		jlbval9.setForeground(Color.black);
		jlbval9.setBackground(Color.WHITE);
		jlbval9.setHorizontalAlignment(JLabel.CENTER);
		jlbval9.setVerticalAlignment(JLabel.BOTTOM);
		jlbval9.setOpaque(true);
		jlbval9.setSize(15, 80);
		jlbval9.setLocation(480, 10);
		myPanel1.add(jlbval9);
		//myPanel1.add(myPanelA1(), "EAST");
		return myPanel1;
	}
	
	public JPanel myPanelA1()
	{
		myPanel2 = new JPanel();
		//myPanel2.setLayout(null);
		myPanel2.setBounds(900, 5, 500, 90);
		//myPanel2.setBackground(new Color(10, 10, 10));
		myPanel2.setLocation(400, 10);
		myPanel2.setBackground(Color.BLUE);
		myPanel2.add(monkeyBtn());
		return myPanel2;
	}
	
	public JButton monkeyBtn()
	{
		jbtnA3 = new JButton("R");
		jbtnA3.setSize(30, 30);
		jbtnA3.setBackground(Color.WHITE);
		jbtnA3.setFocusPainted(false);
		jbtnA3.setLocation(10,10);
		jbtnA3.addActionListener(this); 
		return jbtnA3;
	}
	
	public JButton random()
	{
		jbtnA1 = new JButton("Random");
		jbtnA1.setSize(200, 30);
		jbtnA1.setBackground(Color.WHITE);
		jbtnA1.setFocusPainted(false);
		jbtnA1.setLocation(10,10);
		jbtnA1.addActionListener(this); 
		return jbtnA1;
	}
	
	public JButton bubbleSort()
	{
		jbtnA2 = new JButton("Bubble Sort");
		jbtnA2.setSize(200, 30);
		jbtnA2.setBackground(Color.WHITE);
		jbtnA2.setFocusPainted(false);
		jbtnA2.setLocation(10,60);
		jbtnA2.addActionListener(this); 
		return jbtnA2;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String command = ((JButton) e.getSource()).getActionCommand();
		if(command == "Random") { randomA1(); }
		if(command == "Bubble Sort") { bubbesortA1(); }
	}
	
	public void randomA1()
	{
		for(int i = 0; i < myNumber.length; i++)
		{
			int index = (int) (Math.random() * myNumber.length);
			String temp = String.valueOf(myNumber[i]);
			myNumber[i] = myNumber[index];
			myNumber[index] = Integer.parseInt(temp);
		}
		
		// --------------------------- value setting ---------------------------
		jlbval0.setText(String.valueOf(myNumber[0]));
		jlbval1.setText(String.valueOf(myNumber[1]));
		jlbval2.setText(String.valueOf(myNumber[2]));
		jlbval3.setText(String.valueOf(myNumber[3]));
		jlbval4.setText(String.valueOf(myNumber[4]));
		jlbval5.setText(String.valueOf(myNumber[5]));
		jlbval6.setText(String.valueOf(myNumber[6]));
		jlbval7.setText(String.valueOf(myNumber[7]));
		jlbval8.setText(String.valueOf(myNumber[8]));
		jlbval9.setText(String.valueOf(myNumber[9]));
		
		// ------------------------------ random the height ------------------------------
		for(int i = 0; i < hiegtnumber.length; i++)
		{
			int index = (int) (Math.random() * hiegtnumber.length);
			String temp = String.valueOf(hiegtnumber[i]);
			hiegtnumber[i] = hiegtnumber[index];
			hiegtnumber[index] = Integer.parseInt(temp);
		}
		// --------------------------- height setting ---------------------------
		jlbval0.setSize(15, hiegtnumber[0]);
		jlbval1.setSize(15, hiegtnumber[1]);
		jlbval2.setSize(15, hiegtnumber[2]);
		jlbval3.setSize(15, hiegtnumber[3]);
		jlbval4.setSize(15, hiegtnumber[4]);
		jlbval5.setSize(15, hiegtnumber[5]);
		jlbval6.setSize(15, hiegtnumber[6]);
		jlbval7.setSize(15, hiegtnumber[7]);
		jlbval8.setSize(15, hiegtnumber[8]);
		jlbval9.setSize(15, hiegtnumber[9]);
	}
	
	public void bubbesortA1()
	{
		// ------------------------------ random the value ------------------------------
		for(int i = 0; i < myNumber.length; i++)
		{
			for(int j = 0; j < myNumber.length - 1; j++)
			{
				int a = myNumber[j];
				int b = myNumber[j + 1];				
				if(a > b)
				{
					a = a + b;
					b = a - b;
					a = a - b;
					myNumber[j] = a;
					myNumber[j + 1] = b;									
				}
				else
				{
					myNumber[j] = a;
					myNumber[j + 1] = b;				
				}			
			}
		}
		
		// --------------------------- value setting ---------------------------
		jlbval0.setText(String.valueOf(myNumber[0]));
		jlbval1.setText(String.valueOf(myNumber[1]));
		jlbval2.setText(String.valueOf(myNumber[2]));
		jlbval3.setText(String.valueOf(myNumber[3]));
		jlbval4.setText(String.valueOf(myNumber[4]));
		jlbval5.setText(String.valueOf(myNumber[5]));
		jlbval6.setText(String.valueOf(myNumber[6]));
		jlbval7.setText(String.valueOf(myNumber[7]));
		jlbval8.setText(String.valueOf(myNumber[8]));
		jlbval9.setText(String.valueOf(myNumber[9]));

		// ------------------------------ random the value ------------------------------
		for(int i = 0; i < hiegtnumber.length; i++)
		{
			for(int j = 0; j < hiegtnumber.length - 1; j++)
			{
				int a = hiegtnumber[j];
				int b = hiegtnumber[j + 1];				
				if(a > b)
				{
					a = a + b;
					b = a - b;
					a = a - b;
					hiegtnumber[j] = a;
					hiegtnumber[j + 1] = b;									
				}
				else
				{
					hiegtnumber[j] = a;
					hiegtnumber[j + 1] = b;				
				}			
			}
		}
		// --------------------------- value setting ---------------------------
		jlbval0.setSize(15, hiegtnumber[0]);
		jlbval1.setSize(15, hiegtnumber[1]);
		jlbval2.setSize(15, hiegtnumber[2]);
		jlbval3.setSize(15, hiegtnumber[3]);
		jlbval4.setSize(15, hiegtnumber[4]);
		jlbval5.setSize(15, hiegtnumber[5]);
		jlbval6.setSize(15, hiegtnumber[6]);
		jlbval7.setSize(15, hiegtnumber[7]);
		jlbval8.setSize(15, hiegtnumber[8]);
		jlbval9.setSize(15, hiegtnumber[9]);
	}
}
