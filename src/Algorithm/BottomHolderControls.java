package Algorithm;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BottomHolderControls implements ActionListener
{
	@SuppressWarnings("unused")
	private JButton ExitBtn;
	
	public BottomHolderControls(Panel BottomHolder) 
	{
		BottomHolder.add(ExitBtn = ExitBtn_Function());
	}
	
	private JButton ExitBtn_Function()
	{
		JButton eBtn = new JButton("EXIT");
		eBtn.setBounds(296, 0, 100, 40);
		eBtn.setFocusable(false);
		eBtn.setBackground(Color.gray);
		eBtn.addActionListener(this);
		return eBtn;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String command = ((JButton) e.getSource()).getActionCommand();
		if(command.equals("EXIT")) 
		{
			ExitFuntion();
		}
	}
	
	private void ExitFuntion()
	{
		System.exit(0);
	}

}
