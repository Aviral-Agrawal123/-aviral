import javax.swing.*;
import java.awt.event.*;
public class TrafficLight implements ActionListener
{ JLabel tf;
	TrafficLight()
	{ 	
		JFrame f=new JFrame();
		ButtonGroup b=new ButtonGroup();  
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRadioButton r1=new JRadioButton("red");
		JLabel tf=new JLabel("Traffic rules");
		JRadioButton r2=new JRadioButton("green");
		JRadioButton r3=new JRadioButton("yellow");
		r1.setBounds(10,10,100,100);
		tf.setBounds(130,150,100,100);
		r2.setBounds(10,120,100,100);
		r3.setBounds(10,240,100,100);
		f.setSize(800,800);
		f.setLayout(null);
		b.add(r1);
		b.add(r2);
		b.add(r3);
		f.add(r1);
		f.add(r2);
		f.add(r3);f.
		add(tf);
//		r1.addActionListener(this);
//		r2.addActionListener(this);
//		r2.addActionListener(this);
		  r1.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	 tf.setText("Stop here");

		        }
		    });
		  r2.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	 tf.setText("You can go");

		        }
		    });
		  r3.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	 tf.setText("Ready to go");

		        }
		    });

		
	}
public static void main(String args[])
{
	TrafficLight t=new TrafficLight();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
 