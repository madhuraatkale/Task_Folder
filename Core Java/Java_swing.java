package edu;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Java_swing {
 
	 JFrame jf = new JFrame("Edubridge Learning Pvt Ltd"); //Creating a JFrame with name MyWindow 
	 JButton btn = new JButton("Rakhi");//Creating a Button named Say Hello 
	 jf.add(btn); //adding button to frame
	 jf.setLayout(new FlowLayout()); //setting layout using FlowLayout object 
	 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 //setting close operation.
	 jf.setSize(400, 400);
	 jf.setVisible(true);
 }
public static void main(String[]args)
{
	new Java_swing();
}
}