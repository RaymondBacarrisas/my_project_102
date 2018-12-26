package Algorithm;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class DateTime 
{
	private JLabel TimeHolder;
	private JLabel DateHolder;
	private JLabel DayOfWeekHolder;
	
	
	public DateTime(Panel BottomHolder) 
	{
		BottomHolder.add(TimeHolder = theLabel(5, 0, 140, 20, 14));	
		BottomHolder.add(DateHolder = theLabel(5, 20, 140, 20, 14));
		BottomHolder.add(DayOfWeekHolder = theLabel(140, 0, 156, 40, 20));
		DayOfWeekHolder.setOpaque(true);
		DayOfWeekHolder.setBackground(new Color(100, 100, 100));
		DayOfWeekHolder.setVerticalAlignment(SwingConstants.CENTER);
		DayOfWeekHolder.setHorizontalAlignment(SwingConstants.CENTER);
		datetime_Function();
	}
	
	private JLabel theLabel(int x, int y, int width, int height, int fontsize)
	{
		JLabel label = new JLabel();
		label.setBounds(x, y, width, height);
		label.setForeground(Color.white);
		label.setFont(new Font("Lucida Bright", Font.PLAIN, fontsize));		
		return label;
	}
	
	private void datetime_Function()
	{
		Thread clock = new Thread()
		{
			public void run()
			{
				for(;;)
				{
					DateFormat df1 = new SimpleDateFormat("hh:mm:ss a");
					DateFormat df2 = new SimpleDateFormat("MMM dd, yyyy");
					DateFormat df3 = new SimpleDateFormat("EEEE");
					Date date = new Date();
					TimeHolder.setText("Time: " + df1.format(date));
					DateHolder.setText("Date: " + df2.format(date));
					DayOfWeekHolder.setText(df3.format(date));
				}
			}
		};
		clock.start();
	}

}
