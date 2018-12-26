package Algorithm;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class BubbleSort implements ActionListener
{
	private Panel busortHolder;
	private Panel BubbleSortWorkPlace1;
	private Panel bSI_Panel1;
	private JButton accessbtn;
	@SuppressWarnings("unused")
	private JButton randomBtn;
	@SuppressWarnings("unused")
	private JButton bubbleBtn;
	private JTextArea titlea;
	private JTextArea definitiona;
	private int[] bubbleVal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
	private int[] bubbleHth = {16, 22, 28, 34, 40, 46, 52, 58, 64, 70, 76, 82, 88, 94, 100, 106, 112, 118, 124, 130, 136, 142, 148, 154, 160, 166, 172, 178, 184, 190};

	public BubbleSort(Panel TopHolder) 
	{
		TopHolder.add(busortHolder = busortHolder_Function());
		busortHolder.add(bSI_Panel1 = bSI_Panel());
	}
	
	private Panel busortHolder_Function()
	{
		Panel bshFn = new Panel();
		bshFn.setLayout(null);
		bshFn.setBounds(3, 3, 390, 300);
		bshFn.setBackground(new Color(100, 100, 100));		
		bshFn.add(accessbtn = accessbtn_Function());
		accessbtn.setText("BUBBLE SORT DEFINITION");
		return bshFn;
	}
	
	private JButton accessbtn_Function()
	{
		JButton abtnFn = new JButton();
		abtnFn.setBounds(2, 2, 386, 30);
		abtnFn.setBackground(Color.DARK_GRAY);
		abtnFn.setForeground(Color.white);
		abtnFn.setSelected(false);
		abtnFn.setFocusable(false);
		abtnFn.addActionListener(this);
		return abtnFn;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String command = ((JButton) e.getSource()).getActionCommand();
		if(command.equals("BUBBLE SORT DEFINITION"))
		{
			busortHolder.remove(bSI_Panel1);
			accessbtn.setText("BUBBLE SORT");
			busortHolder.add(BubbleSortWorkPlace1 = bubblesortworkplace());
			titlea.setText("BUBBLE SORT DEFINITION");
			definitiona.setText("Bubble sort is a sorting algorithm that works by repeatedly stepping through lists that need to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. This passing procedure is repeated until no swaps are required, indicating that the list is sorted. Bubble sort gets its name because smaller elements bubble toward the top of the list.");
		}
		if(command.equals("BUBBLE SORT"))
		{
			busortHolder.remove(BubbleSortWorkPlace1);
			accessbtn.setText("BUBBLE SORT DEFINITION");
			busortHolder.add(bSI_Panel1 = bSI_Panel());
		}
		if(command.equals("RANDOM"))
		{
			randomFunction();
		}
		if(command.equals("BUBBLE_SORT"))
		{
			bubbluSortFunction();
		}
	}
	
	private Panel bubblesortworkplace()
	{
		Panel bswp = new Panel();
		bswp.setLayout(null);
		bswp.setBounds(2, 34, 386, 264);
		bswp.setBackground(Color.DARK_GRAY);
		bswp.add(titlea = bsortdef(20, 0, 40));
		bswp.add(definitiona = bsortdef(12, 40, 346));
		return bswp;
	}
	
	private JTextArea bsortdef(int fontsize1, int y, int height)
	{
		JTextArea def = new JTextArea();
		def.setForeground(Color.WHITE);
		def.setEditable(false);
		def.setLineWrap(true);
		def.setFont(new Font("Lucida Brigth", Font.PLAIN, fontsize1));
		def.setBounds(0, y, 386, height);
		def.setBackground(new Color(100, 100, 100));
		return def;
	}
	
	private Panel bSI_Panel()
	{
		Panel bswp = new Panel();
		bswp.setLayout(null);
		bswp.setBounds(2, 34, 386, 264);
		bswp.setBackground(Color.DARK_GRAY);
		int locx = 13;
		for(int i = 0; i < 30; i++)
		{
			bswp.add(bubbleSortIndicator("label" + i, String.valueOf(i + 1), locx, 200 - bubbleHth[i], bubbleHth[i]));
			locx += 12;
		}
		bswp.add(randomBtn = randomButton(50, "RANDOM"));
		bswp.add(bubbleBtn = randomButton(206, "BUBBLE_SORT"));
		return bswp;
	}
	
	private JLabel bubbleSortIndicator(String myName, String text, int x, int y, int height)
	{
		JLabel bSI = new JLabel();
		bSI.setName(myName);
		bSI.setVerticalAlignment(SwingConstants.TOP);
		bSI.setHorizontalAlignment(SwingConstants.CENTER);
		bSI.setText(text);
		bSI.setOpaque(true);
		bSI.setBounds(x, y, 10, height);
		bSI.setFont(new Font("Lucida Brigth", Font.PLAIN, 8));
		bSI.setBackground(Color.BLACK);
		bSI.setForeground(Color.WHITE);
		return bSI;
	}
	
	private JButton randomButton(int x, String text)
	{
		JButton ranbtn = new JButton();
		ranbtn.setText(text);
		ranbtn.setBounds(x, 225, 130, 30);
		ranbtn.setSelected(false);
		ranbtn.setFocusable(false);
		ranbtn.setBackground(Color.GRAY);
		ranbtn.setForeground(Color.white);
		ranbtn.addActionListener(this);
		return ranbtn;
	}
	
	private void randomFunction()
	{
		//bSI_Panel1
		Component[] comp = bSI_Panel1.getComponents();
		for(int i = 0; i < bubbleVal.length; i++)
		{
			int index = (int) (Math.random() * bubbleVal.length);
			String temp = String.valueOf(bubbleVal[i]);
			bubbleVal[i] = bubbleVal[index];
			bubbleVal[index] = Integer.parseInt(temp);
		}
		
		for(int i = 0; i < bubbleHth.length; i++)
		{
			int index = (int) (Math.random() * bubbleHth.length);
			String temp = String.valueOf(bubbleHth[i]);
			bubbleHth[i] = bubbleHth[index];
			bubbleHth[index] = Integer.parseInt(temp);
		}
		
		
		for(int i = 0; i < 30; i++)
		{
			JLabel myLabel = (JLabel) comp[i];
			myLabel.setText(String.valueOf(bubbleVal[i]));
		}
		
		int locx = 13;
		for(int i = 0; i < 30; i++)
		{
			JLabel myLabel = (JLabel) comp[i];
			myLabel.setBounds(locx,200 - bubbleHth[i], 10, bubbleHth[i]);
			locx += 12;
		}
		
	}
	
	
	private void bubbluSortFunction()
	{
		Component[] comp = bSI_Panel1.getComponents();
		for(int i = 0; i < bubbleVal.length; i++)
		{
			for(int j = 0; j < bubbleVal.length - 1; j++)
			{
				int a = bubbleVal[j];
				int b = bubbleVal[j + 1];				
				if(a > b)
				{
					a = a + b;
					b = a - b;
					a = a - b;
					bubbleVal[j] = a;
					bubbleVal[j + 1] = b;									
				}
				else
				{
					bubbleVal[j] = a;
					bubbleVal[j + 1] = b;				
				}			
			}
		}
		
		for(int i = 0; i < bubbleHth.length; i++)
		{
			for(int j = 0; j < bubbleHth.length - 1; j++)
			{
				int a = bubbleHth[j];
				int b = bubbleHth[j + 1];				
				if(a > b)
				{
					a = a + b;
					b = a - b;
					a = a - b;
					bubbleHth[j] = a;
					bubbleHth[j + 1] = b;									
				}
				else
				{
					bubbleHth[j] = a;
					bubbleHth[j + 1] = b;				
				}			
			}
		}
		
		for(int i = 0; i < 30; i++)
		{
			JLabel myLabel = (JLabel) comp[i];
			myLabel.setText(String.valueOf(bubbleVal[i]));
		}
		
		int locx = 13;
		for(int i = 0; i < 30; i++)
		{
			JLabel myLabel = (JLabel) comp[i];
			myLabel.setBounds(locx,200 - bubbleHth[i], 10, bubbleHth[i]);
			locx += 12;
		}
	}

}
