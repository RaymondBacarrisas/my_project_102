package my_first_app;
import java.awt.Toolkit;
import javax.swing.*;
public class myForm 
{
	private LogIn_first lif;
	public myForm()
	{
		JFrame jfrm1 = new JFrame("Raymond Application");
		jfrm1.setSize(900, 500);
		jfrm1.setLocationRelativeTo(null);
		jfrm1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jfrm1.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Intern\\Downloads\\arc_reactor.png")); 
		
		//----------- login first --------------------------------------
		lif = new LogIn_first();
		jfrm1.add(lif.loginPanel());
		
		jfrm1.setVisible(true);		
	}
}
