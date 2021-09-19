package edu;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Java_Swing2  extends JFrame{

	

	  Java_Swing2()
	  {
	    JButton bt1 = new JButton("Yes");             //Creating a Yes Button.
	    JButton bt2 = new JButton("No");              //Creating a No Button.
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)     //setting close operation.
	    setLayout(new FlowLayout());          //setting layout using FlowLayout object
	    setSize(400, 400);                    //setting size of Jframe
	    add(bt1);             //adding Yes button to frame.
	    add(bt2);             //adding No button to frame.

	    setVisible(true);
	  }
	  public static void main(String[] args)
	  {
	    new Java_Swing2();
	  }
	}

