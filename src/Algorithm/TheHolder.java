package Algorithm;
import java.awt.*;
import javax.swing.*;

public class TheHolder 
{
	
	@SuppressWarnings("unused")
	private Panel TopHolder;
	private Panel BottomHolder;

	@SuppressWarnings("unused")
	public TheHolder(JFrame theFrame) 
	{
		theFrame.getContentPane().add(TopHolder = Holder_Function(2, 2, 396, (int) dim().getHeight() - 48));
		theFrame.getContentPane().add(BottomHolder = Holder_Function(2, (int) dim().getHeight() - 44, 396, 40));
		BubbleSort bs1 = new BubbleSort(TopHolder);
		Palindrome paldrome = new Palindrome(TopHolder);
		BottomHolderControls btmHCtrl = new BottomHolderControls(BottomHolder);
		DateTime dt = new DateTime(BottomHolder);
	}
	
	private Dimension dim()
	{
		Dimension dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		return dim1;
	}
	
	private Panel Holder_Function(int x, int y, int width, int height)
	{
		Panel thf = new Panel();
		thf.setLayout(null);
		thf.setBounds(x, y, width, height);
		thf.setBackground(Color.DARK_GRAY);		
		return thf;
	}
	
	

}
