package Algorithm;
import javax.swing.*;
import java.awt.*;

public class TheForm 
{
	
	public TheForm()
	{
		SwingUtilities.invokeLater(new Runnable() 
		{ 
			@Override public void run() 
			{ 
				MyForm();
			}
		});
	}
	
	@SuppressWarnings("unused")
	private void MyForm()
	{
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();		
		JFrame form = new JFrame();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setBounds((int)dimension.getWidth() - 400, 0, 400, (int)dimension.getHeight());
		form.setUndecorated(true);
		form.getContentPane().setBackground(Color.black);
		form.setOpacity(0.9f);
		form.getContentPane().setLayout(null);
		form.setVisible(true);
		TheHolder th1 = new TheHolder(form);		
	}	
	
}
